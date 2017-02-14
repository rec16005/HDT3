import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Archivo {
	
	public String getNumeros() throws IOException {
		// TODO Auto-generated method stub
			File file = new File ("numerosRandom.txt");
			//Para guardar algo en el archivp
			Random randomito = new Random();
			FileWriter writer = new FileWriter(file);
			
	
			//Se genera un numero al azar y se guarda en el archivo
			for (int i = 0;i < 20;++i){
				int numero = randomito.nextInt(10); 
				writer.write(String.valueOf(numero) + "\n");
			}
			writer.flush();
			writer.close();
			
			//Para leer el archivo
			FileReader reader = new FileReader(file);
			BufferedReader buffReader = new BufferedReader(reader);
			StringBuffer stringBuff = new StringBuffer();
			String linea;		
			while ((linea = buffReader.readLine()) != null){
				stringBuff.append(linea);
				stringBuff.append(" ");
			}
			reader.close();
			
			String numeros = stringBuff.toString();
			System.out.print("numeros: " + numeros);	
			return numeros;	
	}
}
