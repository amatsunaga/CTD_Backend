package aula1_JUnit.mesaDeTrabalho;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {
    Figura circulo;
    Figura quadrado;

    @BeforeEach
    void doBefore() {
        circulo = new Circulo(3.0);
        quadrado = new Quadrado(4.0);
    }

    @Test
    void calcularPerimetroCirculo() {
        assertEquals(6 * Math.PI, circulo.calcularPerimetro());
    }

    @Test
    void calcularPerimetroQuadrado() {
        assertEquals(16.0, quadrado.calcularPerimetro());
    }
}