package Aula02;
import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dia da semana: ");
        int diaInt = scanner.nextInt();
        String dia  = "";

        if (diaInt == 1) {
            dia = "Domingo";
        } else if (diaInt == 2) {
            dia = "Segunda";
        } else if (diaInt == 3) {
            dia = "Terça";
        } else if (diaInt == 4) {
            dia = "Quarta";
        } else if (diaInt == 5) {
            dia = "Quinta";
        } else if (diaInt == 6) {
            dia = "Sexta";
        } else if (diaInt == 7) {
            dia = "Sábado";
        }

        if (dia.equals("")) {
            System.out.println("Valor inválido");
        } else {
            System.out.println("O dia correspondente é " + dia);
        }

	
}

	

}
