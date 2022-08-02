package aula4_chainOfResponsability.exercicioPg.service.impl;

import aula4_chainOfResponsability.exercicioPg.service.Documento;
import aula4_chainOfResponsability.exercicioPg.service.Usuario;

public class Deputado extends Usuario {

    public Deputado() {
        this.setAcesso(1);
    }

    @Override
    public void lerDocumento(Documento doc) {
        if (doc.getTipo() == this.acesso) {
            System.out.println("Estou lendo o documento. Deputado");
        }

        if (this.nextUsuario != null) {
            this.nextUsuario.lerDocumento(doc);
        }
    }
}
