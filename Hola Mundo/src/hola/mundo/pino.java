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
public class pino {

    int max = 20;
    int j = 1, k = 0;

    // primer arbol
    System.out.println ();
    for(int i = 0;i<=max ;i += 2

    
        )
		{
			int spc = (5 + (int) Math.ceil(max / 2) - j);
        String spaces = new String(new char[spc]).replace("\0", " ");
        String asteri = new String(new char[i + 1]).replace("\0", "*");
        System.out.println(spaces + asteri);
        j++;
    }

    // tronco
    if(max

    
        >=7)
		{
			int spc = (5 + (int) Math.ceil(max / 2) - 2);
        String spaces = new String(new char[spc]).replace("\0", " ");
        String asteri = new String(new char[3]).replace("\0", "*");
        System.out.println(spaces + asteri);
        System.out.println(spaces + asteri);
    }

    System.out.println ();

    // segundo Arbol
    j  = 1;
    for(int h = 1;
    h<
    3;h

    
        ++)
		{
			for (int i = k; i <= max; i += 2) {
            int spc = (5 + (int) Math.ceil(max / 2) - j);
            String spaces = new String(new char[spc]).replace("\0", " ");
            String asteri = new String(new char[i + 1]).replace("\0", "*");
            System.out.println(spaces + asteri);
            j++;
        }
        k = 5;
        j = 3;
    }

    // tronco
    if(max

    
        >=7)
		{
			int spc = (5 + (int) Math.ceil(max / 2) - 2);
        String spaces = new String(new char[spc]).replace("\0", " ");
        String asteri = new String(new char[3]).replace("\0", "*");
        System.out.println(spaces + asteri);
        System.out.println(spaces + asteri);
    }

    System.out.println ();
}
} 
}
