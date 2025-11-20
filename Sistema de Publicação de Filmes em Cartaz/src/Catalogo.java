package com.company;
import java.util.ArrayList;

//NOME DOS PARTICIPANTES: RENAN BELEM BIAVATI, THOMAS FRENTZEL, THEO CESAR ZANOTTO

public class Catalogo {
    public static void main(String[] args) {
        Cartaz c = new Cartaz();
        c.setVisible(true);
        ArrayList<Nome> nomes = new ArrayList<>();
        Nome nome = new Nome("Renan, Thomas, Theo");
        nomes.add(nome);

        for(Nome n : nomes){
            System.out.println(n);
        }
    }
}

