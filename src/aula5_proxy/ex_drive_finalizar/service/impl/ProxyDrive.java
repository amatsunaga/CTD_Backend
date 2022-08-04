package aula5_proxy.ex_drive_finalizar.service.impl;

import aula5_proxy.ex_drive_finalizar.service.Documento;
import aula5_proxy.ex_drive_finalizar.service.IConnectionDrive;
import aula5_proxy.ex_drive_finalizar.service.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ProxyDrive implements IConnectionDrive {

    private DriveService drive;
    private Documento documento;

    private List<Usuario> usuarios;

    public ProxyDrive(DriveService drive, Documento doc) {
        this.drive = drive;
        this.documento = doc;
        this.usuarios = documento.getUsuariosAutorizados();
    }

    @Override
    public void getDocument(String url, String email) {
        List<String> emailsAutorizados = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            emailsAutorizados.add(usuario.getEmail());
            }

        if(emailsAutorizados.contains(email)) {
            drive.getDocument(url, email);
        } else System.out.printf("Acesso a '%s' negado! Usuário %s não autorizado.%n", url, email);
    }
}
