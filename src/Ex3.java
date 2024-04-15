import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(100) + 1 ;}
        }System.out.print("matriz é:"+"\t");
        mmatriz(matriz);

        System.out.println("\nsoma por coluna é:");
        for (int j=0;j<matriz[0].length;j++){
            int soma=0;
        for (int i=0;i<matriz.length;i++){
            soma+=matriz[i][j];}
        System.out.println("coluna"+(j+1)+":"+soma);
        }
    }
    public static  void mmatriz(int[][]matriz){
        for (int i=0;i< matriz.length;i++)
            for (int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
        System.out.println();


    }
}


