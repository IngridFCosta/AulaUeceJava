
package exerciciosaulauece.Aula06;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int num, totImpares=0;
        for(int i=0;i<6;i++){
            num=ler.nextInt();
            if(num%2!=0){
              totImpares+=1; 
            }         
        }
      System.out.println("Total de impares: "+totImpares);
        
    }
    
}
