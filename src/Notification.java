//import sun.util.calendar.CalendarDate;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.spi.CalendarDataProvider;

/**
 * Created by ghamdan on 11/26/2019.
 */
public class Notification {

    private LocalDate Date;
    private LocalTime Time;


    //Task tk =new Task();


    public Notification() {
    }

    public Notification(LocalDate date, LocalTime time) {
        Date = date;
        Time = time;
    }

    public LocalDate getDate() {
        return Date;
    }

    public LocalTime getTime() {
        return Time;
    }


//    Calendar cal =Calendar.getInstance();
//    {cal.add(cal.DATE,0);}
//    { System.out.println("created calendar" + cal.getTime());}





}
