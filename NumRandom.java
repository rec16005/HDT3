import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumRandom {
	public void generar(){
		try{
			  File file = new File("numerosRandom.txt");
			  // Para guardar algo en el archivo
			  Random randomito = new Random();
			  FileWriter writer = new FileWriter(file);
			  // Para leer el archivo
			  FileReader reader = new FileReader(file);
			  BufferedReader buffReader = new BufferedReader(reader);
			  StringBuffer stringBuff = new StringBuffer();
			  String linea;
			  // Se genera un número al azar y se guarda en el archivo
			  for (int i = 0; i < 3000; ++i){
				  int numero = randomito.nextInt(20);
				  writer.write(String.valueOf(numero) + "\n");
			  }
			  writer.flush();
			  writer.close();

			  while ((linea = buffReader.readLine()) != null){
				  stringBuff.append(linea);
				  stringBuff.append(" ");
			  }
			  reader.close();

			  String numeros = stringBuff.toString();
			  System.out.print("numeros: " + numeros);
			  System.out.print("numeros tamaño: " + numeros.length());

			  // Arreglo con los numeros random como elementos
			  String[] parts = numeros.split(" ");

		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
