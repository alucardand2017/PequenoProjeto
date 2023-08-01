package services;

import dominio.Endereco;
import dominio.Pessoa;
import dominio.Profissao;

import java.util.Scanner;

public class CadastroServices {
    public Pessoa cadastrarPessoa() {
        try {
            Endereco endereco = new Endereco();
            boolean controleDeLacoDoCep = true;
            Scanner teclado = new Scanner(System.in);

            System.out.print("Digite o nome: ");
            String nome = teclado.nextLine();

            System.out.print("Digite sua idade: ");
            String idade = teclado.nextLine();

            System.out.print("Digite sua profissao: ");
            String profString = teclado.nextLine();

            while (controleDeLacoDoCep){
                System.out.print("Digite seu cep: ");
                String cep = teclado.nextLine();
                String resposta = ApiServices.urlViaCep(cep);
                endereco = RequestService.transformaUrlViaCepEmEndereco(resposta);
                if (endereco.getBairro() == null) {
                    System.out.println("CEP não localizado, repita a operação.");
                }else
                    controleDeLacoDoCep = false;
            }
            System.out.print("Digite o complemento: ");
            String complemento = teclado.nextLine();
            endereco.setComplemento(complemento);

            System.out.print("Digite o numero: ");
            String numero = teclado.nextLine();
            endereco.setNumero(numero);
            return new Pessoa(nome, idade, Profissao.valueOf(profString.toLowerCase()), endereco);

        } catch (Exception e) {
            System.out.println("Erro no cadastro");
        }
        return null;
    }
}
