package aula11_bancoDeDados.ex_animais.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class AnimalConnectionDB {
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();

        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
