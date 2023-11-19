import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número para 'A': ");
        int a = leitura.nextInt();
        System.out.println("Digite um número para 'B': ");
        int b = leitura.nextInt();
        int resultado = a + b;
        System.out.println("O resultado da soma de A + B é: " + resultado);

        System.out.println("Fim do Programa!");
    }
}
