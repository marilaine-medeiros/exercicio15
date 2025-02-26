/* 15) Escreva um algoritmo que leia uma sequência de números do usuário
e realize a soma desses números.
Encerre a execução quando um número negativo for digitado.
 */

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite números para somar ou negativo para encerrar:");

        do {
            System.out.println(" Digite um número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                // para somar o número positivo
                soma += numero;
            }

        }while (numero >= 0); // Repete enquanto o número for positivo

        System.out.println("Soma dos números digitados:" + soma);
        scanner.close();
    }
}
