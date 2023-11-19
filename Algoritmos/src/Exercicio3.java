import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número para 'A': ");
        int a = leitura.nextInt();
        System.out.println("Digite um número para 'B': ");
        int b = leitura.nextInt();

        if (a<b){
            int resultado = a+b;
            System.out.println("A + B = " + resultado);
        } else{
            int resultado = a-b;
            System.out.println("A - B = "+resultado);
        }
        System.out.println("Fim!");
    }
}
