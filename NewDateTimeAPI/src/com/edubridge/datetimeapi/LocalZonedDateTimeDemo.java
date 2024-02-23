package com.edubridge.datetimeapi;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class LocalZonedDateTimeDemo {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		OffsetTime ost = OffsetTime.now();
		System.out.println(ost);
		
		OffsetDateTime osdt = OffsetDateTime.now();
		System.out.println(osdt);
		
		ZoneId zid = ZoneId.systemDefault();
		System.out.println(zid);
		
		Map<String, String> mzos = ZoneOffset.SHORT_IDS;
		System.out.println(mzos);
		
		ZoneOffset zos = ZoneOffset.ofHoursMinutes(12, 20);
		System.out.println(zos);
		
		String dt = "2020-12-04 12:30";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime parseDateTime = LocalDateTime.parse(dt, dtf);
		System.out.println(parseDateTime);
	}
}