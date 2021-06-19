
package aula13;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
       Scanner ler=new Scanner(System.in); 
       int [] numeros=new int[5];
        int soma=0;
        for(int i=0;i< numeros.length;i++){
            numeros[i]=ler.nextInt();   
        }
        for(int i=0;i< numeros.length;i++){
            soma+=numeros[i];
            
       }
        System.out.println("A media é: "+soma/numeros.length);
       
    }
    
}
