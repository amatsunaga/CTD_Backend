package aula2_templateMethod.mesaDeTrabalho;

public class FuncionarioContratado extends Funcionario {
    private int qtdHoras;
    private double valorPorHora;

    public FuncionarioContratado(String nome, String sobrenome, String numeroConta, int qtdHoras, double valorPorHora) {
        super(nome, sobrenome, numeroConta);
        this.qtdHoras = qtdHoras;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return qtdHoras * valorPorHora;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Recibo digital - PJ: R$ " + quantia + ".");
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Depositado em conta bancária: R$ " + quantia + ".");
    }
}
