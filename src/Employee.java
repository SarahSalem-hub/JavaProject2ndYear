import java.time.LocalDate;

/**
 * Created by asmaa on 11/11/2019.
 */
public class Employee extends Person {
    private int employeeNum;
    private Person pDetails;
    //private JopDisc jDetails;

    public Employee() {
    }

    public Employee(String fristName, String surName, String telephoneNum, LocalDate birth,
                    char sex,int employeeNum, Person pDetails){
        super(fristName, surName, telephoneNum,birth,sex);
        this.employeeNum=employeeNum;

        this.pDetails = pDetails;

    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public Person getpDetails() {
        return pDetails;
    }

    public void setpDetails(Person pDetails) {
        this.pDetails = pDetails;
    }




    @Override
    public String toString() {
        return "Employee{" +
                "employeeNum=" + employeeNum +
                "\npDetails=" + pDetails + "}\n";
    }
}
