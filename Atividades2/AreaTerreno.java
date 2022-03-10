/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5q2;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class P5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        double lado1 , lado2, area;
        
        System.out.println("Digite as dimensoes do terreno");
        lado1 = in.nextDouble();
        lado2 = in.nextDouble();
                      
        if (lado1 == lado2) {
            System.out.println("Lados nao podem ser iguais");
        }
        else {
            area = lado1 * lado2;
            System.out.println("Area do terreno: " + area);
        }
    }
    
}
