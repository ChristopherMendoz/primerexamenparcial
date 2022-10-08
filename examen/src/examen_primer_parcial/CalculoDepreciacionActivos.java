package examen_primer_parcial;

import java.util.Scanner;

public class CalculoDepreciacionActivos {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		double costodelactivo,depresiacionporunidaddeproducto, fraccion;
		int  vidautil,vidautilenunidades,valorresidual;
		int valordedesecho,tasadedoblesaldo, importedepreciable;
		
		
        System.out.println("|-------------------Bienvenido-------------------|");
        System.out.println("Estos son los Metodos disponibles para calcular la depreciacion. " );
        System.out.println("|-------------------------|");
  		System.out.println("|1- Metodo De Linea Recta |");
  		System.out.println("|-------------------------|");
  		System.out.println("|--------------------------------------------|");
  		System.out.println("|2- Metodo De La Suma De Los Digitos por año |");
  		System.out.println("|--------------------------------------------|");
  		System.out.println("|--------------------------------------|");
  		System.out.println("|3- Metodo De Las Unidades Productivas |");
  		System.out.println("|--------------------------------------|");
  		System.out.println("|--------------------------------|");
  		System.out.println("|4. Metodo De Reduccion De Saldo |");
  		System.out.println("|--------------------------------|");
  		 System.out.print("En que Metodo Desea Calcular la Depresiacion: " );
          int op = sc.nextInt();
          
          switch(op) {
          case 1: {
        	  System.out.print("|Ingrese el Costo del Activo = C$ ");
        	  costodelactivo = sc.nextDouble();
        	  System.out.print("|Ingrese el valor del desecho = C$ ");
        	  valordedesecho = sc.nextInt();
        	  System.out.print("|Ingrese Vida Util = C$ ");
        	  vidautil = sc.nextInt();
        	  System.out.println("|-------------------------------------------|");
        	  System.out.println("|La Depreciacion anual es = C$" + metodolinearecta(  costodelactivo ,  valordedesecho,  vidautil) );
        	  System.out.println("|-------------------------------------------|");
        	  break;
          }
          case 2: {
  			System.out.print("|Ingrese el importe depreciable = C$ ");
  			importedepreciable = sc.nextInt();
  			System.out.print("|Ingrese fraccion =  ");
  			fraccion = sc.nextDouble();
  			System.out.println("|---------------------------------------------|");
  			System.out.println("|La depreciacion anual es = C$" + metododelasumadelosdigitosporaño( importedepreciable ,  fraccion) );
  			System.out.println("|---------------------------------------------|");
  			break;
  		}
  		case 3: {
  			System.out.print("|Ingrese costo del activo = C$ " );
  			costodelactivo = sc.nextInt();
  			System.out.print("|Ingrese el valor de desecho = C$ ");
  			valordedesecho = sc.nextInt();
  			System.out.print("|Ingrese vida util en unidades = C$ ");
  			vidautilenunidades = sc.nextInt();
  			System.out.println("|---------------------------------------------|");
  			System.out.println("|La depreciacion anual es : C$"  + metododelasunidadesproductivas( costodelactivo,  valordedesecho, vidautilenunidades) );
  			System.out.println("|---------------------------------------------|");	
  			break;
  		}
  		case 4: {
	     int vUtil;
	     int VLibros;
	     Double TazaD,num;
	     
	     System.out.println("|Digite un numero para la taza de depreciacion :");
	     num=sc.nextDouble();
	     System.out.println("|Digite la vida util :");
	     vUtil=sc.nextInt();
	   
	      TazaD = num/vUtil*2;
	      System.out.println("|La taza de depreciacion es : C$" + TazaD);
	    
	      System.out.println("|Ingrese el valor en libros : C$");
	      VLibros=sc.nextInt();
	   
	      
	      double depreciacionAnual = TazaD*VLibros;
	      
	      System.out.println("|La depreciacion anual es  : " + depreciacionAnual);
	      
	     
    break;
  		}
          }
          }
          private static double metodolinearecta( double costodelactivo , int valordedesecho, int vidautil) {
        	  double depreciacionanual;
        	  
        	  depreciacionanual = (costodelactivo - valordedesecho) / (vidautil);
			return depreciacionanual;
          }
          private static double metododelasumadelosdigitosporaño(int importedepreciable , double fraccion) {
        	  double  depreciacionanual;
        	  
        	  depreciacionanual = (importedepreciable )* (fraccion);
        	 
			return depreciacionanual;
          }
          private static double metododelasunidadesproductivas(double valordedesecho, double costodelactivo, double vidautilenunidades) {
        	  double  depreciacionanual;
        	
    			
    			depreciacionanual = (costodelactivo-valordedesecho)/vidautilenunidades;
			return depreciacionanual;
	}
        

}


