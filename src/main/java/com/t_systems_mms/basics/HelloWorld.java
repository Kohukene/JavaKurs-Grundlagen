/**
*erweitertes HelloWorld-Programm
*@author Verena Schiffler
*@version 1.0
*/ 

package com.t_systems_mms.basics;

import org.apache.log4j.*;

//neuer Test-Kommentar f�r GIT
public class HelloWorld {

	static Logger log =LogManager.getLogger(HelloWorld.class.getName());

	/**
	*Diese Methode holt sich eine Nachricht von Echo und gibt diese in der Konsole aus, abh�ngig von der Tageszeit und der gew�hlten Sprache
	*	
	*Zus�tzlich wird ErrorWriter verwendet, welcher eine Datei l�scht oder erstellt, so dass die Methode bei jedem 2. Versuch fehlschl�gt
	*/
	//Methode, in der von Echo eine Nachricht kommt
	private static void printMessage(String language, String country) {
		log.debug("Test: printMessage-Methode wird ausgef�hrt");	
       		//Echo echo = new Echo();
		//EchoErbe echo=new EchoErbe();
		//EchoTimer echo=new EchoTimer();
		EchoInternational echo=new EchoInternational(language, country);
		log.info(echo.getMessage());
		ErrorWriter writer = new ErrorWriter();
		writer.readFromFile(echo.getMessage());
    	}

	//Methode, die bei jedem zweiten Aufruf fehlschl�gt
	//public static void secondFail(ErrorWriter writer, String text) {
		
		//writer.writeToFile(text);
	//}
	
/**
*Hauptprogramm
*
*@param args Kommandozeilenparameter
*Es muss zuerst ein Sprachcode und dann ein L�ndercode eingegeben werden
*
*wenn keine Parameter �bergeben werden, dann ist standardm��ig englisch eingestellt
*
*m�gliche Eingaben:
*de DE -
*et EE - 
*en US - 
*/
    	public static void main(String[] args){
		log.debug("start main-Methode");
		
		String language;
		String country;
		
		if(args.length!=2) {
			language="en";
			country="US";
		}
		else{
			language=new String(args[0]);
			country=new String(args[1]);
		}
		
		
		printMessage(language, country);
		
    	}

   
    }
