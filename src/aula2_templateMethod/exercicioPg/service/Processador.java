package aula2_templateMethod.exercicioPg.service;

import java.time.LocalDate;

public abstract class Processador {

    protected abstract void processarPagamento(Cartao cartao, double valor);

    protected boolean validarDataVencimento(Cartao cartao) {
        LocalDate hoje = LocalDate.now();
        return cartao.getDataValidade().isAfter(hoje);
    }
}
