/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
         int [] numeros=new int[10];
         int soma=0;
        for(int i=0;i< numeros.length;i++){
            numeros[i]=ler.nextInt();   
        }
         for(int i=0;i< numeros.length;i++){
            System.out.println("Indice "+i+" valor"+numeros[i]);   
        }
    }
    
}
