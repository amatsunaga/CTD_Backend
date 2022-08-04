package aula5_proxy.ex_spotify;

public class ServicoBaixar implements Baixar {
    @Override
    public void baixarMusica(String musica, Usuario usuario) {
        System.out.println("Usuário Premium - Realizando download da música '" + musica + "'.");
    }
}
