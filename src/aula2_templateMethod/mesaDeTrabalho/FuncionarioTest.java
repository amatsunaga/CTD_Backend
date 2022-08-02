package aula2_templateMethod.mesaDeTrabalho;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    void calculos() {
        Funcionario funcionario = new FuncionarioEfetivo("Odair", "Antunes", "123456", 3000.0, 1000.0, 500.0);
        funcionario.pagamentoSalario();

        funcionario = new FuncionarioContratado("Marlene", "Peixoto", "98765", 50, 50.0);
        funcionario.pagamentoSalario();

    }
}