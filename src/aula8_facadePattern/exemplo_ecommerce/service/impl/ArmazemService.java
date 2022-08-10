package aula8_facadePattern.exemplo_ecommerce.service.impl;

import aula8_facadePattern.exemplo_ecommerce.model.Produto;

import java.util.List;

public class ArmazemService {
    private List<Produto> produtos;

    public ArmazemService(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Produto buscarProduto(String produtoId, Integer quantidade) {
        Produto produto = null;
        for (Produto p : this.produtos) {
            if (p.getProdutoId().equals(produtoId) && p.getQuantidade() >= quantidade)
                produto = p;
            p.setQuantidade(p.getQuantidade() - quantidade); // atualizamos a quantidade
            produto.setQuantidade(quantidade);
        }

        return produto;
    }
}
