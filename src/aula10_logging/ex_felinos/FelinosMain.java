package aula10_logging.ex_felinos;

import aula10_logging.ex_felinos.model.Leao;
import aula10_logging.ex_felinos.model.Tigre;

public class FelinosMain {
    public static void main(String[] args) {
        Leao leao = new Leao("Simba", 12, true);
        leao.correr();
        leao.maiorAlfa();

        Leao leao1 = new Leao("Zezé", 9, false);
        leao1.correr();
        leao1.maiorAlfa();

        Tigre tigre = new Tigre("Haroldo", -8);
        tigre.correr();
        tigre.eMaiorQue10();

        Tigre tigre1 = new Tigre("Tigrão", 11);
        tigre1.correr();
        tigre1.eMaiorQue10();

    }
}
