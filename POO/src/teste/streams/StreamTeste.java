package teste.streams;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTeste {
    public static void main(String[] args) {
        gravador2();

    }

    private static void gravador(){
        byte[] dados = {65,66,55,20,41,48};
        try {
            FileOutputStream gravador = new FileOutputStream("Textos/stream.txt");
            gravador.write(dados);
            System.out.println("dados gravados com sucesso");

        }catch (IOException e){
             e.printStackTrace();
        }
    }

    private static void leitor(){
        try {
            FileInputStream ler = new FileInputStream("Textos/stream.txt");
            int leitura;
            while ((leitura= ler.read()) !=-1){
                byte b= (byte) leitura;
                System.out.println(b);

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void gravador2(){
        byte [] dados={55,44,1,2,4,78,9,7};
        try {
            BufferedOutputStream gravabuff = new BufferedOutputStream(new FileOutputStream("Textos/stream.txt"));
            gravabuff.write(dados);
            gravabuff.flush();
            System.out.println("gravado com sucesso");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
