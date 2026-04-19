package com.manas.core.TareekPeTareek;

import java.time.*; //LocalDate, LocalTime, LocalDateTime
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
// dd-mm-yyyy
public class Tareekh {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        Date futureDate = calendar.getTime();
        System.out.println(futureDate);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(LocalDate.now().format(formatter));

        LocalDate parsedDate = LocalDate.parse("21-12-2025", formatter);
        System.out.println(parsedDate);
    }
}
