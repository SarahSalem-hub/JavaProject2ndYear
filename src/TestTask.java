import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ghamdan on 11/27/2019.
 */
public class TestTask {

    ArrayList<Task> tsk = new ArrayList<>();
    Reminder remi = new Reminder();


    public boolean AddTask(Task note) {
        tsk.add(note);
        return true;
    }

    public ArrayList<Task> SearchforRemi(LocalDate date  , String name) {
        ArrayList<Task> foundTasks = new ArrayList<>();
        for (Task t : tsk) {
            if ((t.getDate().equals(date)) && (t.getNote().equals(name))) {
               // System.out.println("Found a date " + t.getDate());
                foundTasks.add(t);
            }

        }
        return foundTasks;
    }

    public String displayALl() {
        String s = "";
        for (Task i : tsk) {
            s += i.toString();
        }
        return s;
    }

    public String printRest(LocalDate da) {
        String s = "";
        for (Task i : tsk) {
            if ((i.getDate().equals(da))){
            s += i.toString();}
        }
        return s;
    }
    public void  RemoveTask (LocalDate Date , String note){
       boolean s=false;
        for (Task i:tsk)
        {
            if ((i.getDate().equals(Date)) && (i.getNote().equals(note)))
            {
                //System.out.println(i.getDate());
                //System.out.println(i.getNote());
                tsk.remove(i);
                System.out.println("\nremoved !!"+"\n----------------");
                System.out.println(printRest(Date));
                s=true;
                break;

            }

        }
        if(s==false)
         System.out.println( "task not found!"+"\n----------------");

    }
    public String printDate ( LocalDate date)
    {
        String s="";

        for (Task i:tsk){

        if (i.getDate().equals(date)){

              s+="Note Name: "+i.getNote() +"\nAt time: "+i.getTime()+"\n---------------\n";
            }
          }
          return s;
    }

}
