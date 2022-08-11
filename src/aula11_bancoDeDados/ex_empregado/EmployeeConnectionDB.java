package aula11_bancoDeDados.ex_empregado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeConnectionDB {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");

        Connection c = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

        Statement s = c.createStatement();

        String sqlCreateTable = "DROP TABLE EMPLOYEE IF EXISTS; CREATE TABLE EMPLOYEE(ID INT PRIMARY KEY NOT NULL, NOME VARCHAR(255), IDADE INT, EMPRESA VARCHAR(255), DATA_ADMISSAO DATE)";
        s.execute(sqlCreateTable);

        String insert1 = "INSERT INTO EMPLOYEE(ID, NOME, IDADE, EMPRESA, DATA_ADMISSAO) VALUES(1, 'José Valdez', 34, 'Digital House', '2017-05-22')";
        s.execute(insert1);

        String insert2 = "INSERT INTO EMPLOYEE(ID, NOME, IDADE, EMPRESA, DATA_ADMISSAO) VALUES(2, 'Maria Pereira', 56, 'Google', '2015-01-31')";
        s.execute(insert2);

        String insert3 = "INSERT INTO EMPLOYEE(ID, NOME, IDADE, EMPRESA, DATA_ADMISSAO) VALUES(3, 'Rodrigo Lima', 27, 'Facebook', '2021-12-12')";
        s.execute(insert3);

        String sqlRead = "SELECT * FROM EMPLOYEE";
        ResultSet rs = s.executeQuery(sqlRead);

        while(rs.next()) {
            System.out.printf("Id %d - %s, %d anos, empresa: %s, data de admissão: %s.%n", rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDate(5) );
        }

    }


}
