/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14112018;

import java.util.Scanner;

/**
 *
 * @author DivalUser
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //int m = 0;
        //m = teclado.nextInt();
        //int a = 0;
        //a = teclado.nextInt();
        System.out.println("ingrese el dia:");
        int d = teclado.nextInt();
        int m = teclado.nextInt();
        int a = teclado.nextInt();
        boolean dd = false;

        while (d < 1 || d > 30) {
            System.out.println("ingrese el dia menor o igual a 30:");
            System.out.println("ingrese el dia:");
            d = teclado.nextInt();

            while (m < 1 || m > 12) {
                System.out.println("ingrese el mes menor o igual a 12:");
                System.out.println("ingrese el mes:");
                m = teclado.nextInt();
            }    
                System.out.println("ingrese el año:");
                a = teclado.nextInt();
            

        }

        //int izq = 0;
        //int der = palabra.length() -1;
        //boolean parar = false;
        //while (der >= izq && !parar) {    
        //    System.out.println(palabra.charAt(izq)+
        //        "==" + palabra.charAt(der) + " -> " +
        //        (palabra.charAt(izq) == palabra.charAt(der)));
        //izq++;
        //der--;
        //if ((der == izq || > der) && !parar){
        //    System.out.println("Es un Polindromo");
        //        }else {
        //    System.out.println("No es un polindromo");
        //}
        //System.out.println(palabra.charAt(izq)+
        //        "==" + palabra.charAt(der) + " -> " +
        //       (palabra.charAt(izq) == palabra.charAt(der)));
        //izq++;
        //der--;
    }

}
