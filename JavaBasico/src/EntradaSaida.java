import java.net.StandardSocketOptions;
import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome , endereco;
        int idade=45;
        double salario= 1250.6454;

        System.out.println("Digite o seu nome: ");
        nome = input.next();// pode inserir uma palavra

        input.nextLine();//// serve para pular uma linha e responder o nome sem problemas

        System.out.println("Digite o seu endereço: ");
        endereco = input.nextLine();// pode inserir uma linha toda

        input.nextLine();// serve para pular uma linha e responder  endereço e depois a idade

        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();//Pode digitar um valor inteiro

        System.out.println("Digite o seu salário");
        salario = input.nextDouble();//insere valor decimal

        System.out.print("Eu moro em: " + endereco+"\n");

        System.out.println("Meu nome é: " + nome);

        System.out.printf("Minha idade é %d %c meu salário é %.2f", idade,'\\', salario);
    }



}
