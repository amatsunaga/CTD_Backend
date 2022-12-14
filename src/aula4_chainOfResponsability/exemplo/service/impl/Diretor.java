package aula4_chainOfResponsability.exemplo.service.impl;

import aula4_chainOfResponsability.exemplo.service.FuncionarioBanco;

public class Diretor extends FuncionarioBanco {
    @Override
    public void processarSolicitacao(Integer quantia) {
        if (quantia > 200000)
            System.out.println("Eu estou encarregado de administrar isso. Diretor");
        else if (this.seguinteFuncionario != null)
            this.seguinteFuncionario.processarSolicitacao(quantia);
    }
}
