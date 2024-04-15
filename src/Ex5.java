import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite os numeros da A:");
        int[][] matriaa = digiteonumero(scanner, 5, 5);
        System.out.println("digite os numeros da B:");
        int[][] matriab = digiteonumero(scanner, 5, 5);
        int[][] matrizc = somarasmatrizes(matriaa, matriab);
        System.out.println("A Matriz C é:");
        imprimir(matrizc);
    }

    public static int[][] digiteonumero(Scanner scanner, int linha, int coluna) {
        int[][] matriz = new int[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("digie o numero na posição [%d][%d]:",i,j);
                matriz[i][j]=scanner.nextInt();
            }
        }return matriz;
    }
    public static int[][]somarasmatrizes(int[][]matriza,int[][]matrizb){
        int linha=matriza.length;
        int coluna=matriza[0].length;
        int[][]matrizc=new int[linha][coluna];
        for (int i=0;i < linha;i++){
            for (int j=0;j<coluna;j++){
                matrizc[i][j]=matriza[i][j]+matrizb[i][j];
            }
        }return matrizc;
    }
    public static void imprimir(int[][]matriz){
        int linha= matriz.length;
        int coluna=matriz[0].length;
        for (int i=0;i<linha;i++){
            for (int j=0;j<coluna;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

    }
}