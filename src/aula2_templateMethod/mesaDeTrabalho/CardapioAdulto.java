package aula2_templateMethod.mesaDeTrabalho;

public class CardapioAdulto extends Cardapio {

    @Override
    protected void montarEmbalagem() {
        System.out.println("Montando embalagem padrão...");
    }

    @Override
    protected void calcularCusto() {
        System.out.println("Preço total: " + this.precoBase);
    }

    @Override
    protected void exibirMensagem() {
        System.out.println("Pedido sem adicionais");
    }

    public CardapioAdulto(double precoBase) {
        super(precoBase);
    }
}
