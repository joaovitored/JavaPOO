import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
    Scanner escreva = new Scanner(System.in);
    final double META = 200.00;
    double vendas, bonus;
    String nomeFuncionario, desempenho;

        System.out.println("Digite o nome do funcionario: ");
        nomeFuncionario = escreva.nextLine();
        System.out.println("Digite o total de vendas: ");
        vendas = escreva.nextDouble();

        if (vendas >= META){
            desempenho = "SATISFATÓRIO";
            bonus = 100.00;
        }else if (vendas >100 && vendas <META) {
            desempenho = "PODE MELHORAR";
            bonus= 50.00;

        }else {
            desempenho ="NÃO SATISFATÓRIO";
            bonus = 0.00;
        }

        System.out.println("O desempenho de " + nomeFuncionario + " foi: " + desempenho + " e ganhou bonus de " + bonus);
}
}
