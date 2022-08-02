package aula4_chainOfResponsability.exercicioPg.service;

public class Documento {
    public String conteudo;
    public Integer tipo;

    public String getConteudo() {
        return conteudo;
    }

    public Documento(String conteudo, Integer tipo) {
        this.conteudo = conteudo;
        this.tipo = tipo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
}
