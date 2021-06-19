
package exerciciosaulauece.Aula06;

import java.util.Scanner;

/**
 *
 * Faça um programa em que o usuário entre com com os
números, e após cada entrada o programa imprimirá se o
numero é impar ou par.
*/
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int totNumeros,numero;
        System.out.println("Quantos numeros você quer mostrar?");
        totNumeros=ler.nextInt();
        
        for(int i=0;i<totNumeros;i++){
            numero=ler.nextInt();
            if(numero%2==0){
                System.out.println("É par!");
            }
            else{
                System.out.println("É impar!");
            }    
        }
        
    }
}
