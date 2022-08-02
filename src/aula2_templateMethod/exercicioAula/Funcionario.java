package aula2_templateMethod.exercicioAula;

public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String numeroConta;

    public void pagamentoSalario() {
        double quantia;
        quantia = this.calcularSalario();
        imprimirRecibo(quantia);
        depositar(quantia);
    }

    public abstract double calcularSalario();

    public abstract void imprimirRecibo(double quantia);

    public abstract void depositar(double quantia);

    public Funcionario(String nome, String sobrenome, String numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
    }
}
