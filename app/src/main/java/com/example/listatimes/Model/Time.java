package com.example.listatimes.Model;

public class Time {
    private int logo;
    private String nome;
    private String cidadeEstado;

    public Time(int logo, String nome, String cidadeEstado) {
        this.logo = logo;
        this.nome = nome;
        this.cidadeEstado = cidadeEstado;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidadeEstado() {
        return cidadeEstado;
    }

    public void setCidadeEstado(String cidadeEstado) {
        this.cidadeEstado = cidadeEstado;
    }
}
