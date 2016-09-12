package com.hp.exstream.qa.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtility {

	public class Format{
		public static final String FORMAT1 = "MMM dd, yyyy hh:mm:ss a";
		
	}
	
	public static String addTime(int Type,int minutes, String dtFormat){

		String date = "";
		Calendar cal = Calendar.getInstance();
		cal.add(Type, minutes);
		SimpleDateFormat format = new SimpleDateFormat(dtFormat);
		date =  format.format(cal.getTime());
		return date;
		
	}
	public static void main(String[] args) {
		System.out.println(DateUtility.addTime(Calendar.HOUR, 1, Format.FORMAT1));
	}
}
