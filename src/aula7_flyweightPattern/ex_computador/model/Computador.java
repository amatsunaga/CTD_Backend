package aula7_flyweightPattern.ex_computador.model;

import java.util.Objects;

public class Computador {
    private int ram;
    private int hd;
    private String id;
    private static int contador;

    public Computador(int ram, int hd, String id) {
        this.ram = ram;
        this.hd = hd;
        this.id = id;
        this.contador ++;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Computador.contador = contador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computador that = (Computador) o;
        return ram == that.ram && hd == that.hd && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, hd, id);
    }

    @Override
    public String toString() {
        return "Computador{" +
                "ram=" + ram +
                ", hd=" + hd +
                ", id='" + id + '\'' +
                '}';
    }
}
