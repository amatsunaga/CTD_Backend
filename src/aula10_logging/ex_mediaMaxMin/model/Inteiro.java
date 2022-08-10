package aula10_logging.ex_mediaMaxMin.model;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Media {

    private static final Logger logger = Logger.getLogger(Media.class);
    private List<Integer> listaInteiros = new ArrayList<>();

    public double calcularMedia() {
//        double soma = listaInteiros.stream().reduce(int a, int b => a + b)
        double soma = 0;
        double tamanho = listaInteiros.size();

        for (Integer numero : listaInteiros) {
            soma += numero;
        }

        double media = soma / tamanho;

        return media;
    }

//    public Integer getMaximo() {
//        listaInteiros.stream().max();
//    }

    public void verificarLista() {
        double tamanho = listaInteiros.size();

        if (tamanho > 10) {
            logger.info("O comprimento da lista é maior que 10");
        } else if (tamanho > 5) {
            logger.info("O comprimento da lista é maior que 5");
        } else if (tamanho == 0) {
            logger.error("A lista é igual a zero");
        }
    }

    public Media(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
        calcularMedia();
    }
}
