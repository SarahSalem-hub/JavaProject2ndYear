import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ghamdan on 11/26/2019.
 */
public class Task {

   // Employee emp= new Employee();
    String note;
    String place ;
    LocalDate date ;
    LocalTime time;
    String description;

    Reminder re =new Reminder();


    public Task() {
    }

    public Task(LocalDate date, LocalTime time) {
        this.date = date;
        this.time = time;
    }

    public Task(String note, String place, LocalDate date, LocalTime time, String description
            , Reminder re) {
        this.note = note;
        this.place = place;
        this.date = date;
        this.time = time;
        this.description = description;
        this.re=re;
    }

    public void setDate(LocalDate date) {
        date= re.getDate() ;
    }

    public void setTime(LocalTime time) {
        this.time = re.getTime();
    }

    public String getNote() {
        return note;
    }

    public String getPlace() {
        return place;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return

                "\nnote: " + note +
                "\nplace:" + place +
                "\ndate: " + date +
                "\ntime: " + time +
                "\ndescription: " + description +
                "\n "+ re.ReminderDetaills()+
                "\n ----------------------" ;
    }

    public Reminder getReminder() {
        return re;
    }

    public void setReminder(Reminder re) {
        this.re = re;
    }
}
