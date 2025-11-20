package com.company;

public class Professor extends Pessoa{
    private Double salario;

    public Professor(String nome, String cpf, String idade, Double salario) {
        super(nome, cpf, idade);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
