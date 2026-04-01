package pratica_marvel;

public class WandaSwitchAntigo {
    public static void main(String[] args) {
        String faseWanda = "WandaVision";
        String status;

        switch (faseWanda) {
            case "vingadora":
                status = "Heroina em treinamento.";
                break;
            case "WandaVision":
                status = "Criaçao do hex e vida suburbana.";
                break;
            case "Feiticeira Escalarte":
                status = "Dominio da magia do caos";
                break;
            default:
                status = "Fase desconhecida";
                break;
        }
        System.out.println("Status: " + status);
    }
}
