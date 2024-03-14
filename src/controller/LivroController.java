package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class LivroController implements Serializable{
    private static List<Livro> listaLivros = new ArrayList<Livro>();
    private static int cod = 0;
    public LivroController(List<Livro> listaLivros) {
        LivroController.listaLivros = new ArrayList<>();
    }
    
    public static void cadastrarLivro(String titulo, String autor, int ano, String categoria, int numExDisp){
        Livro livrocad = new Livro(cod++, titulo, autor, ano, categoria, numExDisp);
        listaLivros.add(livrocad);
    }

    public static Livro buscarLivro(int cod){
        for (Livro livro : listaLivros) {
            if(livro.getCod() == cod){
                return livro;
            }
        }
        return null;
    }
    public static Livro buscarLivro(String titulo){
        for (Livro livro : listaLivros) {
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }
    public static List<Livro> listarLivros(){
        return listaLivros;
    }
}
