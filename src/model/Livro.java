package model;

import java.io.Serializable;

public class Livro implements Serializable {
    private String titulo;
    private String autor;
    private int ano;
    private int cod;
    int numExDisp;
    private String categoria;
    
    public Livro(int cod, String titulo, String autor, int ano, String categoria, int numExDisp) {
        this.numExDisp = numExDisp;
        this.cod = cod;
        this.categoria = categoria;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public int getNumExDisp() {
        return numExDisp;
    }
    public void setNumExDisp(int numExDisp) {
        this.numExDisp = numExDisp;
    }
    @Override
    public String toString() {
        return "\nLivro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", cod=" + cod + ", categoria="
                + categoria + "]";
    }
    
    
    
    
}
