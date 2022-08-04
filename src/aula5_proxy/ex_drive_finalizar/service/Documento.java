package aula5_proxy.ex_drive_finalizar.service;

import java.util.ArrayList;
import java.util.List;

public class Documento {
    private String id;
    private String url;
    private String conteudo;
    private List<Usuario> usuariosAutorizados;

    public Documento(String id, String url) {
        this.id = id;
        this.url = url;
    }

    public void addUsuario(Usuario usuario) {
        if (usuariosAutorizados == null) {
            this.usuariosAutorizados = new ArrayList<>();
        }
        usuariosAutorizados.add(usuario);
    }

    public void removeUsuario(Usuario usuario) {
        try {
            usuariosAutorizados.remove(usuario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public List<Usuario> getUsuariosAutorizados() {
        return usuariosAutorizados;
    }

    public void setUsuariosAutorizados(List<Usuario> usuariosAutorizados) {
        this.usuariosAutorizados = usuariosAutorizados;
    }
}
