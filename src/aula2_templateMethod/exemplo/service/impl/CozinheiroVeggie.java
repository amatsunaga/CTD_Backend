package aula2_templateMethod.exemplo.service.impl;

import aula2_templateMethod.exemplo.service.Cozinheiro;

public class CozinheiroVeggie extends Cozinheiro {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando tomate e brócolis");
    }

    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionando ingredientes");

    }
}
