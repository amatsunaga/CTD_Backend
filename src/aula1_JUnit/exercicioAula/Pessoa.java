package aula1_JUnit.exercicioAula;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    List<String> maioresDeIdadeENomesCurtos = new ArrayList<>();

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int validaIdade() {
        LocalDate hoje = LocalDate.now();
        int idade = Period.between(this.dataNascimento, hoje).getYears();
        return idade;
    }

    public void addNome(Pessoa p) {
        boolean maiorDeIdade = p.validaIdade() >= 18;
        int qtdCaracteres = p.getNome().length();
        boolean nomeCurto = qtdCaracteres >= 5;

        if(maiorDeIdade && nomeCurto) {
            this.maioresDeIdadeENomesCurtos.add(p.getNome());
            System.out.println(this.maioresDeIdadeENomesCurtos);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
