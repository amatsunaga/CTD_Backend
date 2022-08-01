package aula1_JUnit.exercicio;

public class Person {
    private String nome;
    private String sobrenome;
    private String email;
    private int idade;

    public String exibirNomeCompleto() {
        return(sobrenome + ", " + nome);
    }

    public boolean maiorDeIdade() {
        return this.idade > 18;
    }

    public Person(String nome, String sobrenome, String email, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.idade = idade;
    }
}
