package aula10_logging.exemplo;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(1,3);
        int soma = calculadora.somar();
        System.out.println(soma);

        Calculadora calculadora1 = new Calculadora(1, 0);
        double divisao = calculadora1.dividir();
        System.out.println(divisao);

        Calculadora calculadora2 = new Calculadora(4, 2);
        calculadora2.dividir();
    }
}
