package teste.streams;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class importandoDadosCSV2 {
    public static void main(String[] args) {

        //CAMINHO DE UM ARQUIVO CSV
        String path = "C:\\Users\\T-Gamer\\Desktop\\poo-2023-02\\POO\\src\\teste\\streams\\SAPATOS.csv";

        //LIST PARA ARMAZENAR AS INFORMAÇÃO SOBRE DE MANEIRA MELHOR
        List<Product> list = new ArrayList<Product>();

        // LEITURA DE ARQUIVO CSV
        try(BufferedReader br=new BufferedReader(new FileReader(path))) {


            String line = br.readLine();
            line = br.readLine();
            line = br.readLine();
            line = br.readLine();
            while ((line!=null)){

                String[] vect = line.split(",");
                String name = vect[2];
                String price = vect[1];

                Product produtos = new Product(price,name);
                list.add(produtos);



                line = br.readLine();


            }
            for (Product p:list){
                System.out.println(p);
            }
            //CRIAR UM DOCUMENTO PARA ARMAZENAR O OBJETO LIST QUE TEM NOSSOS PRODUTOS FILTRADOS
            try {
                FileOutputStream arq = new FileOutputStream("produto.txt");
                ObjectOutputStream obj = new ObjectOutputStream(arq);
                obj.writeObject(list);
                obj.flush();
                System.out.println("gravado com sucesso ");

            }catch (Exception erro){
                System.out.println("erro na parte de gravar");

            }


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // LER O OBJETO ARMAZENADO NO NOSSO ARQUIVO
        try {
            FileInputStream arq = new FileInputStream("produto.txt");
            ObjectInputStream obj = new ObjectInputStream(arq);
            List p1 = (List) obj.readObject();
            System.out.println(p1.toString());




        }catch (Exception erro){
            System.out.println("erro de leitura: "+ erro);

        }


    }
}
