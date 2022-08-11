package aula11_bancoDeDados.ex_animais;

import aula11_bancoDeDados.ex_animais.jdbc.AnimalConnectionDB;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnimalMain {

    private static final Logger logger = Logger.getLogger(AnimalMain.class);

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Animal; CREATE TABLE Animal(Id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, Nome VARCHAR(255) NOT NULL, Tipo VARCHAR(255) NOT NULL);";

    private static final String sqlInsertValue1 = "INSERT INTO Animal(Nome, Tipo) VALUES ('Buchecha', 'Cachorro');";
    private static final String sqlInsertValue2 = "INSERT INTO Animal(Nome, Tipo) VALUES ('Brownie', 'Cachorro');";
    private static final String sqlInsertValue3 = "INSERT INTO Animal(Nome, Tipo) VALUES ('Flora', 'Gato');";
    private static final String sqlInsertValue4 = AnimalMain.insertAnimal("Pé de Pano", "Cavalo");
    private static final String sqlInsertValue5 = AnimalMain.insertAnimal("Dumbo", "Elefante");
    private static final String sqlQuery = "SELECT * FROM Animal;";
    private static final String sqlDeleteQuery = "DELETE FROM Animal WHERE ID=2;";

    public static String insertAnimal(String nome, String tipo) {
        return "INSERT INTO Animal(Tipo, Nome) VALUES ('" + nome + "', '" + tipo + "');";
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try {
            connection = AnimalConnectionDB.getConnection();
            logger.info("Banco de dados conectado");

            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);
            logger.info("Tabela Animal criada");

            statement.execute(sqlInsertValue1);
            logger.info("Animal inserido na tabela");

            statement.execute(sqlInsertValue2);
            logger.info("Animal inserido na tabela");

            statement.execute(sqlInsertValue3);
            logger.info("Animal inserido na tabela");

            statement.execute(sqlInsertValue4);
            logger.info("Animal inserido na tabela");

            statement.execute(sqlInsertValue5);
            logger.info("Animal inserido na tabela");

            ResultSet resultSet = statement.executeQuery(sqlQuery);

            logger.info("Imprimindo os 5 animais");
            while(resultSet.next()) {
                System.out.printf("id: %d; nome: %s; tipo: %s%n", resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
            }

            statement.execute(sqlDeleteQuery);
            logger.info("Animal deletado da tabela");

            resultSet = statement.executeQuery(sqlQuery);

            logger.info("Imprimindo os 4 animais");
            while(resultSet.next()) {
                System.out.printf("id: %d; nome: %s; tipo: %s%n", resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
            }

        } catch (Exception e) {
            logger.error("Erro de conexão");
            e.printStackTrace();
        } finally {
            if (connection == null) {
                logger.info("Conexão fechada");
                return;
            }
            connection.close();
        }
    }
}
