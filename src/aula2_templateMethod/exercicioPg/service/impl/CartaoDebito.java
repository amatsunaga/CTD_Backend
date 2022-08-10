package aula2_templateMethod.exercicioPg.service.impl;

import aula2_templateMethod.exercicioPg.service.Cartao;

public class CartaoDebito extends Cartao {
    private double saldoDisponivel;

    @Override
    public void autorizarTransacao(double valor) {
        if(this.saldoDisponivel > valor) {
            System.out.println("Transação de débito autorizada");
        }
    }
}
