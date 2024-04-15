import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][]matrizm=new int[6][6];
        int[]vetorv= new int[36];
        System.out.println("digite os numeros da matriz M:");
        preencher(scanner,matrizm);
        System.out.println("digite o numero pelo qual vai ser multiplicado: ");
        int a=scanner.nextInt();
        muntiplique(matrizm,a,vetorv);
        System.out.println("o vetor V  é:");
        for (int i=0;i< vetorv.length;i++){
            System.out.print(vetorv[i]+" ");
        }
    }
    public static void preencher(Scanner scanner,int[][]matriz){
        for(int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("digite o numero na posição[%d][%d]:",i,j);
                matriz[i][j]=scanner.nextInt();
            }
        }
    }
    public static void muntiplique(int[][]matriz,int valor,int[]vetor){
        int x=0;
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                vetor[x]=matriz[i][j]*valor;
                x++;
            }
        }
    }

}
