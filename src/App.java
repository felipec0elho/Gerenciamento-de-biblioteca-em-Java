import java.util.ArrayList;
import java.util.Scanner;

import controller.*;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao;
        boolean menu = true;
        try (Scanner sc = new Scanner(System.in)) {
            LivroController livro = new LivroController(new ArrayList<Livro>());
            UsuarioController user = new UsuarioController(new ArrayList<Usuarios>());
            BibliotecaController biblioteca = new BibliotecaController(new ArrayList<Livro>());
            do{
                System.out.println("Escolha uma opção:\n1 - Cadastrar livros \n2 - Cadastrar Usuarios \n3 - Listar Usuarios \n4 - Pesquisar livro por código \n5 - Pesquisar livro por titulo \n6 - Empréstimo \n7 - Devolução \n9) - Listar livros \n0) - Sair ");
                opcao = sc.nextInt();
                sc.nextLine();
                switch(opcao){
                    case 1:
                    System.out.println("Titulo do livro:");
                    String titulo = sc.nextLine();
                    System.out.println("Autor do livro:");
                    String autor = sc.nextLine();
                    System.out.println("Ano de publicação do livro:");
                    int ano = sc.nextInt();
                    sc.nextLine();                   
                    System.out.println("Quantidade de exemplares disponíveis:");
                    int numExDisp = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Categoria do livro:");
                    String categoria = sc.nextLine();
                    if (Salvar.lerArquivo() != null) {       
                        livro = (LivroController) Salvar.lerArquivo(); 
                    }else {
                        LivroController.cadastrarLivro(titulo, autor, ano, categoria, numExDisp);
                    }
                    Salvar.salvarArquivo(livro);
                    break;
                    case 2:
                    System.out.println("Nome: ");
                    String nomeUser = sc.nextLine();
                    System.out.println("Endereço: ");
                    String endereco = sc.nextLine();
                    System.out.println("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.println("Email: ");
                    String email = sc.nextLine();
                    UsuarioController.cadastrarUsuario(nomeUser, email, endereco, cpf);
                    break;

                    case 3:
                    System.out.println(user.listarUsuarios()); 
                    break;
                    case 4:
                    System.out.println("Insira o código do livro que deseja buscar: ");
                    int codBusca = sc.nextInt();
                    System.out.println(LivroController.buscarLivro(codBusca)); 
                    break;
                    case 5:
                    System.out.println("Insira o titulo do livro que deseja buscar: ");
                    String tituloBusca = sc.nextLine();
                    LivroController.buscarLivro(tituloBusca);
                    break;
                    case 6:
                    biblioteca.emprestarLivros(new ArrayList<Livro>());
                    break;
                    case 7:
                    biblioteca.devolverLivros(new ArrayList<Livro>());
                    break;
                    case 0:
                    menu = false;
                    break;
                    case 9:
                    System.out.println(LivroController.listarLivros()); 
                    break;
                    default:
                    System.out.println("Opção inválida!");
                    break;
                }
            }while(menu);
        }
    }
}
