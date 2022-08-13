package aula11_conexaoBancoDeDados.ex_figura;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    private static final String sqlCreateDatabase = "DROP TABLE IF EXISTS Figura; CREATE TABLE Figura(Id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, Tipo VARCHAR(100), Cor VARCHAR(100));";

    private static final String sqlInsert1 = "INSERT INTO Figura(Tipo, Cor) VALUES('Círculo', 'Vermelho');";

    private static final String sqlInsert2 = "INSERT INTO Figura(Tipo, Cor) VALUES('Círculo', 'Verde');";

    private static final String sqlInsert3 = "INSERT INTO Figura(Tipo, Cor) VALUES('Quadrado', 'Vermelho');";

    private static final String sqlInsert4 = "INSERT INTO Figura(Tipo, Cor) VALUES('Quadrado', 'Verde');";

    private static final String sqlInsert5 = "INSERT INTO Figura(Tipo, Cor) VALUES('Quadrado', 'Azul');";

    private static final String sqlInsert6 = "INSERT INTO Figura(Tipo, Cor) VALUES('Círculo', 'Vermelho');";

    private static final String sqlQuery1 = "SELECT * FROM Figura WHERE Tipo='Círculo' AND Cor='Vermelho'";

    private static final String sqlQuery2 = "SELECT * FROM Figura";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try {
            connection = ConexaoJdbc.getConnection();
            logger.info("Banco de dados conectado");

            Statement statement = connection.createStatement();

            statement.execute(sqlCreateDatabase);
            logger.info("Tabela criada");

            statement.execute(sqlInsert1);
            logger.info("Figura inserida");

            statement.execute(sqlInsert2);
            logger.info("Figura inserida");

            statement.execute(sqlInsert3);
            logger.info("Figura inserida");

            statement.execute(sqlInsert4);
            logger.info("Figura inserida");

            statement.execute(sqlInsert5);
            logger.info("Figura inserida");

            statement.execute(sqlInsert6);
            logger.info("Figura inserida");

            ResultSet resultSet = statement.executeQuery(sqlQuery1);

            logger.info("Imprimindo apenas círculos vermelhos");
            while(resultSet.next()) {
                System.out.printf("Id: %d; tipo: %s; cor: %s%n", resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
//                System.out.println("Id: " + resultSet.getInt("Id") + "; Tipo: " + resultSet.getString("Tipo") + "; Cor: " + resultSet.getString("Cor"));
            }

            resultSet = statement.executeQuery(sqlQuery2);

            logger.info("Imprimindo todas as figuras");
            while(resultSet.next()) {
                System.out.printf("Id: %d; tipo: %s; cor: %s%n", resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
//                System.out.println("Id: " + resultSet.getInt("Id") + "; Tipo: " + resultSet.getString("Tipo") + "; Cor: " + resultSet.getString("Cor"));
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
