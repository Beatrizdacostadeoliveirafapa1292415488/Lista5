import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        int[][]matriz=new int[10][10];
        preencheramatriz(matriz);
        double media=calcularamedia(matriz);
        System.out.println("a media das matrizes na diagonal é:"+media);
    }
    public static void preencheramatriz(int[][]matriz){
        Random random=new Random();
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j]= random.nextInt(100);
            }
        }
    }
    public static double calcularamedia(int[][]matriz){
        int soma=0;
        for (int i=0;i<matriz.length;i++){
            soma+=matriz[i][i];
        }
        return (double) soma/matriz.length;
    }
}
