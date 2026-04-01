package pratica_marvel;

public class MarvelSwitch {
    public static void main(String[] args) {
        String faseWanda = "Feiticeira Escarlate";


        String status = switch (faseWanda) {
            case "Vingadora" -> "Heroina em treinamento e controle de poderes";
            case "WandaVision" -> "Criaçao de realidade alternativa (Hex) por luto";
            case "Feiticeira Escarlate" -> "Poder maximo: manipulaçao da magia do caos e do Darkhold.";
            case "Civil war" -> "Confinamento no complexo dos vingadores";
            default -> "Fase nao indentificada no multiverso";
        };
        System.out.println("Status da Wanda: "+status);
    }
}

