package aula2_templateMethod.mesaDeTrabalho;

import java.util.ArrayList;
import java.util.List;

public class CardapioVegetariano extends Cardapio {
    private double embalagemEspecial;
    private String adicionais;

    @Override
    protected void montarEmbalagem() {
        System.out.println("Montando embalagem especial...");
    }

    @Override
    protected void calcularCusto() {
        System.out.println("Preço total: " + ((this.precoBase * 1.01) + this.embalagemEspecial));
    }

    @Override
    protected void exibirMensagem() {
        System.out.println("ADICIONAL: condimentos!");
    }

    public CardapioVegetariano(double precoBase, double embalagemEspecial) {
        super(precoBase);
        this.embalagemEspecial = embalagemEspecial;
    }
}
