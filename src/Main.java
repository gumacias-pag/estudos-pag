import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.*;
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
 * JOptionPane.showInputDialog("Mensagem que vau aparecer"); -> Telinha para o usuario digitar
 * JOptionPane -> A telinha implementada
 *
 *  */
public class Main {
    String msg = "msg1";

    public static void main(String[] args) {
        Main main = new Main();

        JFrame tela = new JFrame("Calculadora");
        JPanel painel = new JPanel();
        painel.setLayout(new GridBagLayout());
        painel.setSize(300, 400);
        tela.setSize(300, 400);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //quando fechar a tela o programa termina
        JTextField display = new JTextField(300);
        JButton botao1 = new JButton("1");
        painel.add(display);
        painel.add(botao1);

        tela.add(painel);
        tela.setVisible(true);


        /*int var1, var2;

        var1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
        var2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
        double resultado = 0;

        String[] opcoes = {"soma", "subtracao", "divisao", "multiplicacao"};
        int opcao = JOptionPane.showOptionDialog(null,
                "Escolha a operação",
                "Titulo",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes, null);

        switch (opcao){
            case 0:
                resultado = main.soma(var1, var2);
                break;
            case 1:
                resultado = main.subtracao(var1, var2);
                break;
            case 2:
                resultado = main.divisao(var1, var2);
                break;
            case 3:
                resultado = main.multiplicacao(var1, var2);
                break;
        }*/
        //JOptionPane.showMessageDialog(null, resultado);
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