package menu;

import java.util.Scanner;
import senha.CriarSenha;
import senha.AbreCofre;
public class Menu {
    CriarSenha criarSenha = new CriarSenha();
    AbreCofre abreCofre = new AbreCofre(criarSenha);
    Scanner leitura = new Scanner(System.in);
    String resposta;


    public void menu() {
        System.out.println("Seja bem vindo ao seu cofre pessoal!");
        System.out.println(" ");
        do {
            System.out.println(" Digite 1 caso você queira trocar a senha do seu cofre \n Digite 2 caso você queira acessar seu cofre \n Digite 3 para sair");
            resposta = leitura.nextLine();
            switch (resposta) {
                case "1":
                    criarSenha.criaSenha(abreCofre);
                    break;
                case "2":
                    abreCofre.abreCofre();
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Nao entendi");
            }
        } while (!resposta.equals("3"));
    }
}
