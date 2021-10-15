package unico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fch = new File("Personas.txt");
		String sTexto = "12345678912345678912345";
		
		//escribirFch(fch, sTexto);
		ArrayList<Persona> gente =leerPersona(fch);
		leerPersona(fch);
	} 

	private static void escribirFch(File fch, String txt) {
		try {
			//abrir fichero
			FileWriter fichero = new FileWriter(fch);
			//crear buffer
			BufferedWriter bufEscritura= new BufferedWriter(fichero);
			//escribir texto
			bufEscritura.write(txt);
			//vaciamos buffer
			bufEscritura.flush();
			//cerramos buffer
			bufEscritura.close();
			//cerramos fichero
			fichero.close();
		}catch(IOException ioe) {
			System.err.println("Error accediendo al fichero");
		}	}		
	
	private static ArrayList<Persona> leerPersona(File fch){
		ArrayList<Persona> contenido = new ArrayList<Persona>();
		try {
			FileReader fichero = new FileReader(fch);
			BufferedReader bufLectura = new BufferedReader(fichero);
			
			String slineaLeida;
			slineaLeida = bufLectura.readLine();
			while (slineaLeida !=null) {
				StringTokenizer campo = new StringTokenizer(slineaLeida, "#");
				String sNombre = campo.nextToken();
				String sApellidos = campo.nextToken();
				String sEdad = campo.nextToken();
				
				
				contenido.add(new Persona(sNombre, sApellidos, sEdad));
				
				slineaLeida = bufLectura.readLine();
			}
			
			
			bufLectura.close();
			fichero.close();
			
			
		}catch(FileNotFoundException e) {
			System.err.println("Error el fichero no existe");
			
		}catch(IOException e) {
			System.err.println("No se puede acceder");
		}
		
		return contenido;
	}
		
}
