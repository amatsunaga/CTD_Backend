package aula13_transacoesBancoDeDados.ex_paciente.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class PacienteConnection {

    public static final Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
