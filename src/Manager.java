import java.time.LocalDate;

/**
 * Created by ghamdan on 11/26/2019.
 */
public class Manager extends Employee {

    private String department ;



    public Manager() {
    }

    public Manager(String fristName, String surName, String telephoneNum, LocalDate birth,
                   char sex, int employeeNum, Person pDetails, String department)
    {
        super(fristName, surName, telephoneNum, birth, sex, employeeNum, pDetails);
        this.department = department;
    }


}
