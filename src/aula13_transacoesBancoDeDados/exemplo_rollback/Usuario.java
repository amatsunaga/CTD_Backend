package aula13_transacoesBancoDeDados.exemplo_rollback;

public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private double saldo;

    public double aumentarSaldo(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public Usuario(String nome, String email, double saldo) {
        this.nome = nome;
        this.email = email;
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
