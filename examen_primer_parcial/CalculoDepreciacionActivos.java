package examen_primer_parcial;

import java.util.*;

public class CalculoDepreciacionActivos {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		double costodelactivo,depresiacionporunidaddeproducto, fraccion;
		int  vidautil,vidautilenunidades,valorresidual;
		int valordedesecho,tasadedoblesaldo, importedepreciable;
		
		
          System.out.println("_______Bienvenido______");
          System.out.println("En que Metodo Desea Calcular la Depresiacion: ");
  		System.out.println("1- Metodo De Linea Recta ");
  		System.out.println("2- Metodo De La Suma De Los Digitos por año ");
  		System.out.println("3- Metodo De Las Unidades Productivas");
  		System.out.println("4. Metodo De Reduccion De Saldo");
          int op = sc.nextInt();
          
          switch(op) {
          case 1: {
        	  System.out.print("|Ingrese el Costo del Activo =  ");
        	  costodelactivo = sc.nextDouble();
        	  System.out.print("|Ingrese el valor del desecho = ");
        	  valordedesecho = sc.nextInt();
        	  System.out.print("|Ingrese Vida Util = ");
        	  vidautil = sc.nextInt();
        	  System.out.println("|La Depreciacion anual es = " + metodolinearecta(  costodelactivo ,  valordedesecho,  vidautil) );
        	  break;
          }
          case 2: {
  			System.out.print("|Ingrese el importe depreciable = ");
  			importedepreciable = sc.nextInt();
  			System.out.print("|Ingrese fraccion = ");
  			fraccion = sc.nextDouble();
  			System.out.println("|La depreciacion anual es =  " + metododelasumadelosdigitosporaño( importedepreciable ,  fraccion) );
  			break;
  		}
  		case 3: {
  			System.out.print("|Ingrese costo del activo = ");
  			costodelactivo = sc.nextInt();
  			System.out.print("|Ingrese el valor de desecho = ");
  			valordedesecho = sc.nextInt();
  			System.out.print("|Ingrese vida util en unidades = ");
  			vidautilenunidades = sc.nextInt();
  			System.out.println("|La depreciacion anual es : "  + metododelasunidadesproductivas( costodelactivo,  valordedesecho, vidautilenunidades));
  			
  			break;
  		}
  		case 4: {
  			System.out.println("");
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
        	  
        	  depreciacionanual = importedepreciable * fraccion;
        	 
			return depreciacionanual;
          }
          private static double metododelasunidadesproductivas(double valordedesecho, int costodelactivo, int vidautilenunidades) {
        	  double  depreciacionanual;
        	
    			
    			depreciacionanual = (costodelactivo - valordedesecho) / (vidautilenunidades);
			return depreciacionanual;
	}
        

}
