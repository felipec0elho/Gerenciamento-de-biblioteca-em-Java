package model;

public class LivroDigital extends Livro {
    private String formato;

    public LivroDigital(int cod, String titulo, String autor, int ano, String categoria, String formato, int numExDisp) {
        super(cod, titulo, autor, ano, categoria, numExDisp);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "LivroDigital [formato=" + formato + "]";
    }

    
}
