package com.company;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joana", "D'arc", "revolucao@francesa.com.fr");
        Pessoa p2 = new Pessoa("Oscar", "Niemeyer", "construçao@brasilia.com.br");
        Pessoa p3 = new Pessoa("Nelson", "Mandela", "apartheid@sulafricano.com.sa");
        Pessoa p4 = new Pessoa("Karl", "Marx", "partido@comunista.com.urss");
        Pessoa p5 = new Pessoa("Frida", "Kahlo", "pintora@mexicana.com.mex");

        Agenda agenda = new Agenda();
        agenda.addPessoa(p1);
        agenda.addPessoa(p2);
        agenda.addPessoa(p3);
        agenda.addPessoa(p4);
        agenda.addPessoa(p5);

        Menu menu = new Menu();
        menu.listarContatos(agenda.getLista());
    }
}
