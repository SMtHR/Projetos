/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5q3;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class P5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String nome;
        int idade , diasDeVida;
        
        System.out.println("Digite seu nome:");
        nome = in.next();
        
        System.out.println("Digite sua idade:");
        idade = in.nextInt();
        
        diasDeVida = idade * 365;
        
        System.out.println(nome + ", você já viveu " + diasDeVida + " dias!");
    }
    
}
