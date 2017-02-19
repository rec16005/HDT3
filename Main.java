import java.util.*;
import java.io.*;

/**
 * @author Cristopher recinos 16005
 * @author Andrea Cordón 16076 
 * @author Daniel Rodríguez 15796
 * @author Samantha Duarte 16256
 */

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Random randomito = new Random();
		MergeSort ms = new MergeSort();	// Metodo de la clase que ordenará la lista de números random
		
		ArrayList<Integer>numeros = new ArrayList<Integer>(); // Array de numeros random
		
		// Se ingresa cada numero generado a un ArrayList
		for (int i = 0;i <20;++i){
			int numero = randomito.nextInt(10);
			numeros.add(numero); // Se llena el array de numeros random como elementos
		}
		
		// Para ingresar los numeros en el archivo
		try {
			File file = new File("nums.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(String.valueOf(numeros));
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Para leer el archivo
		try {
			File file = new File("nums.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
			System.out.println("Se ingreso en el archivo: ");
			System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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
			
	
	
	
	
	}	
}
