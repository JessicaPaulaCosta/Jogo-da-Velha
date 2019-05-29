package jogo_da_velha;

import java.awt.*;
import javax.swing.*;
import java.awt.Event.*;
import javax.swing.border.EmptyBorder;

public class Jogo extends JFrame {

    JButton cor;//Botão apenas para restaurar a cor dos botoes
    JButton[] Botoes;//Cria um vetor para os botoes
    JPanel PainelJogo;//Painel onde ficaram os botoes
    int vezJogador;//Variavel para verificar a vez do jogador
    String Simbolo;//Variavel para alocar os simbolo X ou O

    public Jogo() {//Metodo construtor
        super("Jogo da Velha");//Titulo da Janela
        ((JComponent) getContentPane()).setBorder(new EmptyBorder(5, 5, 5, 5));//Determina o tamanho da borda 

        PainelJogo = new JPanel();//Cria um novo Painel
        PainelJogo.setLayout(new GridLayout(3, 3, 10, 10));//Atribui layout do tipo GridLayout
        cor = new JButton();//Cria um botao para retaurar as cores de outros botoes

        Botoes = new JButton[9];//Cria um novo vetor com tamanho 9

        for (int i = 0; i < 9; i++) {
            Botoes[i] = new JButton("");//Cria e atribui os botoes a matriz
        }
        //Inicio da formatacao dos botoes do jogo

        Botoes[0].setFont(new Font("Calibri", Font.BOLD, 70));//Determina a fonte do botao
        PainelJogo.add(Botoes[0]);//Adiciona o botao painel

        Botoes[1].setFont(new Font("Calibri", Font.BOLD, 70));//Determina a fonte do botao
        PainelJogo.add(Botoes[1]);//Adiciona o botao painel

        Botoes[2].setFont(new Font("Calibri", Font.BOLD, 70));//Determina a fonte do botao
        PainelJogo.add(Botoes[2]);//Adiciona o botao painel

        Botoes[3].setFont(new Font("Calibri", Font.BOLD, 70));//Determina a fonte do botao
        PainelJogo.add(Botoes[3]);//Adiciona o botao painel

        Botoes[4].setFont(new Font("Calibri", Font.BOLD, 70));//Determina a fonte do botao
        PainelJogo.add(Botoes[4]);//Adiciona o botao painel

        Botoes[5].setFont(new Font("Calibri", Font.BOLD, 70));//Determina a fonte do botao
        PainelJogo.add(Botoes[5]);//Adiciona o botao painel

        Botoes[6].setFont(new Font("Calibri", Font.BOLD, 70));//Determina a fonte do botao
        PainelJogo.add(Botoes[6]);//Adiciona o botao painel

        Botoes[7].setFont(new Font("Calibri", Font.BOLD, 70));//Determina a fonte do botao
        PainelJogo.add(Botoes[7]);//Adiciona o botao painel

        Botoes[8].setFont(new Font("Calibri", Font.BOLD, 70));//Determina a fonte do botao
        PainelJogo.add(Botoes[8]);//Adiciona o botao painel

        //Fim da Formatacao dos botoes
        add(PainelJogo);//Adiciona o painel a janela
        setLocation(470, 200);//Determina a localizacao da Janela
        setSize(400, 400);//Determina o tamanho da Janela
        setVisible(true);//Torna visivell a Janela
    }

    //Interface
    //Metodo que verifica de quem é a vez e seu simbolo
    public void Jogada(int Simbol) {//Cria o Metodo Jogada e pede um valor do tipo inteiro
        //Verificar vez ee indica o simbolo do jogador
        if (vezJogador == 0) {
            Simbolo = "X";
            vezJogador = 1;
        } else {
            Simbolo = "O";
            vezJogador = 2;
        }
        Botoes[Simbol].setText(Simbolo);//Atribui o simbolo ao botao de acordo com o valor do tipo fornecido
        Botoes[Simbol].setEnabled(false);//Deixa o botao desativado
    }

    //Inicio da formatacao dos botoes do jogo
    Botoes 

    [0].setFont(
    new Font("Calibri", Font.BOLD, 70));//Determinaa fonte do botao
    Botoes 

    [0].addActionListener( 
        new ActionListener()){//Atribui uma acao ao botao
        @Override
        public void actionPerformed
        (ActionEvent e
        
            ){
            Jogada(0);//Chama o metodo Jogada atribuindo o valor 0 para identificar o botao
        }
    }

