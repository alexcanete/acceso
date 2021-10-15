package unico;
import java.io.File;
public class Principal {

	public static void main(String[] args) {
		//apunta a fichero
		
		String fichero = "ficheros\\ciudades.txt";
		File fch = new File(fichero);
		
		if (fch.exists()) {
			System.out.println("Si exists");
			
			
			String fchNombreArhivo = fch.getName();
			String fchCarpetaPadre = fch.getParent();
			String fchRutaAbsoluta = fch.getAbsolutePath();
			long fchBytes = fch.length();
			
			boolean fchPuedeLeer = fch.canRead();
			boolean fchPuedeEscribir = fch.canWrite();
			boolean fchPuedeEjecutar = fch.canExecute();
			
			System.out.println("nombre archivo " + fchNombreArhivo);
			System.out.println("Carpeta Padre " + fchCarpetaPadre);
			System.out.println("Ruta absoluta " + fchRutaAbsoluta);
			System.out.println("Tamaño (bytes) " + fchBytes);
			System.out.println("Se puede leer : " + SiNo(fchPuedeLeer));
			System.out.println("Se puede ejecutar: " + SiNo(fchPuedeEjecutar));
			System.out.println("Se puede Escritura " + SiNo(fchPuedeEscribir));
			


			
		}else {
			System.out.println("NO exists");
		}
		

		}
		private static String SiNo(boolean exp) {
			return exp ? "SI" : "NO";
		
		
		
	}

}
