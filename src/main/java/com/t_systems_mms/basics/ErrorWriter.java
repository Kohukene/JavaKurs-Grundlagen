/**
*ErrorWriter, dient zum Auslesen, Erstellen und L�schen einer .txt-Datei
*/
package com.t_systems_mms.basics;

import java.io.*;
import org.apache.log4j.*;

public class ErrorWriter{

	static Logger log = LogManager.getLogger(ErrorWriter.class.getName());

//Text in eine .txt-Datei schreiben
	/**
	*Liest Datei "test.txt"
	*
	*Wenn Datei gefunden und ausgelesen, wird sie wieder gel�scht (um beim n�chsten Aufruf einen Fehler zu erzeugen)
	*Wenn Datei nicht gefunden, wird die Methode writeToFile ausgel�st
	*@param text
	*/
	public void readFromFile(String text){
		File file = new File("test.txt");
		//Versuchen, einen FileInputStream zu erstellen
		try{
			FileInputStream fis = new FileInputStream(file);
			int byteData=0;
			log.info("Inhalt der .txt-Datei wird ausgelesen");
				while(byteData != -1) {
  					byteData = fis.read();
					log.info((char) byteData);
				}
			
			fis.close();
			//Wenn Datei ausgelesen ist, diese wieder l�schen
			//damit erscheint beim n�chsten Aufruf die Meldung aus dem catch-Block
			file.delete();
			
		}
		catch(FileNotFoundException e){
		//Fehlerbehandlung
			//Wenn Datei nicht vorhanden, Datei erstellen und Fehlermeldung ausgeben
			//damit klappt der Versuch beim n�chsten Aufruf der Methode
			writeToFile(text);
			log.error("Datei wurde nicht gefunden:" + e.getMessage());
		}

		catch(IOException ioe){
			log.error("Datei kann nicht gelesen werden:" + ioe.getMessage());
		}
	}
	/**
	*writeToFile erstellt eine Datei "test.txt" und schreibt einen �bergebenen String hinein
	*@param text
	*/
	public void writeToFile(String text){

		try{
		FileWriter fw = new FileWriter("test.txt");
		
		BufferedWriter writer=new BufferedWriter(fw);
			writer.write(text);
			writer.close();
		}
		catch(IOException e){
		e.printStackTrace();
		}
	}


}