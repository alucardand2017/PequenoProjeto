package services;

import dominio.Pessoa;

import java.io.*;
import java.util.ArrayList;

public class RepositorioService {

        public static void salvaEmArquivo(ArrayList<Pessoa> list) throws IOException {
            FileWriter writer = new FileWriter("repositorio.txt");
            for (Pessoa pessoa : list) {
                writer.append(pessoa.toString());
                writer.append("\n-----------------------------------");
            }
            writer.close();
        }
        public static void lerDeArquivo(String endArquivo) throws IOException {
            File file = new File(endArquivo);
            FileReader reader = new FileReader(file);
            int data = reader.read();
            while (data != -1){
                System.out.print((char) data);
                data = reader.read();
            }
        }


}
