package osorio;

import java.util.Scanner;

public class Eje6for {
	private static Scanner leer;
	private static int nf;
	
	 public static void main(String[] args) {
	        leer= new Scanner(System.in);
	        System.out.print("Introduce el numero de filas: ");
	        nf=leer.nextInt();
	            // `nf` es el número total de filas
	            
	         System.out.println("Este es un mensaje que muestra un cambio en el main de este ejercicio");
	            int i, j, k;
	         
	            // hacer para cada fila
	            for (i = 1; i <= nf; i++)
	            {
	                // espacio de impresión
	                for (j = i; j < nf; j++) {
	                	System.out.print("4");/*esto es lo que no se rellena en el exterior del triangulo*/
	                }
	         
	                // impresión '*'
	                for (k = 1; k < 2*i; k++)
	                {
	                    // imprime '*' para los límites
	                    if (i == nf || (k == 1 || k == 2*i -1)) {
	                    	System.out.print("*");
	                    }
	                    else {
	                    	System.out.print("5");/*esto es lo que no se rellena en el centro*/
	                    }
	                }
	         
	                // pasar a la siguiente linea
	                System.out.print("\n");
	            }}}
	         
	          
	        



