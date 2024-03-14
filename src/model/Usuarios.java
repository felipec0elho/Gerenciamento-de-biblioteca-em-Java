package model;

public class Usuarios {
    private int id;
    private String nome;
    private String email;
    private String endereco;
    private String cpf;
    private static int nextId=1;

    public Usuarios( String nome, String email, String endereco, String cpf) {
        this.id = nextId++;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public Usuarios() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = nextId++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Usuarios [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", cpf=" + cpf
                + "]";
    }

    public void cadastrarUsuario(String nomeUser, String email2, String endereco2, String cpf2) {
    }

    


}
