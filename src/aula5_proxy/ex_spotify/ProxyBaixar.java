package aula5_proxy.ex_spotify;

public class ProxyBaixar implements Baixar {
    @Override
    public void baixarMusica(String musica, Usuario usuario) {
        if(usuario.getTipo().equalsIgnoreCase("premium")) {
            Baixar service = new ServicoBaixar();
            service.baixarMusica(musica, usuario);
        } else {
            System.out.println("Este usuário não é premium. Sem permissão para baixar a música.");
        }
    }
}
