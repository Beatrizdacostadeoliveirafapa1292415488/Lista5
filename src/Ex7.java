import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] matrizm=new int[5][5];
        System.out.println("digite os numeros da matriz M:");
        preencher(scanner,matrizm);
        System.out.println("A Matriz M é:");
        imprimir(matrizm);

        linha4(matrizm);
        culuna2(matrizm);
        diagonal(matrizm);
        todos(matrizm);
    }
    public static void preencher(Scanner scanner,int[][]matriz){
        for(int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("digite o numero na posição [%d][%d]:",i,j);
                matriz[i][j]=scanner.nextInt();
            }
        }
    }
    public static void imprimir(int[][]matriz){
        int linha= matriz.length;
        int coluna=matriz[0].length;
        for (int i=0;i<linha;i++){
            for (int j=0;j<coluna;j++){
                System.out.print(matriz[i][j]+"\t ");
            }
            System.out.println();
        }
    }
    public static void linha4(int[][]matriz){
        int soma=0;
        for (int j=0;j<matriz[4].length;j++){
            soma+=matriz[4][j];
        }
        System.out.println("linha 4:"+soma);
    }
    public static void culuna2(int[][]matriz){
        int soma=0;
        for (int i=0;i<matriz.length;i++){
            soma+=matriz[i][2];
        }
        System.out.println("coluna 2 :"+soma);

    }
    public static void diagonal(int[][]matriz){
        int soma=0;
        for (int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz[2].length; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("soma da diagonal:"+soma);
    }
    public static void todos(int[][]matriz){
        int soma=0;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                soma+= matriz[i][j];
            }
        }
        System.out.println("soma de todos é:"+soma);


    }
}
