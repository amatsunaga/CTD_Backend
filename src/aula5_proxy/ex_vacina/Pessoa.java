package aula5_proxy.ex_Vacina;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String rg;
    private LocalDate dataAgendamento;
    private String nomeVacina;

    public Pessoa(String nome, String sobrenome, String rg, LocalDate dataAgendamento, String nomeVacina) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataAgendamento = dataAgendamento;
        this.nomeVacina = nomeVacina;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDate dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }
}
