import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner leia =  new Scanner(System.in);
        double nota1,nota2,nota3,nota4,media;
        String Situacao;

        System.out.println("Digite as notas a seguir");

        nota1 = leia.nextDouble();
        nota2 = leia.nextDouble();
        nota3 = leia.nextDouble();
        nota4 = leia.nextDouble();

        media = (nota1+nota2+nota3+nota4) /4 ;

        Situacao = media >=7 ? "APROVADO" : "REPROVADO";

        System.out.println("Sua media foi: " +media+ "e a sua situação foi de: "+ Situacao);
    }
}
