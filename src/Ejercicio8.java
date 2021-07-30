
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        double areac,radio;
        final double PI=3.1416;
        System.out.println("Digite el Radio");
        radio=teclado.nextDouble();
        areac=Math.pow(radio,2)*PI;
        System.out.println("El area del circulo es "+areac);
        
        
        
    }
    
}
