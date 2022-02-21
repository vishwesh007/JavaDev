package com.infy.datetimeformatting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

// Demonstrates LocalDateTime format localized to different regions and languages
public class DateTimeFomatDemo2 {

	public static void main(String[] args) {

		var localDateTime = LocalDateTime.of(2021, 3, 8, 15, 36, 56);

		// Creating DateTimeFormatter with format style and default locale
		var dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

		System.out.println("Current date time format localized to default locale "+Locale.getDefault().getDisplayName()+": \n"
				+ localDateTime.format(dateTimeFormatter));

		// Creating DateTimeFormatter with format style and given locale
		dateTimeFormatter =dateTimeFormatter.withLocale(Locale.FRANCE);

		System.out.println("\nCurrent date time format localized to locale "+Locale.FRANCE.getDisplayName()+": \n"
				+ localDateTime.format(dateTimeFormatter));

		// Creating DateTimeFormatter with format style and given locale
		dateTimeFormatter =dateTimeFormatter.withLocale(new Locale("hi"));

		System.out.println("\nCurrent date time format localized to locale "+new Locale("hi", "IN").getDisplayName()+": \n"
				+ localDateTime.format(dateTimeFormatter));
	}
}
