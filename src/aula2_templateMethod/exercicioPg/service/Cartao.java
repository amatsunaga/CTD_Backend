package aula2_templateMethod.exercicioPg.service;

import java.time.LocalDate;

public abstract class Cartao {
    private String numerosFrente;
    private String codigoSeguranca;
    private LocalDate dataValidade;

    public abstract void autorizarTransacao(double valor);


    public String getNumerosFrente() {
        return numerosFrente;
    }

    public void setNumerosFrente(String numerosFrente) {
        this.numerosFrente = numerosFrente;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
