package Arrays;
import java.util.*;

/***
 * Ejercico de Matrices, crear una aplicacion que pidas las dimensiones de una matriz
 * Posteriormente, pida datos para rellenar dicha matriz para crearla.
 * Array unidimensional
 * Array bidimensional
 * 
 * @param void
 * 
 */
public class ejr_matrices {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		optionSelect();
	}
	
	/***
	 * Visualizacion del texto principal al usuario
	 * @params void
	 */
	public static void optionSelect() {
		int option=0;
		int[] dimension2=new int[2];
		/***
		 *El usuario eligira una de las dos opciones, estas estarán controladas para evitar que meta datos erróneos.
		 */
		do {		
				try {				
					System.out.println("|--------- Ejercicio de Arrays---------|");
					System.out.println("Elige una de las dos opciones:");
					System.out.println("[1] Array Dimensional.");
					System.out.println("[2] Array Bidimensional.");
					option=sc.nextInt();
				}catch (Exception e) {
					System.out.println("[-] Error al introducir la opcion. Debes de elegir entre la opcion 1 y 2");
					option=0;
					sc.nextLine();
				}
		}while(option<1 || option>2);
		
		/***
		 * Posteriomente se le dara las opciones pertinentes elegidas anteriormente
		 */
		while(true) {
			try {
				if(option!=0 && option==1) {					
					System.out.print("[+] Introduce las dimensiones del array:");
					dimension2[0]=sc.nextInt();
				}else {
					System.out.print("[+] Introduce las dimensiones del primer array:");
					dimension2[0]=sc.nextInt();
					System.out.println("");
					System.out.print("[+] Introduce las dimensiones del segundo array:");
					dimension2[1]=sc.nextInt();					
				}
				sc.nextLine();
				inputArray(option,dimension2);
				break;
			} catch (Exception e) {
				System.out.println("[-] Error al introducir la dimension del array.");
				sc.nextLine();
			}
		}
	}
	
	public static void inputArray(int opc,int[] longitud) throws InterruptedException {		
		String aleatorio="";
		do {
			try {				
				System.out.print("[+]¿Desea rellenar el array aleotoriamente? (S/N):");
				aleatorio=sc.nextLine();
				aleatorio=aleatorio.toUpperCase();
				System.out.println(aleatorio+"...");
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("[-] Fatal error a la hora de elegir la opcion \"S\" o \"N\".\n");
				sc.nextLine();
			}
		}while(aleatorio=="S" || aleatorio=="N");
		
		if(opc==1) {
			System.out.println("[+] Se ha creado el array dimensional...");
			int[] arr=new int[longitud[0]];
			if(aleatorio.equals("S")) {
				System.out.println("[+] Rellenando...");
				Thread.sleep(1000);
				randomDimensional(arr);
			}else {
				try {
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("[-] Fatal error a la hora de ingresar datos.");
				}
			}
		}else {
			System.out.println("[+] Se ha creado el array bidimensional...");
			int [][] arr=new int[longitud[0]][longitud[1]];	
		}
	}
	
	public static void randomDimensional(int[] arr) {
		for (int i =0; i<arr.length; i++) {
			int value=(int) (Math.random()*(i+1)+1)*10;
			arr[i]=value;
			System.out.println("[+] El array con posicion ["+(i)+"] tiene el valor "+(arr[i]));
		}		
	}
	
	


}
