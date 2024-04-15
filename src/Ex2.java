import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int[][] matriz = gmatriz(6, 8);
        imatriz(matriz);
        int[] vetorc=negativos(matriz);
        ivetor(vetorc);
    }

    public static int[][]gmatriz(int linha,int coluna){
        int [][]matriz =new  int[linha][coluna];
        Random random=new Random();
        for (int i=0;i<linha;i++) for (int j=0;j<coluna;j++)
            matriz[i][j]= random.nextInt(101)-50;
        return matriz;
    }


    public static void imatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)
                System.out.print(matriz[i][j] + "\t");
            System.out.println();
        }

    }

    public static int[] negativos(int[][]matriz){
        int negativos=0;
        int[]vetorc=new int[matriz.length];
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                if (matriz[i][j]<0){
                    negativos++;
                }
            }
            vetorc[i]=negativos;
        }
        return vetorc;
    }
    public static void ivetor(int[] vetor) {
        System.out.println("Quantidade de  negativos em cada linha:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Linha " + (i + 1) + ": " + vetor[i]);
        }


    }
}
