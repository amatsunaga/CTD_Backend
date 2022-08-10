package aula10_logging.ex_felinos.model;

import org.apache.log4j.Logger;

public class Leao {
        Logger logger = Logger.getLogger(Leao.class);

    private String nome;
    private int idade;
    private boolean eAlfa;

    public void correr() {
        logger.info(this.nome + " está correndo!");
    }

    public void maiorAlfa() {

        if (idade > 10 && eAlfa) {
            logger.info("É alfa e tem mais de 10 anos.");
        } else try {
            if (idade > 0) {
                logger.info("Não tem mais de 10 anos ou não é alfa");
            }
        } catch (Exception e) {
            logger.error("Idade não pode ser negativa", e);
        }
    }


    public Leao(String nome, int idade, boolean eAlfa) {
        this.nome = nome;
        this.idade = idade;
        this.eAlfa = eAlfa;
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

    public boolean iseAlfa() {
        return eAlfa;
    }

    public void seteAlfa(boolean eAlfa) {
        this.eAlfa = eAlfa;
    }
}
