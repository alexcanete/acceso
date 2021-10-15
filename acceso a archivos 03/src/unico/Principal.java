package unico;

import java.io.*;


public class Principal {

	public static void main(String[] args) {
		File nombreFichero = new File("notas.txt");
		//escribirFch(nombreFichero);
		leerFch(nombreFichero);
		
	}

	private static void leerFch(File nombreFichero){
		try {
			FileReader  fch = new FileReader(nombreFichero);
			
			int ascii;

			ascii = fch.read();

			while(ascii!=1){
				System.out.println((char)ascii);
				ascii = fch.read();
			}
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	private static void escribirFch(File nombreFichero) {
		try {
			FileWriter fch = new FileWriter(nombreFichero);
			
			String texto = "Hola";
			
			
			fch.write(texto);
			
			fch.close();
			
			
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*private static String teclado (String pregunta){
		System.out.println(pregunta);
		String respuesta = "";
		try {
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			respuesta = teclado.readLine();
		}catch{

		}
	}*/
	public void  copyFileFile(File nombreFchSource, File nombreFchTarget){
		try{
			FileReader fchSource = new FileReader(nombreFchSource);
			FileWriter fchTarget = new FileWriter(nombreFchTarget);

			int ascii;
			int cont = 0;

			ascii = fchSource.read();
			while(ascii != -1){
				cont++;
				fchTarget.write(ascii);
				ascii = fchSource.read();
			}
			
			fchSource.close();
			fchTarget.close();


		}catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");

		}catch(IOException e){
			System.err.println("error accediendo a archivos");
		}


	}

}
