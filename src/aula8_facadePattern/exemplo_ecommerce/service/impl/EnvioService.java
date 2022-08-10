package aula8_facadePattern.exemplo_ecommerce.service.impl;

import aula8_facadePattern.exemplo_ecommerce.model.Endereco;
import aula8_facadePattern.exemplo_ecommerce.model.Produto;

import java.util.List;

public class EnvioService {
    public void processarEnvio(List<Produto> produtos, Endereco endereco){
        System.out.println("Enviando produtos a " + endereco.getRua() +" "+ endereco.getNro() +","+ endereco.getBairro());
    }
}
