package aula5_proxy.exemplo_internet.service.impl;

import aula5_proxy.exemplo_internet.service.IConexionInternet;

public class InternetService implements IConexionInternet {


    @Override
    public void conectarCom(String url) {
        System.out.println("Conectando com "+url);
    }
}
