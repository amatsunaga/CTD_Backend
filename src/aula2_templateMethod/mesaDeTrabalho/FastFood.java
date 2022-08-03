package aula2_templateMethod.mesaDeTrabalho;

public class FastFood {
    public static void main(String[] args) {
        Cardapio infantil = new CardapioInfantil(30.0, 5.0);
        Cardapio adulto = new CardapioAdulto(32.0);
        Cardapio vegetariano = new CardapioVegetariano(35.0, 3.0);

        System.out.println("MENU INFANTIL");
        infantil.prepararMenu();

        System.out.println("\nMENU ADULTO");
        adulto.prepararMenu();

        System.out.println("\nMENU VEGETARIANO");
        vegetariano.prepararMenu();
    }
}
