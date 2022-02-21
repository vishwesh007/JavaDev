package com.infy.datetimeformatting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// Demonstrates LocalDateTime localized to different languages 
public class DateTimeFomatDemo1 {

	public static void main(String[] args) {
		
		var localDateTime = LocalDateTime.now();

		System.out.println("Current date time in default format: " + localDateTime);

		var pattern = "dd-MMMM-yyyy HH:mm:ss EEEE";

		// Creating DateTimeFormatter with default locale
		var dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);

		System.out.println("\nCurrent date time in the format dd-MMMM-yyyy HH:mm:ss EEEE with default locale "
				+ Locale.getDefault().getDisplayName() + ": \n" + localDateTime.format(dateTimeFormatter));

		// Creating DateTimeFormatter with given locale
		dateTimeFormatter = DateTimeFormatter.ofPattern(pattern, Locale.FRANCE);

		System.out.println("\nCurrent date time in the format dd-MMMM-yyyy HH:mm:ss EEEE with locale "
				+ Locale.FRANCE.getDisplayName() + ": \n" + localDateTime.format(dateTimeFormatter));

		// Creating DateTimeFormatter with given locale
		dateTimeFormatter = DateTimeFormatter.ofPattern(pattern, new Locale("hi"));

		System.out.println("\nCurrent date time in the format dd-MMMM-yyyy HH:mm:ss EEEE with locale "
				+ new Locale("hi", "IN").getDisplayName() + ": \n" + localDateTime.format(dateTimeFormatter));
	}
}
