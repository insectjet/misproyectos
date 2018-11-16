/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscripcion;

import java.util.Scanner;

/**
 *
 * @author DivalUser
 */
public class Inscripcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       boolean salir = false;
       int op; 
         
       
       while(!salir){
           System.out.println("1. inscribir participante");
           System.out.println("2. mostrar listado de datos");
           System.out.println("3. mostrar listado por marcas");
           System.out.println("4. Salir del programa");
            
           System.out.println("Escribe una de las opciones");
           op = teclado.nextInt();
           
           
           String [][] matrix = new String[10][4];
           int cont = 0;
           String nombre; 
          
           
           
           switch(op){
               case 1:
                   System.out.println("inscribir participante");
                   System.out.println("ingrese el nombre");
                   nombre = teclado.next();
                   System.out.println("el nombre es " + nombre);
                   break; 
               case 2:
                   System.out.println("listado de datos");
                   System.out.println();                   
                   break;
                case 3:
                   System.out.println("listado por marcas");
                   break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
           
           
       }
       
    }
    
}
