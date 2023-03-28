package br.com;

import java.util.Date;

public class Usuario implements Comparable<Usuario>{
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private Date dataCadastro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Usuario(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public int compareTo(Usuario user) {
        if (this.getId() < user.getId()){
            return -1;
        }
        if (this.getId() > user.getId()){
            return 1;
        }
        return 0;



    }
}
