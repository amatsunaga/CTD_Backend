package aula4_chainOfResponsability.exercicioAula.service.impl;

import aula4_chainOfResponsability.exercicioAula.service.Mail;
import aula4_chainOfResponsability.exercicioAula.service.Departamento;

public class Comercial extends Departamento {

    @Override
    public void verificarDestino(Mail mail) {
        if(mail.getDestino().equalsIgnoreCase("comercial@colmeia.com") || mail.getAssunto().equalsIgnoreCase("Comercial")) {
            System.out.println("Encaminhado ao Departamento Comercial");
        } else if(this.getNextDepartamento() != null){
            this.getNextDepartamento().verificarDestino(mail);
        }
    }
}
