/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab2;
import java.util.Random;

/**
 *
 * @author 1710502
 */
public class JavaLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        
        double x = 8.1, a = 2.5, b = 7.7, c = -4.32;
        double y = Math.exp(a*(Math.cos(x+2)))-(Math.exp((-Math.sin(b*x))))/(c-(Math.pow(x,1/3.0))); 
        double x1 = 1 +(10 - 1)* rand.nextDouble();
        double a1 = 1 +(10 - 1)* rand.nextDouble();
        double b1 = 1 +(10 - 1)* rand.nextDouble();
        double c1 = 1 +(10 - 1)* rand.nextDouble();
        
      
        
        double y1 =Math.exp(a1*(Math.cos(x1+2)))-(Math.exp((-Math.sin(b1*x1))))/(c1-(Math.pow(x1,1/3.0))); 
        System.out.println(y);
System.out.println(y1);
        // TODO code application logic here
    }
    
}
