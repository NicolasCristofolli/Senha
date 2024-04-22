package senha;

import java.util.Scanner;

public class AbreCofre {
    private String entradaSenha;
    Scanner leitura = new Scanner(System.in);
    CriarSenha criarSenha;

    public AbreCofre(CriarSenha criarSenha) {
        this.criarSenha = criarSenha;
    }

    public String getEntradaSenha() {
        return entradaSenha;
    }

    public void setEntradaSenha(String entradaSenha) {
        this.entradaSenha = entradaSenha;
    }

    public void abreCofre() {
        System.out.println("Digite a senha do Cofre");
        setEntradaSenha(leitura.nextLine());
        System.out.println(criarSenha.getSenha());
        if (getEntradaSenha().equals(criarSenha.getSenha())) {
            System.out.println("eba");
        } else {
            System.out.println("ERRADO");
        }
    }
}