    PainelJogo.add (Botoes 
    [0]);//adiciona o botao ao painel
    
    Botoes 

    [1].setFont(
    new Font("Calibri", Font.BOLD, 70));//Determinaa fonte do botao
    Botoes 

    [1].addActionListener( 
        new ActionListener()){//Atribui uma acao ao botao
        @Override
        public void actionPerformed
        (ActionEvent e
        
            ){
            Jogada(1);//Chama o metodo Jogada atribuindo o valor 0 para identificar o botao
        }
    }

    PainelJogo.add (Botoes 
    [1]);//adiciona o botao ao painel
    
    Botoes 

    [2].setFont(
    new Font("Calibri", Font.BOLD, 70));//Determinaa fonte do botao
    Botoes 

    [2].addActionListener( 
        new ActionListener()){//Atribui uma acao ao botao
        @Override
        public void actionPerformed
        (ActionEvent e
        
            ){
            Jogada(2);//Chama o metodo Jogada atribuindo o valor 0 para identificar o botao
        }
    }

    PainelJogo.add (Botoes 
    [2]);//adiciona o botao ao painel
    
    Botoes 

    [3].setFont(
    new Font("Calibri", Font.BOLD, 70));//Determinaa fonte do botao
    Botoes 

    [3].addActionListener( 
        new ActionListener()){//Atribui uma acao ao botao
        @Override
        public void actionPerformed
        (ActionEvent e
        
            ){
            Jogada(3);//Chama o metodo Jogada atribuindo o valor 0 para identificar o botao
        }
    }

    PainelJogo.add (Botoes 
    [3]);//adiciona o botao ao painel
    
    Botoes 

    [4].setFont(
    new Font("Calibri", Font.BOLD, 70));//Determinaa fonte do botao
    Botoes 

    [4].addActionListener( 
        new ActionListener()){//Atribui uma acao ao botao
        @Override
        public void actionPerformed
        (ActionEvent e
        
            ){
            Jogada(4);//Chama o metodo Jogada atribuindo o valor 0 para identificar o botao
        }
    }

    PainelJogo.add (Botoes 
    [4]);//adiciona o botao ao painel
    
    Botoes 

    [5].setFont(
    new Font("Calibri", Font.BOLD, 70));//Determinaa fonte do botao
    Botoes 

    [5].addActionListener( 
        new ActionListener()){//Atribui uma acao ao botao
        @Override
        public void actionPerformed
        (ActionEvent e
        
            ){
            Jogada(5);//Chama o metodo Jogada atribuindo o valor 0 para identificar o botao
        }
    }

    PainelJogo.add (Botoes 
    [5]);//adiciona o botao ao painel
    
    Botoes 

    [6].setFont(
    new Font("Calibri", Font.BOLD, 70));//Determinaa fonte do botao
    Botoes 

    [6].addActionListener( 
        new ActionListener()){//Atribui uma acao ao botao
        @Override
        public void actionPerformed
        (ActionEvent e
        
            ){
            Jogada(6);//Chama o metodo Jogada atribuindo o valor 0 para identificar o botao
        }
    }

    PainelJogo.add (Botoes 
    [6]);//adiciona o botao ao painel

    Botoes 

    [7].setFont(
    new Font("Calibri", Font.BOLD, 70));//Determinaa fonte do botao
    Botoes 

    [7].addActionListener( 
        new ActionListener()){//Atribui uma acao ao botao
        @Override
        public void actionPerformed
        (ActionEvent e
        
            ){
            Jogada(7);//Chama o metodo Jogada atribuindo o valor 0 para identificar o botao
        }
    }

    PainelJogo.add (Botoes 
    [7]);//adiciona o botao ao painel
    
    Botoes 

    [8].setFont(
    new Font("Calibri", Font.BOLD, 70));//Determinaa fonte do botao
    Botoes 

    [8].addActionListener( 
        new ActionListener()){//Atribui uma acao ao botao
        @Override
        public void actionPerformed
        (ActionEvent e
        
            ){
            Jogada(8);//Chama o metodo Jogada atribuindo o valor 0 para identificar o botao
        }
    }

    PainelJogo.add (Botoes 

[8]);//adiciona o botao ao painel
}
