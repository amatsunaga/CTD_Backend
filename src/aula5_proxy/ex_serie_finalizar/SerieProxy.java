package aula5_proxy.ex_serie_finalizar;

public class SerieProxy implements iSerie {

    private int viewsQtd;

    @Override
    public String getSerie(String nome) {
        viewsQtd++ ;
        if ( viewsQtd <= 5){
            iSerie iSerie = new SerieServ();
            iSerie.getSerie(nome);
        } else System.out.println("limite atingido");
        return " limite atingido";

    }
}
