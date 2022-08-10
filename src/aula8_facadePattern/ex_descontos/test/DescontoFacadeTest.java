package aula8_facadePattern.ex_descontos.test;

import aula8_facadePattern.ex_descontos.model.Cartao;
import aula8_facadePattern.ex_descontos.model.Produto;
import aula8_facadePattern.ex_descontos.service.impl.ApiCartao;
import aula8_facadePattern.ex_descontos.service.impl.DescontoFacade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescontoFacadeTest {

    DescontoFacade facade;
    Cartao cartao;
    Produto produto;

    @BeforeEach
    void doBefore() {
        facade = new DescontoFacade();
        cartao = new Cartao("0987654321", "Star Bank");
        produto = new Produto("Arroz", "Pacote");
    }

    @Test
    @DisplayName("Executando teste de validação do desconto do banco do cartão")
    void validarDescontoCartaoTest() {
        int desconto = facade.calcularDesconto(produto, cartao, 5);
        assertEquals(20, desconto);
    }

    @Test
    @DisplayName("Executando teste de validação do desconto por tipo de produto")
    void validarDescontoProdutoTest() {
        produto.setTipo("lata");
        cartao.setBanco("NuBank");

        int desconto = facade.calcularDesconto(produto, cartao, 5);
        assertEquals(10, desconto);
    }

    @Test
    @DisplayName("Executando teste de validação do desconto por quantidade")
    void validarDescontoQuantidadeTest() {
        produto.setTipo("pacote");
        cartao.setBanco("NuBank");

        int desconto = facade.calcularDesconto(produto, cartao, 13);
        assertEquals(15, desconto);
    }

    @Test
    @DisplayName("Executando teste de validação com todos os descontos")
    void validarDescontoTotalTest() {
        produto.setTipo("lata");

        int desconto = facade.calcularDesconto(produto, cartao, 13);
        assertEquals(45, desconto);
    }

    @Test
    @DisplayName("Executando teste de validação sem nenhum desconto")
    void validarDescontoZeroTest() {
        cartao.setBanco("NuBank");

        int desconto = facade.calcularDesconto(produto, cartao, 5);
        assertEquals(0, desconto);
    }
}