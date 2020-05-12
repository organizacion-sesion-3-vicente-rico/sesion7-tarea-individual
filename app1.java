import java.io.*; 
import java.util.Scanner;

public class UD2Ejer505 { 
  public static void main(String[] args) { 

    try { 

    
		  Scanner entrada = new Scanner(System.in); 
	  	int ancho, alto;
	  	String cad;
      
	  	System.out.print("Anchura rectangulo: "); 
  		ancho = entrada.nextInt();
  		
	  	System.out.print("Altura rectangulo: "); 
	  	alto = entrada.nextInt();
		

		
      
    } catch (IOException e) { 
      System.out.println("Ha habido problemas: " + e.getMessage() );
    }
    
  } 
}
