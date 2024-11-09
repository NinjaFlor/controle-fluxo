public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;
            /*
             * break interrompe a excução
             * continue muda o fluxe da iteração apenas naquele momento, mas não interrompe
             * o fluxo. Serve para eliminar ou desconsiderar uma condição específica.
             */

            System.out.println(numero);
        }

    }

}
