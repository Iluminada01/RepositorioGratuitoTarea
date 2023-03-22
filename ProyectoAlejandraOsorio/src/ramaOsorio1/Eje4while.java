package ramaOsorio1;
import java.util.Scanner;
public class Eje4while {

	public class Eje4whilee {
		private static Scanner leer;
		    

		public static void main (String []arg) {
		    leer=new Scanner (System.in);
		    int contador=0;
		    int suma=0;
		    int valor;
		    
		    System.out.print("Introduzca un número: ");
		    valor=leer.nextInt();
		    while (valor>0) {
		   	 suma=suma+valor;
		   	 contador++;
		   	 System.out.print("Introduzca un número: ");
		   	 valor=leer.nextInt();
		   	 
		   			 
		    }
		    float media=suma/(float)contador;
		   	 
		    System.out.println("La media es:"+media);
		    
		}
		}



}
