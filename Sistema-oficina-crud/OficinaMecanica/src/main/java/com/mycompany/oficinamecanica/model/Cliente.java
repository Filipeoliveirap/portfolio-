package com.mycompany.oficinamecanica.model;

public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    
    //construtor padrão
    public Cliente() {}
    
    //construtor com parâmetros
    public Cliente(int id, String nome, String telefone){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    //getters e Setters

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
