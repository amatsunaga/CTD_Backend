package aula8_facadePattern.ex_descontos.service.impl;

import aula8_facadePattern.ex_descontos.model.Produto;

public class ApiProduto {
    public static int descontoProduto(Produto produto) {
        if(produto.getTipo().equalsIgnoreCase("Lata")) {
            return 10;
        }
        return 0;
    }
}
