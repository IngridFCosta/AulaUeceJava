/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08;

import java.util.Scanner;

/**
 *
Faça um programa em que o usuário digita os 3 lados de um 
* triângulo, e será verificado se o triangulo é equilátero,
* isósceles ou escaleno?
 *
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int lado1,lado2,lado3,soma;
        lado1=ler.nextInt();
        lado2=ler.nextInt();
        lado3=ler.nextInt();
        soma=lado1+lado2+lado3;
        
        if(lado1+lado2 > lado3 && lado1+lado3 > lado2 && lado2+lado3>lado1){
            if(lado1==lado2&& lado2==lado3){
                System.out.println("O triangulo é equilatero");  
            }
            else if(lado1!=lado2&&lado2!=lado3){
                System.out.println("O triangulo é escaleno"); 
            }
            else if(lado1==lado2|| lado1==lado3|| lado2==lado3){
                System.out.println("O triangulo é Isosceles");   
            } 
        }
       else{
            System.out.println("As medidas nao satisfazem as condições para formação de um triangulo");
                
        }   
        
        
        
    }
    
}
