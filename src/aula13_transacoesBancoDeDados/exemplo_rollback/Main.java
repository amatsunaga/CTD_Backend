package aula13_transacoesBancoDeDados.exemplo_rollback;

import java.sql.*;

public class Main {
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO"
            + "("
            + "Id INT PRIMARY KEY, "
            + "Nome VARCHAR(100) NOT NULL, "
            + "Email VARCHAR(100) NOT NULL, "
            + "Saldo NUMERIC(15,2) NOT NULL"
            + ");";

    private static final String sqlInsert = "INSERT INTO USUARIO(Id, Nome, Email, Saldo) VALUES(?, ?, ? , ?);";

    private static final String sqlUpdate = "UPDATE USUARIO SET Saldo=? WHERE Email=?;";


    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario("Pedro", "pedro@dh.com", 10.0);

        Connection connection = null;

        try {
            connection = getConnection();

            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            PreparedStatement psInsert = connection.prepareStatement(sqlInsert);
            psInsert.setInt(1, 1);
            psInsert.setString(2, usuario.getNome());
            psInsert.setString(3, usuario.getEmail());
            psInsert.setDouble(4, usuario.getSaldo());

            psInsert.execute();

            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(sqlUpdate);
            psUpdate.setDouble(1, usuario.aumentarSaldo(10.0));
            psUpdate.setString(2, usuario.getEmail());
            psUpdate.execute();
            int a = 4/0;

            connection.commit();

            connection.setAutoCommit(true);

            String sql = "SELECT * FROM USUARIO;";
            Statement stat = connection.createStatement();
            ResultSet result = stat.executeQuery(sql);

            while(result.next()) {
                System.out.printf("Id: %d | Nome: %s | Email: %s | Saldo: R$ %.2f%n", result.getInt(1), result.getString(2), result.getString(3), result.getDouble(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }

        Connection cn = getConnection();
        String sql = "SELECT * FROM USUARIO;";
        Statement stat = cn.createStatement();
        ResultSet result = stat.executeQuery(sql);

        while(result.next()) {
            System.out.printf("Id: %d | Nome: %s | Email: %s | Saldo: R$ %.2f%n", result.getInt(1), result.getString(2), result.getString(3), result.getDouble(4));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");

        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
