package aula1_JUnit.exercicioPg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest {
    Person andrea = new Person("Maria", "Pereira", "maria@dh.com", 46);

    @Test
    public void testaNomeCompleto() {
        String nomeCompleto = andrea.exibirNomeCompleto();

        assertEquals("Pereira, Maria", nomeCompleto);
    }

    @Test
    public void seEMaiorDeIdade() {
        assertTrue(andrea.maiorDeIdade());
    }

}