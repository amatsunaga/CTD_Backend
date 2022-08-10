package aula8_facadePattern.ex_descontos;

import aula8_facadePattern.ex_descontos.model.Cartao;
import aula8_facadePattern.ex_descontos.model.Produto;
import aula8_facadePattern.ex_descontos.service.impl.DescontoFacade;

public class DescontoMain {
    public static void main(String[] args) {
        DescontoFacade facade = new DescontoFacade();

        facade.calcularDesconto(new Produto("Leite em pó", "Garrafa"), new Cartao("1234567890", "Star Bank"), 13);
    }
}
