package com.company;
import java.util.ArrayList;

//NOME DOS PARTICIPANTES: RENAN BELEM BIAVATI, THOMAS FRENTZEL, THEO CESAR ZANOTTO

public class Filmes {
    ArrayList<Nome> nomes = new ArrayList<>();

    public void cadastraNome(Nome nome){
        nomes.add(nome);
    }
    public String numNomes(){
        return nomes.size()+ "";
    }
}
