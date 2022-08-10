package aula8_facadePattern.ex_descontos.service.impl;

import aula8_facadePattern.ex_descontos.model.Cartao;

public class ApiCartao {
    public static int descontoCartao(Cartao cartao) {

        if(cartao.getBanco().equalsIgnoreCase("Star Bank")) {
            return 20;
        }
        return 0;
    }
}
