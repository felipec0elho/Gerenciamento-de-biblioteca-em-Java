package controller;

import java.util.ArrayList;
import java.util.List;

import model.Usuarios;

public class UsuarioController {
    private static List<Usuarios> usuarios = new ArrayList<Usuarios>();

    public UsuarioController(ArrayList<Usuarios> arrayList) {
        UsuarioController.usuarios = new ArrayList<>();
    }

    public static void cadastrarUsuario(String nome, String email, String endereco, String cpf) {
        Usuarios usuario = new Usuarios(nome, email, endereco, cpf);
        usuarios.add(usuario);
    }

    public List<Usuarios> listarUsuarios() {
        return usuarios;
    }
}
