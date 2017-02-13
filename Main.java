import java.util.*;
import java.io.*;

//Desarrolle un programa que genere al azar y guarde en un 
//archivo, números enteros. Debe generarse hasta 3000 números. 

//Luego utilice su programa para leer los datos de ese 
//archivo, guardarlos en un arreglo y ordenarlos, usando 
//cada uno de los algoritmos de sort. Utilice el Profiler
//para medir el tiempo empleado en el ordenamiento para: 
//10 números hasta 3000 números. El propósito será 
//generar una gráfica con el eje Y mostrando el tiempo
//y el eje X mostrando la cantidad de números ordenados.
//Usted puede seleccionar los intervalos que considere 
//adecuados en el eje X. 

public class Main implements Comparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			File file = new File("numerosRandom.txt");
			//Para guardar algo en el archivp
			Random randomito = new Random();
			FileWriter writer = new FileWriter(file);
			//Para leer el archivo
			FileReader reader = new FileReader(file);
			BufferedReader buffReader = new BufferedReader(reader);
			StringBuffer stringBuff = new StringBuffer();
			String linea;
			//Se genera un numero al azar y se guarda en el archivo
			for (int i = 0;i < 20;++i){
				int numero = randomito.nextInt(10); 
				writer.write(String.valueOf(numero) + "\n");
			}
			writer.flush();
			writer.close();
						
			while ((linea = buffReader.readLine()) != null) {
				stringBuff.append(linea);
				stringBuff.append(" ");
			}
			reader.close();
			
			String numeros = stringBuff.toString();
			System.out.print("numeros: " + numeros);
			System.out.print("numeros tamaño: " + numeros.length());

			//Arreglo con los numeros random como elementos
			String[] parts = numeros.split(" ");

			if (parts.length >2){
			
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
			for (int i = 0; i < arreglo2.length; i++)
			{
				String temp = arreglo2[i];
				arreglo2[i] = arreglo2[arreglo2.length-1-i];
				arreglo2[arreglo2.length-1-i] = temp;
			    System.out.print(arreglo2[i]+" ");
				}
			}
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
