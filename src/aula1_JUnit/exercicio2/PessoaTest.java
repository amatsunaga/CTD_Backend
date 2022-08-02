package aula1_JUnit.exercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaTest {
    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    List<String> colecao = new ArrayList<>();

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setDataNascimento(LocalDate.of(2016, 3, 23));
        p2 = new Pessoa("Ana", "Musk");
        p2.setDataNascimento(LocalDate.of(1966, 1, 03));
        p3 = new Pessoa("Joe", "Morello");
        p3.setDataNascimento(LocalDate.of(2010, 12, 04));
        p4 = new Pessoa("Rob", "Johnson");
        p4.setDataNascimento(LocalDate.of(1976, 10, 25));
        p5 = new Pessoa("Ted", "Trujillo");
        p5.setDataNascimento(LocalDate.of(2014, 5, 14));
        p6 = new Pessoa("Robert", "Traids");
        p6.setDataNascimento(LocalDate.of(2000, 3, 30));
        p7 = new Pessoa("Renata", "Castro");
        p7.setDataNascimento(LocalDate.of(2010, 1, 18));
        p8 = new Pessoa("Murilo", "Bianch");
        p8.setDataNascimento(LocalDate.of(2015, 7, 11));
        p9 = new Pessoa("Candido", "Silveira");
        p9.setDataNascimento(LocalDate.of(1975, 9, 01));
        p10 = new Pessoa("Camila", "Porto");
        p10.setDataNascimento(LocalDate.of(2014, 5, 25));

    }

    @Test
    void imprimirObjetos() {
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void adicionarColecao() {
        p1.addNome(p1);
        assertEquals(0,p1.maioresDeIdadeENomesCurtos.size());
        p2.addNome(p2);
        assertEquals(0,p2.maioresDeIdadeENomesCurtos.size());
        p3.addNome(p3);
        assertEquals(0,p3.maioresDeIdadeENomesCurtos.size());
        p4.addNome(p4);
        assertEquals(0,p4.maioresDeIdadeENomesCurtos.size());
        p5.addNome(p5);
        assertEquals(0,p5.maioresDeIdadeENomesCurtos.size());
        p6.addNome(p6);
        assertEquals(1,p6.maioresDeIdadeENomesCurtos.size());
        p7.addNome(p7);
        assertEquals(0,p7.maioresDeIdadeENomesCurtos.size());
        p8.addNome(p8);
        assertEquals(0,p8.maioresDeIdadeENomesCurtos.size());
        p9.addNome(p9);
        assertEquals(1,p9.maioresDeIdadeENomesCurtos.size());
        p10.addNome(p10);
        assertEquals(0,p10.maioresDeIdadeENomesCurtos.size());
    }

}