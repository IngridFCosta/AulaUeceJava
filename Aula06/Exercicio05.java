
package exerciciosaulauece.Aula06;

import java.util.Scanner;
//Faça um programa em que o usuário digite 10 números e imprima eles.
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int num=0,i=0;
        for(i=1;i<=10;i++){
            num=ler.nextInt();
        System.out.println("O "+i+"º numero digitado foi:"+num);
       }
      
    }
}
