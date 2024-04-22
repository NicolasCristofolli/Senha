package senha;

import java.util.Scanner;

public class CriarSenha {
    private String senha = "senha";
    private String confirmaSenha;
    Scanner leitura = new Scanner(System.in);

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void criaSenha(AbreCofre abreCofre) {
        System.out.println("Digite sua senha!");
        setSenha(leitura.nextLine());
        System.out.println("Confirme sua senha");
        setConfirmaSenha(leitura.nextLine());

        int tentativas = 0;
        while (!confirmaSenha.equals(getSenha()) && tentativas < 3){
            System.out.println("Senhas diferentes, voce ainda tem mais " + (3 - tentativas) + " tentativas");
            System.out.println("Confirme sua senha");
            setConfirmaSenha(leitura.nextLine());
            tentativas++;
        }
        if (confirmaSenha.equals(getSenha())) {
            System.out.println("Senha confirmada com sucesso :D ");
            System.out.println(getSenha());
            abreCofre.abreCofre();
        } else {
            System.out.println("Você excedeu o limite de tentativas :( ");
        }
    }
}
