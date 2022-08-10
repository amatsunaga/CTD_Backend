package aula8_facadePattern.exemplo_ecommerce.service;

import aula8_facadePattern.exemplo_ecommerce.model.Cartao;
import aula8_facadePattern.exemplo_ecommerce.model.Endereco;

public interface ICompraService {

    public void processarCompra(String produtoId, Integer quantidade, Cartao cartao, Endereco endereco);
}
