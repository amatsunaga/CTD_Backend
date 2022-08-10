package aula5_proxy.ex_serie_finalizar;

public class SerieServ implements iSerie {

    private String nome;
    private String link;

    @Override
    public String getSerie(String nome) {
        link = "www." + nome + ".com";
        System.out.println(link);
        return link;
    }


    public String getNome() {
        return nome;
    }

    public String getLink() {
        return link;
    }
}
