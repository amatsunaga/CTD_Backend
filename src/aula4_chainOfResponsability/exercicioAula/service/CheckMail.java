package aula4_chainOfResponsability.exercicioAula.service;

import aula4_chainOfResponsability.exercicioAula.service.Departamento;
import aula4_chainOfResponsability.exercicioAula.service.Mail;
import aula4_chainOfResponsability.exercicioAula.service.impl.Comercial;
import aula4_chainOfResponsability.exercicioAula.service.impl.Gerencial;
import aula4_chainOfResponsability.exercicioAula.service.impl.Spam;
import aula4_chainOfResponsability.exercicioAula.service.impl.Tecnico;

public class CheckMail {

    Departamento inicial = new Gerencial().setNextDepartamento(new Tecnico().setNextDepartamento(new Comercial().setNextDepartamento(new Spam())));

    public void verificar(Mail mail) {
        inicial.verificarDestino(mail);
    }

}
