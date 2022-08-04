package aula5_proxy.ex_spotify;

public class UsuarioMain {
    public static void main(String[] args) {
        Usuario free = new Usuario("1234", "free");
        Usuario premium = new Usuario("4321", "premium");

        Baixar proxy = new ProxyBaixar();

        proxy.baixarMusica("Boate Azul", free);
        proxy.baixarMusica("Fio de Cabelo", premium);
    }
}
