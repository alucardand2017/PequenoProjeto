package app;

import dominio.Pessoa;
import services.CadastroServices;
import services.RepositorioService;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try {
            ArrayList<Pessoa> lista = new ArrayList<>();
            String rodandoPrograma = "s";

            while (rodandoPrograma.equals("s")){
                Scanner teclado = new Scanner(System.in);
                System.out.println("CADASTRO DE PESSOAS");
                CadastroServices cadastro = new CadastroServices();
                Pessoa p = cadastro.cadastrarPessoa();
                lista.add(p);
                System.out.println("deseja continuar? (s) (n) ");
                rodandoPrograma =  teclado.next();
            }
            RepositorioService.salvaEmArquivo(lista);
            RepositorioService.lerDeArquivo("repositorio.txt");
        }catch (Exception e){
            System.out.println("Ocorreu um erro inesperado: " +e.getMessage() );
        }
    }
}
