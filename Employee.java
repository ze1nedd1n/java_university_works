package lab4;
import java.util.ArrayList;

public class Employee  {
    private String fullName = "first_name last_name";
    private String level = "level";
    private int employeeSum=0;
    private Departament departament;

    public Employee(final String full_name, final String level, final int employee_sum){
        this.fullName = full_name;
        this.employeeSum = employee_sum;
        this.level = level;
    }

    public String getLevel(){
        return level;
    }

    public String getDepartamentName(){
        return departament.getDepartamentName();
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(final String fullName){
        this.fullName = fullName;
    }

    public int getEmployeeSum(){return employeeSum;}


    public void setDepartament(final Departament departament){
        this.departament = departament;
    }

    @Override
    public String toString(){
        return "Employee {"+"fullName="+ fullName + '\'' + "employeeSum="
                + employeeSum+"}";
    }


}






