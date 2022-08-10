package aula7_flyweightPattern.ex_computador;

import aula7_flyweightPattern.ex_computador.factory.ComputadorFactory;
import aula7_flyweightPattern.ex_computador.model.Computador;

public class Cliente {
    public static void main(String[] args) {
        ComputadorFactory factory = new ComputadorFactory();

        Computador pc1 = factory.getComputador(8, 256);
        Computador pc2 = factory.getComputador(16, 500);
        Computador pc3 = factory.getComputador(16, 500);
        System.out.println("Computadores criados: " + Computador.getContador());

        System.out.println(pc2);
        System.out.println(pc3);
        System.out.println(pc2.equals(pc3));
    }
}
