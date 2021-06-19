
package aula13;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int matriz[][]=new  int[4][4];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=ler.nextInt();
            }
        }
       for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]);
            }
            
        } 
       
    }
    
}
