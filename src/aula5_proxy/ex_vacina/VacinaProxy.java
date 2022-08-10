package aula5_proxy.ex_vacina;

import java.time.LocalDate;

public class VacinaProxy implements IVacina {
    @Override
    public void vacinar(Pessoa pessoa) {
        if (pessoa.getDataAgendamento().equals(LocalDate.now()) || pessoa.getDataAgendamento().isBefore(LocalDate.now())) {
            var vacinaService = new VacinaService();
            vacinaService.vacinar(pessoa);
        } else {
            LocalDate agendamento = pessoa.getDataAgendamento();
            System.out.printf("%s %s agendado para %s/%s/%s. Não pode vacinar hoje.%n", pessoa.getNome(), pessoa.getSobrenome(), agendamento.getDayOfMonth(), agendamento.getMonthValue(), agendamento.getYear());
        }
    }
}
