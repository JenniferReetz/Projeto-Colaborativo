import java.util.Scanner;

public class MenuMatematico {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String menu = """
                Escolha o que você quer fazer:
                    1 - Soma
                    2 - Subtração
                    3 - Multiplicação
                    4 - Divisão
                    0 - Sair
                """;

        System.out.println(menu);

        int opcao = leitura.nextInt();

        while (opcao != 0){

            System.out.println("Digite um numero");
            int numero1 = leitura.nextInt();

            System.out.println("Digite outro numero");
            int numero2 = leitura.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println(numero1 + numero2);
                    break;
                case 2:
                    System.out.println(numero1 - numero2);
                    break;
                case 3:
                    System.out.println(numero1 * numero2);
                    break;
                case 4:
                    System.out.println(numero1 / numero2);
                    break;
            }
            System.out.println(menu);
            opcao = leitura.nextInt();

        }
    }
}
//Crie um programa que exiba um menu:
//
//1 - Soma
//2 - Subtração
//3 - Multiplicação
//4 - Divisão
//0 - Sair
//
//O programa deve:
//
//Ler a opção do usuário
//Pedir dois números
//Executar a operação escolhida
//Exibir o resultado
//Repetir até o usuário escolher 0 (sair)
//⚠️ Regras:
//Não permitir divisão por zero
//Validar opção inválida