package aula13_transacoesBancoDeDados.ex_paciente;

import aula13_transacoesBancoDeDados.ex_paciente.jdbc.PacienteConnection;
import aula13_transacoesBancoDeDados.ex_paciente.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.*;

public class PacienteMain {
    private static final Logger logger = Logger.getLogger(PacienteMain.class);

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS PACIENTE; CREATE TABLE PACIENTE"
            + "("
            + "Id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, "
            + "Nome VARCHAR(100) NOT NULL, "
            + "Sobrenome VARCHAR(100) NOT NULL, "
            + "Endereco VARCHAR(255), "
            + "Rg VARCHAR(20) NOT NULL, "
            + "DataCadastro DATE, "
            + "NomeUsuario VARCHAR(20) NOT NULL, "
            + "Senha VARCHAR(20) NOT NULL"
            + ");";

    private static final String sqlInsert = "INSERT INTO PACIENTE(Nome, Sobrenome, Endereco, Rg, DataCadastro, NomeUsuario, Senha) VALUES (?, ?, ?, ?, ?, ?, ?);";

    private static final String sqlUpdate = "UPDATE PACIENTE SET Senha=? WHERE NomeUsuario=?;";

    private static final String sqlQuery = "SELECT * FROM PACIENTE;";

    public static void main(String[] args) throws Exception {

        Paciente paciente = new Paciente("Luiza", "Ferreira", "Av. Brasil, 255", "987654321", "usuarioOriginal", "senhaOriginal");

        Connection connection = null;

        try {
            connection = PacienteConnection.getConnection();
            logger.info("Conectado ao banco de dados");

            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            PreparedStatement psInsert = connection.prepareStatement(sqlInsert);
//            (Nome, Sobrenome, Endereco, Rg, DataCadastro, NomeUsuario, Senha)
            psInsert.setString(1, paciente.getNome());
            psInsert.setString(2, paciente.getSobrenome());
            psInsert.setString(3, paciente.getEndereco());
            psInsert.setString(4, paciente.getRg());
            psInsert.setDate(5, Date.valueOf(paciente.getDataCadastro()));
            psInsert.setString(6, paciente.getNomeUsuario());
            psInsert.setString(7, paciente.getSenha());
            int linhasInsert = psInsert.executeUpdate();
            logger.info(linhasInsert + " linha(s) inserida(s)");

            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(sqlUpdate);
            psUpdate.setString(1, "senhaNova");
            psUpdate.setString(2, "usuarioInexistente");
            int linhasUpdate = psUpdate.executeUpdate();
            logger.info(linhasUpdate + " linha(s) atualizada(s)");

            connection.commit();

            connection.setAutoCommit(true);

            ResultSet rs = statement.executeQuery(sqlQuery);
            // (Id, Nome, Sobrenome, Endereco, Rg, DataCadastro, NomeUsuario, Senha)

            System.out.println("\nTabela PACIENTE");
            while (rs.next()) {
                System.out.printf("Id %d, %s %s, endereço '%s', RG %s, data de cadastro %td/%tm/%tY, nome de usuário '%s', senha '%s'.%n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getDate(6), rs.getDate(6), rs.getString(7), rs.getString(8));
            }


        } catch (Exception e) {
            if (connection == null) {
                logger.error("Conexão falhou");
            }
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }
    }


}
