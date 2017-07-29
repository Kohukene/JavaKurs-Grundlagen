/**
EchoInternational dient dazu, eine Nachricht auszugeben
*abhängig von der Tageszeit (Morgen, Mittag, Abend, Nacht) und der Sprache (de, en, et) 
*/
package com.t_systems_mms.basics;


//Locale und ResourceBundle importieren:
import java.util.*;

//Import von Bibliothek zum Auslesen der Zeit
import java.util.Calendar;


public class EchoInternational implements Greeting{
	String language;
	String country;
	//Locale Objekt
	Locale currentLocale;
	//ResourceBundle Objekt
	ResourceBundle messages;

	/**
	*Konstruktor, wählt ein Propertie-File aus
	*/
	public EchoInternational(String language, String country){
		this.language=language;
		this.country=country;

		
		//Locale mit Sprache und Land erzeugen
		currentLocale=new Locale(language, country);
		//Die String aus Propertie-Files nehmen
		messages=ResourceBundle.getBundle("com.t_systems_mms.basics.MessagesBundle", currentLocale);
	}
	
	/**
	*Methode greeting, liest abhängig von der Tageszeit eine Nachricht (deutsch: Hallo, Guten Morgen, Guten Abend, Gute Nacht) aus 
	*
	*@return String
	*/
	//String-Methode für Gruß
	public String greeting(){
		

		//Die "messages" verwenden:


		//int für Uhrzeit (in Stunden)
		int currentHour=Calendar.HOUR_OF_DAY;

		//If-Verzweigung für Morgen, Mittag, Abend, Nacht
		if (currentHour > 5 && currentHour<11) {
			return messages.getString("messageMorning");
		}

		if (currentHour >= 18 && currentHour<23) {
			return messages.getString("messageEvening");
		}

		if (currentHour >= 23 && currentHour<=5) {
			return messages.getString("messageNight");
		}
			return messages.getString("message"); 

		}
	
	/**
	*getMessage(), muss aufgrund der Schnittstelle Greeting implementiert werden
	*@return String
	*/
	@Override
	public String getMessage(){
		return greeting() + " " + messages.getString("recipient");
	}


		
		
	
}