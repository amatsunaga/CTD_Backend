package aula4_chainOfResponsability.exercicioAula;

import aula4_chainOfResponsability.exercicioAula.service.CheckMail;
import aula4_chainOfResponsability.exercicioAula.service.Mail;

public class ProcessaMail {
    public static void main(String[] args) {
        CheckMail processo = new CheckMail();
        processo.verificar(new Mail("email@email.com", "tecnica@digitalhouse.com","Reclamação"));
        processo.verificar(new Mail("email@email.com", "sds@digitalhouse.com","Gerência"));
        processo.verificar(new Mail("email@email.com", "juan@pepe.com","Comercial"));
        processo.verificar(new Mail("email@email.com", "tecnica@colmeia.com","Reclamação"));
    }
}
