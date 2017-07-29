package com.t_systems_mms.basics;

//Import von Bibliothek zum Auslesen der Zeit
import java.util.Calendar;

public class EchoTimer extends Echo{

	//String f�r Gru�
	private String greeting(){

	//int f�r Uhrzeit (in Stunden)
	int currentHour=Calendar.HOUR_OF_DAY;

	//If-Verzweigung f�r Morgen, Mittag, Abend, Nacht
	if (currentHour > 5 && currentHour<11) {
		return "Good Morning";
	}

	if (currentHour >= 18 && currentHour<23) {
		return "Good Evening";
	}

	if (currentHour >= 23 && currentHour<=5) {
		return "Good Night";
	}
	return "Hello"; 

	}
	
	@Override
	public String getMessage(){
		return greeting() + " " + getRecipient();
	}


} 