package aula4_chainOfResponsability.exercicioPg.service;

public abstract class Usuario {

    protected Integer acesso;
    protected Usuario nextUsuario;

    public abstract void lerDocumento(Documento doc);

    public void setAcesso(Integer acesso) {
        this.acesso = acesso;
    }

    public Usuario setNextUsuario(Usuario nextUsuario) {
        this.nextUsuario = nextUsuario;
        return this;
    }
}
