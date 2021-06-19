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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int numero1, numero2;
        numero1=ler.nextInt();
        numero2=ler.nextInt();
        
        if(numero1 > numero2){
            System.out.println("O "+numero1+" é o maior");      
        }
        else if(numero2>numero1){
            System.out.println("O "+numero2+" é o maior");        
        }
        else{
            System.out.println("Os numeros "+ numero1+" e "+numero2+" são iguais");
        }
    }
}
