package aula8_facadePattern.ex_descontos.service.impl;

import aula8_facadePattern.ex_descontos.model.Cartao;
import aula8_facadePattern.ex_descontos.model.Produto;
import aula8_facadePattern.ex_descontos.service.IDescontoFacade;

public class DescontoFacade implements IDescontoFacade {

    @Override
    public int calcularDesconto(Produto produto, Cartao cartao, int quantidade) {
        int descontoTotal = ApiCartao.descontoCartao(cartao) +
        ApiProduto.descontoProduto(produto) +
        ApiQuantidade.descontoQuantidade(quantidade);

        System.out.println("Desconto total: " + descontoTotal + "%.");
        return descontoTotal;
    }
}
