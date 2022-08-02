package aula4_chainOfResponsability.exercicioPg.service.impl;

import aula4_chainOfResponsability.exercicioPg.service.Documento;
import aula4_chainOfResponsability.exercicioPg.service.Usuario;

public class Presidente extends Usuario {

    public Presidente() {
        this.acesso = 3;
    }

    @Override
    public void lerDocumento(Documento doc) {
        if(doc.getTipo() > 0 && doc.getTipo() <= this.acesso) {
            System.out.println("Estou lendo o documento. Presidente");
        }

        if(this.nextUsuario != null) {
            this.nextUsuario.lerDocumento(doc);
        }
    }
}
