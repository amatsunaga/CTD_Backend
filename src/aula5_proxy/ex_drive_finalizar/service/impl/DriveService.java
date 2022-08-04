package aula5_proxy.ex_drive_finalizar.service.impl;

import aula5_proxy.ex_drive_finalizar.service.IConnectionDrive;

public class DriveService implements IConnectionDrive {
    @Override
    public void getDocument(String url, String email) {
        System.out.printf("Documento '%s' acessado por %s%n", url, email);
    }
}
