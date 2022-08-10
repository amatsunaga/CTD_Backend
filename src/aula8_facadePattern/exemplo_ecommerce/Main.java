package aula8_facadePattern.exemplo_ecommerce;

import aula8_facadePattern.exemplo_ecommerce.model.Cartao;
import aula8_facadePattern.exemplo_ecommerce.model.Endereco;
import aula8_facadePattern.exemplo_ecommerce.model.Produto;
import aula8_facadePattern.exemplo_ecommerce.service.ICompraService;
import aula8_facadePattern.exemplo_ecommerce.service.impl.ArmazemService;
import aula8_facadePattern.exemplo_ecommerce.service.impl.CompraService;
import aula8_facadePattern.exemplo_ecommerce.service.impl.EnvioService;
import aula8_facadePattern.exemplo_ecommerce.service.impl.PgtoService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Produto produtoUm = new Produto("1",5,1000,"Mouse");
        Produto produtoDois = new Produto("2",5,3000,"Teclado");
        Cartao cartao = new Cartao("1111222233334444","012","2025/07/09");

        Endereco endereco = new Endereco("Av Morumbi","1500","14280000","Morumbi","São Paulo");
        ICompraService compraService = new CompraService(new ArmazemService(Arrays.asList(produtoUm,produtoDois)),new PgtoService(),new EnvioService());

        compraService.processarCompra("1",3, cartao, endereco);
    }
}
