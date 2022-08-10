package aula8_facadePattern.ex_descontos.service;

import aula8_facadePattern.ex_descontos.model.Cartao;
import aula8_facadePattern.ex_descontos.model.Produto;

public interface IDescontoFacade {
    int calcularDesconto(Produto produto, Cartao cartao, int quantidade);
}
