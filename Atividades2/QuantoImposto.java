/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5q5;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class P5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double salario;
        
        System.out.print("Digite seu salario: ");
        salario = in.nextDouble();
        
        if (salario <= 600){
            System.out.println("Voce e isento");
        }
        else if (salario > 600 && salario <= 1200) {
            System.out.println("20%");
        }
        else if (salario > 1200 && salario <= 2000){
            System.out.println("25%");
        }
        else {
            System.out.println("30%");
        }
    }
    
}
