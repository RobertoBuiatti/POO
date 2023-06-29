package principal;
import camarotes.Normal;
import camarotes.CamaroteInferior;
import camarotes.CamaroteSuperior;
import ingresso.Ingresso;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para Ingresso Normal");
        System.out.println("Digite 2 para Ingresso VIP");
        int escolhaIngresso = scanner.nextInt();

        if (escolhaIngresso == 1) {
            Ingresso ingresso = new Normal(50.0);
            System.out.println("Tipo de Ingresso: Normal");
            ingresso.imprimeValor();
        } else if (escolhaIngresso == 2) {
            System.out.println("Digite 1 para Camarote Superior");
            System.out.println("Digite 2 para Camarote Inferior");
            int escolhaVIP = scanner.nextInt();

            if (escolhaVIP == 1) {
                CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.0, 20.0);
                System.out.println("Tipo de Ingresso: VIP - Camarote Superior");
                System.out.println("Valor do ingresso: R$" + camaroteSuperior.getValorVIP());
            } else if (escolhaVIP == 2) {
                System.out.print("Digite a localização do Camarote Inferior: ");
                scanner.nextLine();
                String localizacao = scanner.nextLine();

                CamaroteInferior camaroteInferior = new CamaroteInferior(80.0, 15.0, localizacao);
                System.out.println("Tipo de Ingresso: VIP - Camarote Inferior");
                camaroteInferior.imprimeLocalizacao();
                System.out.println("Valor do ingresso: R$" + camaroteInferior.getValorVIP());
            } else {
                System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
