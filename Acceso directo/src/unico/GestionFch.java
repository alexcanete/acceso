package unico;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import model.Persona;

public class GestionFch {
	
	private int longReg=5; // 5 caracteres * 2 = 10 , 4 int 8 double

	private RandomAccessFile fch;
	
	public GestionFch(String fileName) {
		abrirFichero(fileName);
	}

	private void abrirFichero(String fileName) {
		try {
			fch = new RandomAccessFile(fileName, "rw");
			
		}catch (FileNotFoundException e) {
			System.err.println("El fichero no existe");
		}
		
	}
	public void cerrarFichero() {
		try {
			fch.close();
		}catch(IOException e) {
			System.err.println("El fichero no puede cerrarse");

		}
	}

	public void escribirRegistro(int numReg, Persona persona) {
		try {
			fch.seek(getposicion(numReg));
			
			//Nombre
			
			String nombre = Persona.getNombre();
			char letra = 0;
			
			for(int i = 0; i < 5; i++) {
				letra=(i<nombre.length()) ? nombre.charAt(i): ' ';
				fch.writeChar(letra);
			}
			
			//Edad
			
			
			fch.writeInt(persona.getEdad());
			
			
			
			//altura
			
			
			fch.writeDouble(persona.getAltura());
		}catch(IOException e) {
			System.err.println("El fichero no puede cerrarse");

		}
	}

	private long getposicion(int numReg) {
		
		return (numReg)-1*longReg;

	}

	public Persona leerRegistro(int numReg) {
		String nombre ="";
		int edad =0;
		double altura =0.0;
		
		try {
			long posicion = getposicion(numReg);
			fch.seek(posicion);
			
			for(int i = 0; i < 5; i++) {
				nombre += fch.readChar();
			}
			
			edad=fch.readInt();
			
			altura = fch.readDouble();
			
		}catch (IOException e) {
			System.err.println("No se puede acceder");
		}
		
	
		
		return null;
	}
	
}
