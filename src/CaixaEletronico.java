import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor para saque: ");
        int valor = scanner.nextInt();
        int valorOriginal = valor;

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("Notas necessárias:");

        for (int nota : notas) {
            int quantidade = valor / nota;
            if (quantidade > 0) {
                System.out.println(quantidade + " nota(s) de R$" + nota);
                valor = valor % nota;
            }
        }
        System.out.println("O valor total sacado foi de R$ " + valorOriginal);

        scanner.close();
    }
}