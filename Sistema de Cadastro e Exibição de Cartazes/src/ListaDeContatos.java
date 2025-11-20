package cadastro;
import java.util.ArrayList;

public class ListaDeContatos {
    public static void main(String[] args) {
        JanelaCadastro jc = new JanelaCadastro();
        jc.setVisible(true);
        ArrayList<Contato> contatos = new ArrayList<>();
        Contato contato = new Contato("Renan");
        contatos.add(contato);            
        
       for(Contato c : contatos){
           System.out.println(c);
       }
    }
}
