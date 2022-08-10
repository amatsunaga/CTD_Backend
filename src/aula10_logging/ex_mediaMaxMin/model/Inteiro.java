package aula10_logging.ex_mediaMaxMin.model;

import org.apache.log4j.Logger;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Inteiro {

    private static final Logger logger = Logger.getLogger(Inteiro.class);
    private List<Integer> listaInteiros;
    public double calcularMedia() {
        Double media;

/*        soma = listaInteiros.stream().reduce(0, (a, b) -> a + b);
        media = soma / listaInteiros.size();*/

        try {
            media = listaInteiros.stream().mapToDouble(d -> d).average().getAsDouble();
            String mediaFormatada = media.toString().format(Locale.ENGLISH, "%.2f", media);

            logger.info("Média = " + mediaFormatada);
            return media;

        } catch(Exception e) {
            logger.error("Impossível obter a média", e);
            return -1;
        }
    }

    public Integer getMaximo() {
        try {
            Integer maximo = Collections.max(listaInteiros);
            logger.info("O valor máximo é " + maximo);
            return maximo;
        } catch (Exception e) {
            logger.error("Impossível obter valor máximo", e);
            return -1;
        }
    }

    public Integer getMinimo() {
        try {
            Integer minimo = Collections.min(listaInteiros);
            logger.info("O valor mínimo é " + minimo);
            return minimo;
        } catch (Exception e) {
            logger.error("Impossível obter valor mínimo", e);
            return -1;
        }
    }

    public void verificarLista() {
        double tamanho = listaInteiros.size();

        if (tamanho > 10) {
            logger.info("O comprimento da lista é maior que 10");
        } else if (tamanho > 5) {
            logger.info("O comprimento da lista é maior que 5");
        } else {
            logger.error("O comprimento da lista é igual a zero", new Exception());
        }
    }

    public Inteiro(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
        calcularMedia();
        getMaximo();
        getMinimo();
        verificarLista();
    }
}
