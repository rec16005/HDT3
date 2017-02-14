import java.util.*;
import java.io.*;

//Desarrolle un programa que genere al azar y guarde en un
//archivo, n�meros enteros. Debe generarse hasta 3000 n�meros.

//Luego utilice su programa para leer los datos de ese
//archivo, guardarlos en un arreglo y ordenarlos, usando
//cada uno de los algoritmos de sort. Utilice el Profiler
//para medir el tiempo empleado en el ordenamiento para:
//10 n�meros hasta 3000 n�meros. El prop�sito ser�
//generar una gr�fica con el eje Y mostrando el tiempo
//y el eje X mostrando la cantidad de n�meros ordenados.
//Usted puede seleccionar los intervalos que considere
//adecuados en el eje X.

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Archivo random = new Archivo();
		BufferedReader b = new BufferedReader(new FileReader("numerosRandom.txt"));
		String linea = b.readLine();
		String[] array = linea.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

		int[] results = new int[array.length];
		for (int i = 0; i < array.length; i++) {
		    try {
		        results[i] = Integer.parseInt(array[i]);
		    } catch (NumberFormatException nfe) {
		        //NOTE: write something here if you need to recover from formatting errors
		    };
		}

	}

}
