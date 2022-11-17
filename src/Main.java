import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//este é um comentario em linha

/* Tipos primitivos de variaveis
 *
 * tipos numericos: int, double, float, long;
 * tipos de texto: char, String;
 * tipos lógico: boolean;
 *
 *  Operadores de Java:
 *
 * Operadores relacionais: ==  !=  >  <
 * Operadores aritmeticos: + - / * %
 * % -> Nome Modulo -> retorna o resto de uma divisao inteira
 * Operadores logicos: &&  ||
 * && -> somente verdadeiro se os dois valores logicos forem verdadeiros
 * || -> se uns dos valores é verdadeiro retorna verdadeiro;
 *
 * JOptionPane.showInputDialog("Mensagem que vai aparecer"); -> Telinha para o usuario digitar
 * JOptionPane -> A telinha implementada
 *
 *  */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        JFrame tela = new JFrame("Calculadora");
        tela.setSize(300, 400);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);////quando fechar a tela o programa termina

        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout()); //organiza o compponente (FlowLayout)
        painel.setSize(300, 400);

        JTextArea display = new JTextArea();
        display.setFont(display.getFont().deriveFont(16f));
        display.setPreferredSize(new Dimension(290, 100)); //setPreferredSize define o tamanho
        display.setEditable(false); //para que não possa alterar o texto

        painel.add(display); //campo de texto

        JButton []botoes = new JButton[10];
        for (int i = 0; i <= 9; i++){
            botoes[i] = new JButton(String.valueOf(i));
            botoes[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evento) {
                    String valorDigitado = ((JButton)evento.getSource()).getText();
                   display.setText(display.getText()+valorDigitado); //valor digitado mantém + outro valor digitado
                }
            });
            painel.add(botoes[i]);
        }

        JButton botaoSimbolo;

        String valorBotoes[] = {"+", "-", "/", "x"};

        //length? até o comprimento do vetor?
        for(int i = 0; i < valorBotoes.length; i++){ //percorrendo o vetor e add os botoes
            botaoSimbolo = new JButton(valorBotoes[i]);
            botaoSimbolo.addActionListener(new ActionListener() { // adicionando o comportamento do botão
                @Override
                public void actionPerformed(ActionEvent evento) {
                    String valorDigitado = ((JButton)evento.getSource()).getText();
                    display.setText(display.getText()+valorDigitado); //valor digitado mantém + outro valor digitado
                }
            });
            painel.add(botaoSimbolo);
        }

        botaoSimbolo = new JButton("=");
        painel.add(botaoSimbolo);
        botaoSimbolo.addActionListener(new ActionListener() { // adicionando o comportamento do botão
            @Override
            public void actionPerformed(ActionEvent evento) {
                int resultado = main.processaTexto(display.getText());
                display.setText("" + resultado);
            }
        });


        tela.add(painel);

        Icon icon = new ImageIcon("73858.png");

        JButton botaoLimpa = new JButton("C",icon);
        painel.add(botaoLimpa);

        botaoLimpa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });

        tela.setVisible(true);
    }

    public int processaTexto(String texto){
        String[] valores = texto.split("[+/\\-*]"); // separa o texto recebido do que esta dentro dos parenteses
        int[] numeros = new int[valores.length];
        for (int i = 0; i < valores.length; i++){
        numeros[i] = Integer.parseInt(valores[i]);
        }
        return soma(numeros[0],numeros[1]);
    }

    public int soma(int var1, int var2) {
        int resultado = var1 + var2;
        return resultado;
    }

    public int multiplicacao(int var1, int var2) {
        int resultado = var1 * var2;
        return resultado;
    }

    public double divisao(double var1, double var2) {
        double resultado = var1 / var2;
        return resultado;
    }

    public int subtracao(int var1, int var2) {
        int resultado = var1 - var2;
        return resultado;
    }


}