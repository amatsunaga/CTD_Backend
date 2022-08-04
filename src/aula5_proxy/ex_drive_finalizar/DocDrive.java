package aula5_proxy.ex_drive_finalizar;

import aula5_proxy.ex_drive_finalizar.service.Documento;
import aula5_proxy.ex_drive_finalizar.service.IConnectionDrive;
import aula5_proxy.ex_drive_finalizar.service.Usuario;
import aula5_proxy.ex_drive_finalizar.service.impl.DriveService;
import aula5_proxy.ex_drive_finalizar.service.impl.ProxyDrive;

public class DocDrive {
    public static void main(String[] args) {
        var documento1 = new Documento("123", "dh.com/doc1");
        var documento2 = new Documento("213", "dh.com/doc2");
        var documento3 = new Documento("312", "dh.com/doc3");

        var usuario1 = new Usuario("José", "Souza", "jose@dh.com");
        var usuario2 = new Usuario("Joaquim", "Pereira", "joaquim@dh.com");
        var usuario3 = new Usuario("Antônio", "Santos", "antonio@dh.com");

        documento1.addUsuario(usuario1);
        documento1.addUsuario(usuario2);

        documento2.addUsuario(usuario3);

        IConnectionDrive proxy = new ProxyDrive(new DriveService(), documento1);

        proxy.getDocument(documento1.getUrl(), usuario1.getEmail());
        proxy.getDocument(documento1.getUrl(), usuario3.getEmail());

        proxy.getDocument(documento2.getUrl(), usuario2.getEmail());




    }
}
