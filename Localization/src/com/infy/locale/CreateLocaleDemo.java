package com.infy.locale;

import java.util.Locale;

// Demonstrates different ways to create a Locale object 
public class CreateLocaleDemo {
	
	private static final String LOCALE_DETAILS = "Locale details: \nLanguage: "; 
	private static final String COUNTRY = "Country: "; 
	
	public static void main(String[] args) {

//		createLocaleUsingBuilder();
		
//		createLocaleUsingConstructor();
		
		createLocaleUsingFactoryMethod();
		
//		createLocaleUsingConstants();
	}

	public static void createLocaleUsingBuilder() {
		
		var locale = new Locale.Builder()
							   .setLanguage("fr")	// 2 letter language code in lower case
							   .setRegion("FR")	    // 2 letter country code in upper case
							   .setScript("Latn")	// 4 letter language script code in title case
							   .build();
		
		
		System.out.println(LOCALE_DETAILS +locale.getDisplayLanguage());
		System.out.println(COUNTRY +locale.getDisplayCountry());
		System.out.println("Language script: "+locale.getDisplayScript());
	}
	
	public static void createLocaleUsingConstructor() {
		
		var locale =  new Locale("th", "TH", "TH");	
		
		System.out.println(LOCALE_DETAILS +locale.getDisplayLanguage());
		System.out.println(COUNTRY +locale.getDisplayCountry());
		
		// Variant is the third argument "TH" passed in the Locale constructor above
		// Variant is used to further distinguish locale for example, from language variations
		System.out.println("Variant: "+locale.getDisplayVariant());	
	}

	public static void createLocaleUsingFactoryMethod() {
		
		var locale = Locale.forLanguageTag("ja-JP-u-ca-japanese");
		
		System.out.println(LOCALE_DETAILS +locale.getDisplayLanguage());
		System.out.println(COUNTRY +locale.getDisplayName());
		
		// Extension is a single character key "u" and a string value "ca-japanese" which indicates Japanese calendar   
		// Extension indicates extensions apart from language identification
		System.out.println("Extension: "+locale.getExtension('u'));	
	}

	public static void createLocaleUsingConstants() {
		
		var locale = Locale.CHINESE;
		
		System.out.println("Locale details: "+locale.getDisplayName());
		
		locale = Locale.CHINA;
		
		System.out.println("Locale details: "+locale.getDisplayName());
	}
}
