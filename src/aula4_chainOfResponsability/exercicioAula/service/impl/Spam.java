package aula4_chainOfResponsability.exercicioAula.service.impl;

import aula4_chainOfResponsability.exercicioAula.service.Mail;
import aula4_chainOfResponsability.exercicioAula.service.Departamento;

public class Spam extends Departamento {
    @Override
    public void verificarDestino(Mail mail) {
        System.out.println("Marcado como SPAM");
    }
}
