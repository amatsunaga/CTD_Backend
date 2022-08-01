package aula1_JUnit.exercicio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest {
    Person andrea = new Person("Andrea", "Matsunaga", "andrea@dh.com", 36);

    @Test
    public void testaNomeCompleto() {
        String nomeCompleto = andrea.exibirNomeCompleto();

        assertEquals("Matsunaga, Andrea", nomeCompleto);
    }

    @Test
    public void seEMaiorDeIdade() {
        assertTrue(andrea.maiorDeIdade());
    }

}