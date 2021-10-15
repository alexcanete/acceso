package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import model.Conexion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fichero = new File ("conexion.cfg");
		
		Conexion conn = leerConfiguacion(fichero);
		
		
	}

	private static Conexion leerConfiguacion(File fichero) {
		Conexion contenido = new Conexion();
		final String SEPARADOR = ":";
		HashMap<String,String> mapa = new HashMap<String, String>();

		try {
			FileReader fch = new FileReader(fichero);
			BufferedReader bufLectura = new BufferedReader(fch);
			
			String lineaLeida= "" ;
			
			String [] campos;
			
			lineaLeida = bufLectura.readLine();
			while(lineaLeida != null) {
				campos = lineaLeida.split(SEPARADOR);
			}
				

			
			
		}catch (FileNotFoundException e) {
			System.out.println("No hay fichero");
		}catch(Exception e) {
			System.out.println("error: " + e.getMessage());
		}
		//contenido.setHost(mapa.get("HOST"));
		
		return contenido;
	}

	
	
	
}
