package aula2_templateMethod.mesaDeTrabalho;

public class CardapioInfantil extends Cardapio {
    private double presenteSurpresa;

    @Override
    protected void montarEmbalagem() {
        System.out.println("Montando embalagem com presente surpresa...");
    }

    @Override
    protected void calcularCusto() {
        System.out.println("Preço total: " + (this.precoBase + presenteSurpresa));
    }

    @Override
    protected void exibirMensagem() {
        System.out.println("ADICIONAL: presente surpresa!");
    }

    public CardapioInfantil(double precoBase, double presenteSurpresa) {
        super(precoBase);
        this.presenteSurpresa = presenteSurpresa;
    }
}
