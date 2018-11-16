/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15nov;

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
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int n = 0;
        int m = 0;

        System.out.println("Ingrese el valor de N");
        n = reader.nextInt();
        System.out.println("Ingrese el valor de m");
        m = reader.nextInt();

        int[][] num = new int[n][m];
        int[][] num2 = new int[m][n];
        for (int x = 0; x < num.length; x++) {
            for (int y = 0; y < num[x].length; y++) {
                System.out.println("Introduzca el valor de: [" + x + "," + y + "]");
                num[x][y] = reader.nextInt();
                num2[y][x] = num[x][y];
            }
        }

        //int[][] num = new int[n][m];
        //for (int i = 0; i < num.length; i++) {
        //    for (int j = 0; j < num.length; j++) {
        //          num[i][j]=i+j;
        //    }            
        //}
        for (int x = 0; x < num.length; x++) {
            for (int y = 0; y < num[x].length; y++) {
                System.out.print(num[x][y]);

            }
            System.out.println("");   
            
           }
        System.out.println("");
        for (int x = 0; x < num2.length; x++) {
            for (int y = 0; y < num2[x].length; y++) {
                System.out.print(num2[x][y]);

            }
            System.out.println("");   
            
           }
        //for (int x = 0; x < num2[x].length; x++) {
        //    for (int y = 0; y < num2[y].length; y++) {
        //        System.out.print(num2[x][y]);
        //    }
        //}
        
    }
}