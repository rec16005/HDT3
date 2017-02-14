import java.util.*;
import java.io.*;

public class MergeSort {
	Archivo archivo = new Archivo();
	String nums = archivo.getNumeros();
	
	//Arreglo con los numeros random como elementos
	String[] parts = nums.split(" ");
	
	if (parts.length > 2){
			String[] arreglo1 = new String[parts.length/2];
			String[] arreglo2 = new String[parts.length/2];
				
			System.out.print("\n");
			System.out.print("arreglito 1: ");
			
			for(int i = 0 ; i < parts.length/2 ; ++i) {
			    arreglo1[i] = parts[i];
			    System.out.print(arreglo1[i]+" ");
			}
			
			System.out.print("\n");
			System.out.print("arreglito 2: ");
			int n = parts.length;
			
			for(int i = n -1 ; i >= n/2 ; --i) {
			    arreglo2[(n-1)-i] = parts[i];
			    //System.out.print(arreglo2[19-i]+" ");
			}
			
			for (int i = 0; i < arreglo2.length; i++){
				String temp = arreglo2[i];
				arreglo2[i] = arreglo2[arreglo2.length-1-i];
				arreglo2[arreglo2.length-1-i] = temp;
			    System.out.print(arreglo2[i]+" ");
			}
		}	
	}
}
