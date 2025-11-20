package com.company;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Disciplina>listaDisciplinas;

    public Curso() {
        this.nome = nome;
        this.listaDisciplinas = new ArrayList<Disciplina>();
    }

    public void addDisciplina(Disciplina d){
        this.listaDisciplinas.add(d);
    }

    public void DadosC() {
        System.out.println("Disciplinas: ");
        for(int i = 0; i < this.listaDisciplinas.size(); i++) {
            System.out.println("    "+this.listaDisciplinas.get(i).getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }
}
