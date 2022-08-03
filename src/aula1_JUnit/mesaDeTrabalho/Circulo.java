package aula1_JUnit.mesaDeTrabalho;

public class Circulo extends Figura {
    private double raio;

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
}
