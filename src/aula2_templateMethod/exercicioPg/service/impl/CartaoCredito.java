package aula2_templateMethod.exercicioPg.service.impl;

import aula2_templateMethod.exercicioPg.service.Cartao;

public class CartaoCredito extends Cartao {
    private double limite;
    private double saldoUtilizado;

    @Override
    public void autorizarTransacao(double valor) {
        if(saldoUtilizado + valor <= limite) {
            System.out.println("Transação de crédito autorizada");
        }
    }
}
