package aula5_proxy.ex_vacina;

import java.time.LocalDate;

public class ProgramaVacinacao {
    public static void main(String[] args) {
        Pessoa juca = new Pessoa("Juca", "Santos", "3459876", LocalDate.of(2022, 8, 05), "CoronaVac");
        Pessoa malu = new Pessoa("Malu", "Souza", "8791234", LocalDate.of(2022, 8, 02), "CoronaVac");

        IVacina proxy = new VacinaProxy();
        proxy.vacinar(juca);
        proxy.vacinar(malu);
    }
}
