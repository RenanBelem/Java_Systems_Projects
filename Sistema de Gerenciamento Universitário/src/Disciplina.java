package com.company;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private ArrayList<Estudante>listaEstudantes;
    private ArrayList<Professor>listaProfessores;

    public Disciplina() {
        this.nome = nome;
        this.listaEstudantes = new ArrayList<Estudante>();
        this.listaProfessores = new ArrayList<Professor>();
    }

    public void addEstudante(Estudante e){
        this.listaEstudantes.add(e);
    }

    public void addProfessor(Professor p){
        this.listaProfessores.add(p);
    }

    public void DadosD(){
        System.out.println("Professores: ");
        for(int i = 0; i < this.listaProfessores.size(); i++){
            System.out.println("    Nome: "+this.listaProfessores.get(i).getNome());
            System.out.println("    CPF: "+this.listaProfessores.get(i).getCpf());
            System.out.println("    Idade: "+this.listaProfessores.get(i).getIdade());
            System.out.println("    Salário: "+this.listaProfessores.get(i).getSalario());
            System.out.println("");
        }
        System.out.println("Estudantes: ");
        for(int i = 0; i < this.listaEstudantes.size(); i++){
            System.out.println("    Nome: "+this.listaEstudantes.get(i).getNome());
            System.out.println("    CPF: "+this.listaEstudantes.get(i).getCpf());
            System.out.println("    Idade: "+this.listaEstudantes.get(i).getIdade());
            System.out.println("    Matrícula: "+this.listaEstudantes.get(i).getMatricula());
            System.out.println("");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Estudante> getListaEstudantes() {
        return listaEstudantes;
    }

    public void setListaEstudantes(ArrayList<Estudante> listaEstudantes) {
        this.listaEstudantes = listaEstudantes;
    }

    public ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(ArrayList<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }
}
