package aula7_flyweightPattern.ex_computador.factory;

import aula7_flyweightPattern.ex_computador.model.Computador;

import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {
    private static Map<String, Computador> computadorFlyweight = new HashMap<>();

    public Computador getComputador(int ram, int hd) {
        String id = "id:" + ram + ":" + hd;
        System.out.println(id);

        if (!computadorFlyweight.containsKey(id)) {
            Computador computador = new Computador(ram, hd, id);
            computadorFlyweight.put(id, computador);
            System.out.println("PC criado");
        } else System.out.println("PC obtido");

        return computadorFlyweight.get(id);
    }
}
