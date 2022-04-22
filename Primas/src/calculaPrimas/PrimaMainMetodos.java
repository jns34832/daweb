package calculaPrimas;
import java.util.Scanner;
public class PrimaMainMetodos {
	
	/**
	 * Ejemplo para documentar con javadoc
	 * 
	 * @author Mari�n
	 * @version 2020-09 (4.17.0)
	 * @date 2022/04/22
	 *  
	 */
	

		static Scanner  teclado=new Scanner(System.in);
		
		/**
		 * 
		 * Metodo principal
		 * 
		 * Calcula la prima que le corresponde a uno o varios empleados en funcion
		 * de si es directivo o no y los meses que lleva trabajando
		 * 
		 */
		public static void main(String[] args) {

			int numEmple;
			String nomEmple;
			int meses;
			char esDirectivo;
			char respuesta;
			

			do {
				System.out.println("\nDATOS  EMPLEADO/A");
				numEmple=leerNumEmple();
				nomEmple=leerNomEmple();
				meses=leerMeses();
				esDirectivo=leerEsDirectivo();
				System.out.println("\n\tLe corresponde la prima "+hallarPrima(esDirectivo, meses));
				
				
				System.out.println("\n¿CALCULAR MAS PRIMAS? (S/N): ");
				respuesta=teclado.nextLine().toUpperCase().charAt(0);
			}while(respuesta=='S');		
		}

		
		/**
		 * 
		 * Este metodo calcula la prima del empleado en funcion de si es directivo o no
		 * y los meses que lleva trabajando
		 * 
		 * @param esDirectivo: indica si es directivo o no, meses: numero de meses que lleva trabajando
		 * 
		 * @return "P1", "P2", "P3", "P4". Devuelve la prima del empleado dependiendo de los parametros
		 * que recibe
		 * 
		 */
		public static String hallarPrima(char esDirectivo, int meses) {
			if(esDirectivo=='+') // ES DIRECTIVO
				if(meses>=12)
					return "P1";
				else
					return "P3";
			else 	// NO ES DIRECTIVO
				if(meses>=12)
					return "P2";
				else
					return "P4";
		}

		/**
		 * Este metodo permite introducir por pantalla el numero de empleado
		 * 
		 * @return numEmple. Devuelve el numero de empleado, que tiene que ser entre 100 y 1000
		 * 
		 */
		public static int leerNumEmple() {		
			int numEmple;
			do{
				System.out.println("NÚMERO [100-999]: ");
				numEmple = teclado.nextInt();
			}while(numEmple<100 || numEmple>999);		
			teclado.nextLine();
			return numEmple;
		}
		
		/**
		 * Este metodo lee por pantalla el nombre de empleado
		 * 
		 * @return nomEmple. Devuelve el nombre del empleado que tiene que tener un maximo de 10 caracteres
		 * 
		 */
		public static String leerNomEmple() {
			String nomEmple;
			do {
				System.out.println("NOMBRE (max 10 caracteres): ");
				nomEmple = teclado.nextLine();
			}while(nomEmple.length()>10);		
			return nomEmple;
		}
		
		/**
		 * 
		 * En este metodo se introduce por pantalla los meses de trabajo de un empleado
		 * 
		 * @return meses. Devuelve el numero de meses que debe ser mayor que 0
		 * 
		 */
		public static int leerMeses() {
			int meses;
			do {
				System.out.println("MESES DE TRABAJO: ");
				meses = teclado.nextInt();
			}while(meses<0);
			teclado.nextLine();
			return meses;
		}
		
		/**
		 * 
		 * En este metodo pregunta si el empleado es directivo
		 * 
		 * @return esDirectivo. Devuelve + si es directivo y - si no lo es
		 * 
		 */
		public static char leerEsDirectivo() {
			char esDirectivo;
			do {
				System.out.println("¿ES DIRECTIVO? (+/-): ");
				esDirectivo = teclado.nextLine().charAt(0);
			}while(esDirectivo!='+' && esDirectivo!='-');
			return esDirectivo;
		}
}

