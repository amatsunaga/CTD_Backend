package aula2_templateMethod.exemplo.service.impl;

import aula2_templateMethod.exemplo.service.Cozinheiro;

public class CozinheiroNoVeggie extends Cozinheiro {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando fatias de carne, queijo e presunto...");
    }

    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionando os ingredientes");
    }
}
