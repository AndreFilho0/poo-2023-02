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


        JLabel Resultado = new JLabel("Resultado:");
        Resultado.setBounds(20, 100, 80, 25);
        panel.add(Resultado);
        JTextField resultado= new JTextField(10);
        resultado.setBounds(100, 100, 165, 25);
        panel.add(resultado);

        JButton somaB = new JButton("+");
        somaB.setBounds(20, 140, 50, 25);
        panel.add(somaB);
        JButton subtracaoB = new JButton("-");
        subtracaoB.setBounds(70,140, 50, 25);
        panel.add(subtracaoB);
        JButton multpB = new JButton("x");
        multpB.setBounds(120, 140, 50, 25);
        panel.add(multpB);
        JButton divB = new JButton("/");
        divB.setBounds(170, 140, 50, 25);
        panel.add(divB);

        somaB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double v1 = Double.parseDouble(valor1.getText());
                    double v2 = Double.parseDouble(valor2.getText());
                    String Result = String.valueOf(v1 + v2);
                    resultado.setText(Result);
                }catch (NumberFormatException ex){
                    resultado.setText("só aceitamos números");

                }

            }
        });

        subtracaoB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double v1 = Double.parseDouble(valor1.getText());
                    double v2 = Double.parseDouble(valor2.getText());
                    String Result = String.valueOf(v1 - v2);
                    resultado.setText(Result);
                }catch (NumberFormatException ex){
                    resultado.setText("só aceitamos números");

                }

            }
        });

        multpB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double v1 = Double.parseDouble(valor1.getText());
                    double v2 = Double.parseDouble(valor2.getText());
                    String Result = String.valueOf(v1 *v2);
                    resultado.setText(Result);
                }catch (NumberFormatException ex){
                    resultado.setText("só aceitamos números");

                }

            }
        });

        divB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double v1 = Double.parseDouble(valor1.getText());
                    double v2 = Double.parseDouble(valor2.getText());
                    String Result = String.valueOf(v1/v2);
                    resultado.setText(Result);
                }catch (NumberFormatException ex){
                    resultado.setText("só aceitamos números");

                }

            }
        });





        janela.setVisible(true);
    }
}