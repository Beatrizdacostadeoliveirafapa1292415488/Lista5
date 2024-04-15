import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("digite os numeros da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("digite o numero na posição [%d][%d]:", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        int somasucundaria = 0;
        for (int i = 0; i < 3; i++) {
            somasucundaria += matriz[i][2 - i];
            double media = (double) somasucundaria / 3;


            double resultado = 1.0;
            for (int i1 = 0; i < 3; i++) {
                resultado *= matriz[i][i] * media;
            }
            System.out.println("resultado da multiplicação é:" + resultado);

        }
    }
}