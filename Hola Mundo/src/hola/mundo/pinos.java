/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

/**
 *
 * @author DivalUser
 */
public class pinos {
    int max=20;
		int j=1,k=0;
 
		// primer arbol
 
		System.out.println();
		for(int i=0;i<=max;i+=2)
		{
			int spc=(5+(int)Math.ceil(max/2)-j);
			String spaces=new String(new char[spc]).replace("\0"," ");
			String asteri=new String(new char[i+1]).replace("\0","*");
			System.out.println(spaces+asteri);
			j++;
		}
}
