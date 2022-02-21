package com.infy.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

//Demonstrates ResourceBundle that uses properties files, PropertyResourceBundle
public class ResourceBundleDemo {

	public static void main(String[] args) {

		var baseName = "locale";
		var key = "welcome";

		//Getting resource bundle with default locale 
		var resourceBundle = ResourceBundle.getBundle(baseName);
		System.out.println("Welcome in English(Default): " + resourceBundle.getString(key));

		resourceBundle = ResourceBundle.getBundle(baseName, Locale.FRENCH);
		System.out.println("Welcome in French: " + resourceBundle.getString(key));

		resourceBundle = ResourceBundle.getBundle(baseName, new Locale("hi", "IN"));
		System.out.println("Welcome in Hindi: " + resourceBundle.getString(key));
	}
}
