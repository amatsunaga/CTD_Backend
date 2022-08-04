package aula5_proxy.exemplo_internet;

import aula5_proxy.exemplo_internet.service.IConexionInternet;
import aula5_proxy.exemplo_internet.service.impl.InternetService;
import aula5_proxy.exemplo_internet.service.impl.ProxyInternet;

import java.util.Arrays;
import java.util.List;

public class Internet {

    public static void main(String[] args) {
        List<String> sitesBloqueados = Arrays.asList("www.youtube.com","www.facebook.com");
        IConexionInternet proxy = new ProxyInternet(sitesBloqueados,new InternetService());

        proxy.conectarCom("www.google.com");
        proxy.conectarCom("www.youtube.com");
    }
}
