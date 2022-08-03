package aula2_templateMethod.mesaDeTrabalho;

public abstract class Cardapio {
    protected double precoBase;

    public void prepararMenu() {
        exibirMensagem();
        montarEmbalagem();
        calcularCusto();
    }

    protected abstract void montarEmbalagem();

    protected abstract void calcularCusto();

    protected abstract void exibirMensagem();

    public Cardapio(double precoBase) {
        this.precoBase = precoBase;
    }
}
