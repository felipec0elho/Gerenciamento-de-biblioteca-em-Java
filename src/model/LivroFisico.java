package model;

public class LivroFisico extends Livro {
    String localizacao;

    public LivroFisico(int cod, String titulo, String autor, int ano, String categoria, int numExDisp, String localizacao) {
        super(cod, titulo, autor, ano, categoria, numExDisp);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "LivroFisico [localizacao=" + localizacao + "]";
    }

    

}
