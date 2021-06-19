/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosaulauece.Aula05;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exerc02Graus {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        Double grauC, grauF;
        
        grauC=ler.nextDouble();
        grauF=grauC*1.8+32;
        System.out.println(grauF+ " °F");
        
    }
    
}

