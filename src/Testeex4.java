import java.util.Random;

public class Testeex4 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        pmatriz(matriz);
        System.out.println("a matriz é");
        vermatriz(matriz);
        int spares = somadaspares(matriz);
        System.out.println("A soma das linhas pares da matriz é: " + spares);
    }
    public static void pmatriz(int[][] matriz) {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }
    }
    public static void vermatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int somadaspares(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i += 2)
            for (int j = 0; j < matriz[i].length; j++)
                soma += matriz[i][j];
        return soma;
    }
    }

