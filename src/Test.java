import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import sun.util.calendar.CalendarDate;


/**
 * Created by ghamdan on 11/26/2019.
 */
public class Test{
    public static void main(String[] args) {

     TestTask tt = new TestTask();
     Scanner s = new Scanner(System.in);

        Reminder  b=new Reminder();
        b.setReminder(2, LocalDate.of(2019, 2, 1), LocalTime.of(2, 2, 2));

        b.setReminder(2, LocalDate.of(2019, 10, 3), LocalTime.of(3, 3, 3));


        Reminder b2=new Reminder();

        b2.setReminder(1,LocalDate.of(2019,3,1),LocalTime.of(2,6,2));

        Reminder b3=new Reminder();
        b3.setReminder(1,LocalDate.of(2019,4,1),LocalTime.of(2,2,2));

        Task l1 = new Task("note1", "sana", LocalDate.of(2019, 2, 1), LocalTime.of(2, 34, 55), "hello1",b);
        Task l2 = new Task("note2", "sana", LocalDate.of(2019, 2, 1), LocalTime.of(2, 34, 55), "hello2", b2);
        Task l3 = new Task("note3", "sana", LocalDate.of(2019, 2, 2), LocalTime.of(2, 34, 55), "hello3", b3);


        System.out.println("Enter name of the note:");
       String note =s.nextLine();
        System.out.println("Enter the place:");
        String place =s.nextLine();
        System.out.println("Enter The specific Date:");
        LocalDate date ;
        while(true) {
            try {
                date = LocalDate.of(s.nextInt(), s.nextInt(), s.nextInt());
               // System.out.println("here");
                break;

            } catch (InputMismatchException e) {
                if (true) {
                   // System.out.println("here1");
                    //System.out.println(e);
                    System.out.println("\t\t --please enter a certain Date--");
                    s.next();
                }
                else
                    break;
            }
        }

       // date = LocalDate.of(s.nextInt(), s.nextInt(), s.nextInt());
        System.out.println("Enter the time :hh mm ss :");

            LocalTime time=LocalTime.of(s.nextInt(),s.nextInt(),s.nextInt());

          s.nextLine();
        System.out.println("Enter note description:");
        String des =s.nextLine();


        System.out.println("---------------------------");

        Reminder rn = new Reminder();
        System.out.println("want a Reminder?  yes/no");
        String want=s.next();
        switch (want)
        {
            case "yes":
                System.out.println("How many times you want a reminder?");
                int size =s.nextInt();
                int []r =new int[size];

                for (int i=0; i<r.length ;i++){
                    System.out.println("What date you want in "+(i+1) +"   yyyy mm dd ?");
                    LocalDate l = LocalDate.of(s.nextInt(), s.nextInt(), s.nextInt());

                    System.out.println("What time you want in "+(i+1) +"   hh mm ss ns ?");
                        LocalTime T=LocalTime.of(s.nextInt(), s.nextInt(), s.nextInt());

                    System.out.println("-----------------------------");

                    rn.setReminder(size,l,T);
        }
        break;
            case "no"  :break;
        }


        Task t= new Task (note,place,date,time,des,rn);

        tt.AddTask(l1);
        tt.AddTask(l2);
        tt.AddTask(l3);
        tt.AddTask(t);




     System.out.println(tt.displayALl());

     //-----------------------
        System.out.println("search reminder in date and note name:");
        ArrayList<Task> foundTasks = tt.SearchforRemi(LocalDate.of(s.nextInt(),s.nextInt(),s.nextInt()), s.next());
        for (Task foundTask : foundTasks) {
            System.out.println(foundTask.getReminder().ReminderDetaills());
        }
//     ---------------
        System.out.println("date and name of note to remove:");
        tt.RemoveTask(LocalDate.of(s.nextInt(),s.nextInt(),s.nextInt()), s.next());


     //------------
     System.out.println("All Task in one date:");
     System.out.println(tt.printDate(LocalDate.of(s.nextInt(), s.nextInt(), s.nextInt())));
    }
}