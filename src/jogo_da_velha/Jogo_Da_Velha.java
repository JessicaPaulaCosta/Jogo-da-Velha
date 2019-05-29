package jogo_da_velha;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Jogo_Da_Velha {

 
    public static void main(String[] args) {
        Jogo Tela = new Jogo();//Cria novo objeto do tipo "Jogo".
        Tela.setDefaultCloseOperation(EXIT_ON_CLOSE);//Determina que ao fechar a tela a aplicação seja finalizada.
        Tela.setResizable(false);
    }
    
}
