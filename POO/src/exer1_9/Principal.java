package exer1_9;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class Principal {
    public static void main(String[] args) throws NumeroNegativo {
        DecimalFormat dc = new DecimalFormat("0,00");
        Calc c = new Calc();

        try {
         c.n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Entre com o primeiro número:"));
         c.n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Entre com o segundo número:"));



         JOptionPane.showMessageDialog(null, "Soma : " + dc.format(c.somar()));
         JOptionPane.showMessageDialog(null, "Subtração : " + dc.format(c.diminuir()));

         JOptionPane.showMessageDialog(null, "Multiplicação : " + dc.format(c.multiplicar()));


         JOptionPane.showMessageDialog(null, "Divisão : " + dc.format(c.dividir()));

            if (c.n1 <0 || c.n2 <0){
                throw new NumeroNegativo("");
            }

        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "erro de divisão: " + e.getMessage());
        }catch (InputMismatchException e){
            JOptionPane.showMessageDialog(null,"Entrada de Dados Inválida");
        }catch (NumberFormatException e ){
            JOptionPane.showMessageDialog(null,"Valor Inválido, entre com inteiros");
        }catch (NumeroNegativo e){
            JOptionPane.showMessageDialog(null,"Entrou com número negativo");

        }



    }
}
