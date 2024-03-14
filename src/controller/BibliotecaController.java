package controller;

import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class BibliotecaController {
    private List<Livro> livrosDisp = new ArrayList<Livro>();

    public BibliotecaController(List<Livro> livrosDisp) {
        this.livrosDisp = new ArrayList<>();
    }
    
    public List<Livro> emprestarLivros(List<Livro> livros) {
        List<Livro> lista = new ArrayList<>();

        for (Livro livro : livros) {
            for (Livro livroDisp : livrosDisp) {
                if (livroDisp.getCod() == livro.getCod()) {
                    if (livroDisp.getNumExDisp() > 0) {
                        livroDisp.setNumExDisp(livroDisp.getNumExDisp() - 1);
                        lista.add(livroDisp);
                    }
                }
            }
        }

        return lista;
    }

    public void devolverLivros(List<Livro> livros) {
        for (Livro livro : livros) {
            for (Livro livroDisp : livrosDisp) {
                if (livroDisp.getCod() == livro.getCod()) {
                    livroDisp.setNumExDisp(livroDisp.getNumExDisp() + 1);
                }
            }
        }
    }
}

