import java.util.*;
import java.io.*;

/**
 * @author Cristopher recinos 16005
 * @author Andrea Cord�n 16076
 * @author Daniel Rodr�guez 15796
 * @author Samantha Duarte 16256
 */

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Random randomito = new Random();

		MergeSort ms = new MergeSort();	// Metodo de la clase que ordenar� la lista de n�meros random
		//GnomeSort gs = new GnomeSort();
		//QuickSort qs = new QuickSort();
		RadixSort rs = new RadixSort();

		ArrayList<Integer>numeros = new ArrayList<Integer>(); // Array de numeros random

		// Se ingresa cada numero generado a un ArrayList
		for (int i = 0; i <3000; ++i){
			int numero = randomito.nextInt(3000);
			// int numero = i;
			numeros.add(numero); // Se llena el array de numeros random como elementos

		}
		Archivo.guardarEnArchivo(numeros);
		Archivo.leerArchivo(numeros);

		// Esta es la lista de numeros random que se ordenara con cada sort
		int listaAordenar[]  = new int[numeros.size()];
        Iterator<Integer> iter = numeros.iterator();
        for (int j=0;iter.hasNext();j++) {
        	listaAordenar[j] = iter.next();
        }

//--------------------- SE ORDENAN LOS NUMEROS CON EL MERGE SORT ---------------------

        listaAordenar= ms.mergeSort(listaAordenar);
        System.out.println("Numeros ordenados por Merge Sort: ");
        for (int i=0;i<listaAordenar.length;i++) {
            System.out.println(listaAordenar[i]+" ");
        }
//------------------------------------------------------------------------------------

//--------------------- SE ORDENAN LOS NUMEROS CON EL RADIX SORT ---------------------
		listaAordenar = rs.sort(listaAordenar);
		System.out.println("Numeros ordenados por Radix Sort");
		for (int i = 0; i < listaAordenar.length; i++){
		System.out.println(listaAordenar[i] + " ");
				}





	}
}
