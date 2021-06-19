
package aula13;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
         int [] numeros=new int[10];
         
        for(int i=0;i< numeros.length;i++){
            numeros[i]=ler.nextInt();   
        }
         for(int i=0;i< numeros.length;i++){
            if(i%2!=0){
                System.out.println("Posição: "+i+ "- Elemento: "+numeros[i]);
                
            }   
        }

    }
    
}
