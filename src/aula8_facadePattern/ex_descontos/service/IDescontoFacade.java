package aula8_facadePattern.ex_descontos;

import aula8_facadePattern.ex_descontos.model.Cartao;
import aula8_facadePattern.ex_descontos.model.Produto;

public interface IDesconto {
    int calcularDesconto(Produto produto, Cartao cartao, int quantidade);
}
