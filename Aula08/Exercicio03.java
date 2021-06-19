
package Aula08;

import java.util.Arrays;
import java.util.Scanner;

/*Faça um programa em que o usuário irá digitar 3 notas,
logo se  a média  for maior ou igual a 7 “o aluno está aprovado”,
se for menor que 7 ou igual a 4 “o aluno está de prova final”, 
e por ultimo se o aluno tiver uma média menor que 4 “está reprovado”?
*/

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double nota1, nota2, nota3, media;
        nota1=ler.nextDouble();
        nota2=ler.nextDouble();
        nota3=ler.nextDouble();
        media=(nota1+nota2+nota3)/3;
        
        if(media >=7.0){
            System.out.println("O aluno está aprovado");
        }
        else if(media<7.0 || media==4.0){
            System.out.println("O aluno está de prova final");
        }
        else{
            System.out.println("O aluno está reprovado");
        }
 
    }
    
    
}
