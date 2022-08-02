package aula1_JUnit.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PessoaTest {
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