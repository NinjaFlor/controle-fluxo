public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                // break; // obrigatório, senão ele irá imprimir todas as condições apresentadas
                // no
                // código.
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
                // a última condição não precisa de break.

        }
    }

    // condições em if else para comparação com switch case
    /*
     * if (sigla == "P")
     * System.out.println("PEQUENO");
     * else if (sigla == "M")
     * System.out.println("MEDIO");
     * else if (sigla == "G")
     * System.out.println("GRANDE");
     * else
     * System.out.println("INDEFINIDO");
     */
}
