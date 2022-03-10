/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5q1;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class P5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner in = new Scanner(System.in);
       double numero ;
       System.out.println("Digite o numero");
       numero = in.nextDouble();
       
       if (numero < 10) {
           System.out.println("Este numero e menor que 10");
            }
            else if (numero == 10) {
               System.out.println("Este numero e 10");
            }
       else {
           System.out.println("Este numero e maior que 10");
       }
    }
    
}
