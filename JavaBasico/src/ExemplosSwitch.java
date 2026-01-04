import java.util.Scanner;
import java.util.Set;

public class ExemplosSwitch {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int op;

        System.out.println("1. Soma");
        System.out.println("2. Numero maior");
        System.out.println("3. Buscar numero");
        System.out.println("4. Sair");
        System.out.print("Digite uma opção");

        op = leia.nextInt();

        switch (op) {

            case 1 :
                System.out.println("Você digitou 1");
                break;

            case 2 :
                System.out.println("Você digitou 2");
                break;

            case 3 :
                System.out.println("Você digitou 3");
                break;

            case 4 :
                System.exit(0);
                break;

            default:
                System.out.println("Opção inválida!");

        }
    }
}
