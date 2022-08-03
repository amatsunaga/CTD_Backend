package aula1_JUnit.mesaDeTrabalho;

public class Quadrado extends Figura {
    private double lado;

    @Override
    protected double calcularPerimetro() {
        return 4 * this.lado;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }
}
