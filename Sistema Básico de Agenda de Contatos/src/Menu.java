package com.company;

import java.util.ArrayList;

public class Menu {
    public void listarContatos(ArrayList<Pessoa> lista){
        System.out.print("*----------- Lista de contatos -----------*");
        for(int i = 0; i<lista.size(); i++)
        {
            System.out.println("\nNome: "+lista.get(i).getNome());
            System.out.println("Sobrenome: "+lista.get(i).getSobrenome());
            System.out.println("Email: "+lista.get(i).getEmail());
        }
    }
}
