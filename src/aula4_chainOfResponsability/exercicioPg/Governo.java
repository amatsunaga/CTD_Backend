package aula4_chainOfResponsability.exercicioPg;

import aula4_chainOfResponsability.exercicioPg.service.Documento;
import aula4_chainOfResponsability.exercicioPg.service.Usuario;
import aula4_chainOfResponsability.exercicioPg.service.impl.Deputado;
import aula4_chainOfResponsability.exercicioPg.service.impl.Ministro;
import aula4_chainOfResponsability.exercicioPg.service.impl.Presidente;

public class Governo {
    public static void main (String[] args) {

        Usuario handlerBase = new Deputado();
        handlerBase.setNextUsuario(new Ministro().setNextUsuario(new Presidente()));

        handlerBase.lerDocumento(new Documento("Blá blá blá", 3));
    }
}
