package org.pstcl.storeapi.util;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static LocalDate startDateForMonth(Integer month,Integer year)
	{
		LocalDate localDate=((null!=month)&&(null!=year)&&(month>0&&month<13)&&(year>1990&&month<2100))?LocalDate.of(year,month,1):LocalDate.now();
		return localDate;
	}
	
	public static LocalDate endDateForMonth(Integer month,Integer year)
	{
		LocalDate localDate=((null!=month)&&(null!=year)&&(month>0&&month<13)&&(year>1990&&month<2100))?LocalDate.of(year,month,1):LocalDate.now();
		return localDate.with(TemporalAdjusters.lastDayOfMonth());
	}

}
