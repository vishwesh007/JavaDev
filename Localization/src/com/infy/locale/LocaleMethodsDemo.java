package com.infy.locale;

import java.util.Locale;

//Demonstrates working with different other methods of Locale class
public class LocaleMethodsDemo {

	public static void main(String[] args) {
		
		displayLocale();
		
		changeDefaultLocale();
	} 
	
	// Code to display one locale details in another locale language 
	public static void displayLocale()
	{
		var locale=Locale.UK;
		
		System.out.println("Locale details: "+ locale.getDisplayName());
		System.out.println("Locale details in Hindi locale: "
							+ locale.getDisplayName(new Locale("hi", "IN")));
	}
	
	// Code to change the default locale 
	public static void changeDefaultLocale()
	{
		var defaultLocale = Locale.getDefault();
		
		System.out.println("\nDefault locale: "+defaultLocale.getDisplayName());
		
		// Setting a different locale as default locale
		Locale.setDefault(Locale.FRANCE);
		
		defaultLocale = Locale.getDefault();
		
		System.out.println("Default locale: "+defaultLocale.getDisplayName());
	}
}
