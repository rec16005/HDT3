import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivo{

	/**
	 * @param numeros
	 * @return
	 */
	public static ArrayList<Integer> guardarEnArchivo(ArrayList<Integer> numeros){
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
		return numeros;
	}
	public static void leerArchivo(ArrayList<Integer> numeros){
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
	}
}