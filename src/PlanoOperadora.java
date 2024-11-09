public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        // switch case é melhor para algo complementar, e não para controles de fluxos
        // condicionais, mesmo que seja encadeado.
        switch (plano) {
            case "T": {
                System.out.println("5G Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }

    }

}
