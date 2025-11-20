package com.company;
import java.util.ArrayList;

public class Universidade {
    private String nome;
    private String endereco;
    private ArrayList<Curso>listaCursos;

    public Universidade() {
        this.nome = nome;
        this.endereco = endereco;
        this.listaCursos = new ArrayList<Curso>();
    }

    public void addCurso(Curso c){
        this.listaCursos.add(c);
    }

    public void DadosU(){
        System.out.println("");
        System.out.println("Dados da Universidade:");
        System.out.println("Universidade: "+ nome );
        System.out.println("Endereço: "+ endereco);
        System.out.println("Cursos: ");
        for(int i = 0; i < this.listaCursos.size(); i++){
            System.out.println("  "+this.listaCursos.get(i).getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
}
