package aula2_templateMethod.exercicioPg.service.impl;

import aula2_templateMethod.exercicioPg.service.Cartao;
import aula2_templateMethod.exercicioPg.service.Processador;

public class ProcessadorDebito extends Processador {
    @Override
    protected void processarPagamento(Cartao cartao, double valor) {
        this.validarDataVencimento(cartao);
        cartao.autorizarTransacao(valor);
    }
}
