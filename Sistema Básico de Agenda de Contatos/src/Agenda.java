package com.company;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> lista;

    public Agenda() {
        this.lista = new ArrayList<Pessoa>();
    }

    public void addPessoa(Pessoa p){
        this.lista.add(p);
    }

    public ArrayList<Pessoa> getLista(){
        return this.lista;
    }
}
