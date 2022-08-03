package aula4_chainOfResponsability.exercicioAula.service.impl;

import aula4_chainOfResponsability.exercicioAula.service.Mail;
import aula4_chainOfResponsability.exercicioAula.service.Departamento;

public class Tecnico extends Departamento {

    @Override
    public void verificarDestino(Mail mail) {
        if(mail.getDestino().equalsIgnoreCase("tecnica@colmeia.com") || mail.getAssunto().equalsIgnoreCase("Técnico")) {
            System.out.println("Encaminhado ao Departamento Técnico");
        } else if (this.getNextDepartamento() != null) {
            this.getNextDepartamento().verificarDestino(mail);
        }
    }
}
