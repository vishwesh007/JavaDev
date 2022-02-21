package com.infy.datetimeformatting;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

// Demonstrates ZonedDateTime format localized to different regions and languages
public class DateTimeFomatDemo3 {

	public static void main(String[] args) {

		// Getting the current time in the given time zone 
		var zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zonedDateTime);
		// Getting the time zone of ZonedDateTime object
		ZoneId zone = zonedDateTime.getZone();

		// Creating DateTimeFormatter with format style and default locale
		var dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

		System.out.println("Current date time in " + zone + " zone with default locale "
				+ Locale.getDefault().getDisplayName() + ": \n" + zonedDateTime.format(dateTimeFormatter));

		// Creating DateTimeFormatter with format style and given locale
		dateTimeFormatter = dateTimeFormatter.withLocale(Locale.FRANCE);

		System.out.println("\nCurrent date time in " + zone + " zone with locale "
				+ Locale.FRANCE.getDisplayName() + ": \n" + zonedDateTime.format(dateTimeFormatter));

		// Creating DateTimeFormatter with format style and given locale
		dateTimeFormatter = dateTimeFormatter.withLocale(new Locale("hi"));

		System.out.println("\nCurrent date time in " + zone + " zone with locale "
				+ new Locale("hi", "IN").getDisplayName() + ": \n" + zonedDateTime.format(dateTimeFormatter));
	}
}
