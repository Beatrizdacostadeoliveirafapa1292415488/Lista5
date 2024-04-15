import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        int[][] matriz = gmatriz(7, 9);
        imatriz(matriz);
        int soma = somamatriz(matriz);
        System.out.println("Soma da matriz: " + soma);
    }


    public static int[][]gmatriz(int linha,int coluna) {
        int[][] matriz = new int[linha][coluna];
        Random random = new Random();
        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                matriz[i][j]= random.nextInt(100);
            }

        }return matriz;
    }


    public static void imatriz(int[][] matriz){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static int somamatriz(int[][]matriz){
        int soma=0;
        for (int i =0; i<matriz.length;i++)for (int j=0;j< matriz[i].length;j++)soma+=matriz[i][j];
        return soma;

    }
}
