package exer1_8;

import javax.swing.*;
import java.awt.event.*;



public class ExemploJanelaSwimg {
    public static void main(String[] args) {
        JFrame janela= new JFrame("CALCULADORA");
        janela.setSize(500,500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        janela.add(panel);
        panel.setLayout(null);

        JLabel primeiroValor = new JLabel("valor 1:");
        primeiroValor.setBounds(20, 20, 80, 25);
        panel.add(primeiroValor);
        JTextField valor1 = new JTextField(10);
        valor1.setBounds(100, 20, 165, 25);
        panel.add(valor1);


        JLabel segundoValor = new JLabel("valor 2:");
        segundoValor.setBounds(20, 60, 80, 25);
        panel.add(segundoValor);
        JTextField valor2 = new JTextField(10);
        valor2.setBounds(100, 60, 165, 25);
        panel.add(valor2);


        JLabel terceiroValor = new JLabel("valor 3:");
        terceiroValor.setBounds(20, 100, 80, 25);
        panel.add(terceiroValor);
        JTextField valor3= new JTextField(10);
        valor3.setBounds(100, 100, 165, 25);
        panel.add(valor3);

        JButton somaB = new JButton("soma");
        somaB.setBounds(20, 140, 50, 25);
        panel.add(somaB);
        JButton subtracaoB = new JButton("-");
        subtracaoB.setBounds(50, 140, 50, 25);
        panel.add(subtracaoB);
        JButton multpB = new JButton("x");
        multpB.setBounds(80, 140, 50, 25);
        panel.add(multpB);







        janela.setVisible(true);
    }
}