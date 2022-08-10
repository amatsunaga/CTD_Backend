package aula5_proxy.ex_vacina;

import java.time.LocalDate;

public class VacinaService implements IVacina {
    @Override
    public void vacinar(Pessoa pessoa) {
        LocalDate hoje = LocalDate.now();

        System.out.printf("%s %s vacinado(a) com %s em %s/%s/%s.%n", pessoa.getNome(), pessoa.getSobrenome(), pessoa.getNomeVacina(), hoje.getDayOfMonth(), hoje.getMonthValue(), hoje.getYear());
    }
}
