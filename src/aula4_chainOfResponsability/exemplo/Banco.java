package aula4_chainOfResponsability.exemplo;

import aula4_chainOfResponsability.exemplo.service.FuncionarioBanco;
import aula4_chainOfResponsability.exemplo.service.impl.*;

public class Banco {

    public static void main(String[] args) {

        FuncionarioBanco handlerBase = new ExecutivoDeConta().setSeguinteFuncionario(new Gerente().setSeguinteFuncionario(new Diretor()));

        handlerBase.processarSolicitacao(78000);

    }
}
