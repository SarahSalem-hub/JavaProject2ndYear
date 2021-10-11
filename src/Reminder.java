import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Created by ghamdan on 11/29/2019.
 */
public class Reminder {

    private  int reminder;
    private LocalDate date;
    private  LocalTime time;
    private  int ReTimes;

   ArrayList <LocalDate> d=new ArrayList<>();
    ArrayList <LocalTime> t=new ArrayList<>();


    public int getreminder() {
        return ReTimes;
    }

    public void setReminder(int ReTimes ,LocalDate l ,LocalTime T) {
       this.ReTimes=ReTimes;
        date=l;
        time=T;

        d.add(l);
        t.add(T);
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }


    public String  ReminderDetaills(){


        String s1="";
       for(int i=0;i<getreminder();i++)
        {


         s1+= "\nyour Reminder in:  " + "("+(i+1)+" ):at Date: " +d.get(i) + " in Time:" +t.get(i);

        }

         return s1;
    }


}
