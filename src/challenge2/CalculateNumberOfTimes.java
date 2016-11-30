package challenge2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class CalculateNumberOfTimes {

	public static void main(String[] args) {

		//
		// try {
		// Reader reader = new FileReader("src\\challenge2\\corpus.txt");
		// System.out.println(reader.toString());
		// System.out.println("SAcabao");
		//
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		File file = new File("src\\challenge2\\resources\\corpus.txt");
		Stream<String> multilineas;
		try {
			multilineas = Files.lines(file.toPath());
			for (Iterator<String> iterator = multilineas.iterator(); iterator.hasNext();) {
				System.out.println(iterator.next());
			}

			multilineas.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Fichero del que queremos leer
		// String fileName =
		// CalculateNumberOfTimes.class.getClassLoader().getResource("/corpus.txt").toString();
		//
		// Scanner s = null;
		// System.out.println(filename);
		// try {
		// // Leemos el contenido del fichero
		// System.out.println("... Leemos el contenido del fichero ...");
		// s = new Scanner(fichero);
		// StringBuilder allLines = new StringBuilder();
		// // Leemos linea a linea el fichero
		// while (s.hasNextLine()) {
		// String linea = s.nextLine(); // Guardamos la linea en un String
		// allLines.append(linea);
		// System.out.println(linea); // Imprimimos la linea
		// }
		//
		// System.out.println("Lineas : " + allLines.toString());
		//
		// } catch (Exception ex) {
		// System.out.println("Mensaje: " + ex.getMessage());
		// } finally {
		// // Cerramos el fichero tanto si la lectura ha sido correcta o no
		// try {
		// if (s != null)
		// s.close();
		// } catch (Exception ex2) {
		// System.out.println("Mensaje 2: " + ex2.getMessage());
		// }
		// }
	}
}