import java.util.Random;

/*
 * Diferente do While, o DO WHILE executa ao menos 1 vez antes de testar a regra
 * no While o teste da regra ocorre primeiro. Portanto se a condição for falsa não 
 * executará o código.
 */

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            // executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        } while (tocando());

        System.out.print("Alô !!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);

        return !atendeu;
    }

}
