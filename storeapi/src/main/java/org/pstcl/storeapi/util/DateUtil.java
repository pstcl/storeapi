package org.pstcl.storeapi.util;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static LocalDate startDateForMonth(Integer month,Integer year)
	{
		LocalDate localDate=LocalDate.of(month,year,1);
		return localDate;
	}
	
	public static LocalDate endDateForMonth(Integer month,Integer year)
	{
		LocalDate localDate=LocalDate.of(month,year,1);
		return localDate.with(TemporalAdjusters.lastDayOfMonth());
	}

}
