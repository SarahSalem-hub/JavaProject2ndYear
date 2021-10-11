import java.time.LocalDate;
import java.time.Period;

/**
 * Created by asmaa on 07/10/2019.
 */
public class Person {
   private String fristName,surName,telephoneNum;
    private LocalDate birth;
    private char sex;

    public Person() {
    }

    public Person(String fristName, String surName, String telephoneNum, LocalDate birth, char sex) {
        this.fristName = fristName;
        this.surName = surName;
        this.telephoneNum = telephoneNum;
        this.birth = birth;
        this.sex = sex;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void displayData(){
        System.out.println("Name is: "+fristName+" "+surName);
        System.out.println("Sex is: "+sex);
        System.out.println("birthDay is: "+birth);
        System.out.println(computeAge());
        System.out.println("Telephone number is: "+telephoneNum);
    }

    public String computeAge(){
        Period p=Period.between(birth,LocalDate.now());
        if (p.getDays()==0&&p.getMonths()==0)
            return "Happy birthday! Your age is "+p.getYears()+" years.";
        else

        return "Your age is "+p.getYears()+" years and "
                +p.getMonths()+" months and "+p.getDays()+" days.";

    }
}
