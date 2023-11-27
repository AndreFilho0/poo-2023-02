package teste.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportandoDadosCSV {

    public static void main(String[] args) {
        File arquivocsv = new File("C:\\Users\\T-Gamer\\Desktop\\poo-2023-02\\POO\\src\\teste\\streams\\SAPATOS.csv");

        Scanner leitor = null;
        try {
            String linhaDoarquivo = new String();
            leitor = new Scanner(arquivocsv);
            while (leitor.hasNext()) {
                linhaDoarquivo = leitor.nextLine();
                System.out.println(linhaDoarquivo);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } finally {
            leitor.close();
        }

    }
}
