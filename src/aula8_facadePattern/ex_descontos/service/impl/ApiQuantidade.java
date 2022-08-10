package aula8_facadePattern.ex_descontos.service.impl;

public class ApiQuantidade {
    public static int descontoQuantidade(int quantidade) {
        if (quantidade > 12) {
            return 15;
        }
        return 0;
    }
}
