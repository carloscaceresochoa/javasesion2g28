
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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double km,cm,mt;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite el Numero de Kilometros a Convertir");
        km=teclado.nextDouble();
        mt=km*1000;
        cm=km*100000;
        System.out.println(km+" km convertidos a metros es "+mt);
        System.out.println(km+" km convertidos a centimetros es "+cm);
        
    }
    
}
