public class ResultadoEscolar {

    public static void main(String[] args) {
        // no lugar de utiliza if else encadeado, utilizamos uma expressão ternária que
        // joga para uma variável. Através dessa váriável é possível imprimir, salvar em
        // arquivo....

        int nota = 8;
        // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        // Estrutura de teste encadeado. Estrutura removiva para teste de Condição
        // Ternária.
        // if (nota >= 7)
        // System.out.println("Aprovado");

        // else if (nota >= 5 && nota < 7)
        // System.out.println("Prova de Recuperação");

        // else
        // System.out.println("Reprovado");

    }

}
