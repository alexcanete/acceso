package unico;
import java.io.File;
public class Principal {

	public static void main(String[] args) {
		
		String fichero = "C:\\Users";
		File fch = new File(fichero);
		
		if (fch.exists()) {
			System.out.println("Si existe");
			
			if(fch.isDirectory()) {
				verSubCarpetas(fch);
				infoDir(fch);
				
				
			}else {
				infoFile(fch);
			}
			
			infoFile(fch);
			


			
		}else {
			System.out.println("NO existe");
		}
		

		}
	private static void infoFile(File fch) {
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
	}
	
	
		
		
		
		private static void infoDir(File fch) {
		System.out.println("isDirectory");
		
		long dirEspacioLibreBytes = fch.getFreeSpace();
		long dirEspacioLibreMB =fch.getFreeSpace() /1024 / 1024;
		long dirEspacioLibreGB =dirEspacioLibreMB / 1024;	
		System.out.println("Espacio Libre = " + dirEspacioLibreBytes + "Bytes" );
		
		File[] dirContenido = fch.listFiles();
				
		
		for (File f : dirContenido) {
			String info = f.getName();
			System.out.println(info);
		}
		
		System.out.println("Espacio libre = " + dirEspacioLibreBytes + "Bytes" );
		System.out.println("			  = " + dirEspacioLibreMB );
		
	}
		private static void verSubCarpetas(File fch) {
			File[] dirContenido = fch.listFiles();
			for (File f : dirContenido) {
				if(f.isDirectory());
					System.out.println(f.getName());
			}
		}
		private static String SiNo(boolean exp) {
			return exp ? "SI" : "NO";
		
		
		
	}
		
		
		

}
