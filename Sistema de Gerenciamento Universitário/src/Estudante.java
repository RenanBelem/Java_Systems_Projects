package com.company;

public class Estudante extends Pessoa{
    private int matricula;

    public Estudante(String nome, String cpf, String idade, int matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
