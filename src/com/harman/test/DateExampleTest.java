package com.harman.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:SSS");
		String strDate = format.format(date); // convert date into string
		
		System.out.println("strDate is in dd/MM/yyyy:" + strDate);
		
		
		String str = new String ("04-12-2020 13:12:50:556");
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss:SSS");
		Date date1 =null;
		try {
			date1 = format1.parse(str); // convert string into data
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("converted from str to date:" + date1);
		
		Calendar calendar = new GregorianCalendar(2020, 11,04, 14,20,50);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int hour = calendar.get(Calendar.HOUR);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(dayOfMonth);
		System.out.println(dayOfWeek);
		System.out.println(hour);
		
		//HH -> 24 hour format
		
		SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss:SSS");
		System.out.println(format2.format(calendar.getTime()));
		
		//Reflection
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(new Date());
		
		System.out.println(calendar1.get(Calendar.YEAR));
		
		calendar1.set(Calendar.MONTH, 11);
		System.out.println(format2.format(calendar1.getTime()));
		
		//Date and calendar are not thread safe 
		//Date 
		
		// Local date is Thread safe
		//Example of Local Date
		System.out.println("Examples of Local Dates:");
		LocalDate todayDate = LocalDate.now(); // default format yyyy-MM-dd
		System.out.println("Today Date using Local Date:" + todayDate);
		
		
		//Using input argumenets
		LocalDate dateWithValues = LocalDate.of(2020, Month.NOVEMBER, 04);
		System.out.println("using manual values:" + todayDate);
		
		//Region Based Date
		LocalDate regionBasedDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("regionBasedDate:" + regionBasedDate);
		
		//LocalTIme
		LocalTime regionBasedTime = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("regionBasedTime:" + regionBasedTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime:" + localDateTime);
		
		LocalDateTime localRegionDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("localRegionDateTime:" + localRegionDateTime);
		
	}

}
