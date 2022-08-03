package aula4_chainOfResponsability.exercicioAula.service.impl;

import aula4_chainOfResponsability.exercicioAula.service.Mail;
import aula4_chainOfResponsability.exercicioAula.service.Departamento;

public class Gerencial extends Departamento {

    @Override
    public void verificarDestino(Mail mail) {
        if (mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com") || mail.getAssunto().equalsIgnoreCase("Gerência")) {
            System.out.println("Encaminhado à Gerência");
        } else if (this.getNextDepartamento() != null) {
            this.getNextDepartamento().verificarDestino(mail);
        }
    }
}