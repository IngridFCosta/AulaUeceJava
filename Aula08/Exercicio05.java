/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int numero1, numero2, numero3;
        numero1=ler.nextInt();
        numero2=ler.nextInt();
        numero3=ler.nextInt();
        
        if(numero1 > numero2&& numero1> numero3){
            System.out.println("O "+numero1+" é o maior");      
        }
        else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("O "+numero2+" é o maior");         
        }
        else if(numero3 > numero1 && numero3> numero2){
             System.out.println("O "+numero3+" é o maior");
        }
        else{
             System.out.println("Os numeros "+ numero1+","+numero2+","+ numero3+ " são iguais");
        }
       
    }
    
}
