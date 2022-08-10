package aula10_logging.ex_felinos.model;

import org.apache.log4j.Logger;

public class Tigre {
    private static final Logger logger = Logger.getLogger(Tigre.class);

    private String nome;
    private int idade;

    public void correr() {

        logger.info("O tigre " + this.nome + " está correndo!");
    }

    public void eMaiorQue10() {

        if (idade > 10) {
            logger.info(nome + " tem mais de 10 anos.");
        } else if (idade >= 0) {
            logger.info(nome + " não tem mais de 10 anos");
        } else {
            logger.error("A idade de " + nome + " não pode ser negativa", new Exception());
        }
    }

    public Tigre(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
