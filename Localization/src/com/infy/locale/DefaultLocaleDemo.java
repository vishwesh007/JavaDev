package com.infy.locale;

import java.util.Locale;

//Demonstrates working with a default Locale object 
public class DefaultLocaleDemo {

	public static void main(String[] args) {
		
		// Getting the default locale
		var defaultLocale = Locale.getDefault();	
		
		//Displaying the locale details
		System.out.println("Default locale: "+defaultLocale);
		
		System.out.println("\nLanguage code:"+defaultLocale.getLanguage());
		System.out.println("Language name:"+defaultLocale.getDisplayLanguage());
		
		System.out.println("\nCountry code:"+defaultLocale.getCountry());
		System.out.println("Country name:"+defaultLocale.getDisplayCountry());
		
		// Getting locale details as a single value 
		System.out.println("\nLocale details: "+defaultLocale.getDisplayName());
	
		
	}
}
