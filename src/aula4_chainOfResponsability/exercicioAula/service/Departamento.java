package aula4_chainOfResponsability.exercicioAula.service;

public abstract class Departamento {
    protected Departamento nextDepartamento;

    public abstract void verificarDestino(Mail mail);

    public Departamento getNextDepartamento() {
        return nextDepartamento;
    }
    public Departamento setNextDepartamento(Departamento nextDepartamento) {
        this.nextDepartamento = nextDepartamento;
        return this;
    }
}
