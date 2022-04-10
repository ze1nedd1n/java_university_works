package lab4;

import java.util.ArrayList;

public class Departament  {
    private String DName = "Departament_name";
    private int departamentEmployeeSum=0;
    private Firm firmOfDepartament;
    private final ArrayList<Employee> employers = new ArrayList<>();

    public Departament(final String departament_name, int departamentEmployeeSum) {
        this.DName = departament_name;
        this.departamentEmployeeSum = departamentEmployeeSum;
    }

    public Firm getFirmOfDepartament() {
        return firmOfDepartament;
    }

    public int getSumOfEmployers() {
        int sum = 0;
        for (int i = 0; i < employers.size(); i++) {
            sum += employers.get(i).getEmployeeSum();
        }
        return sum;
    }

    public ArrayList<Employee> getEmployers() {
        return employers;
    }

    public void addEmployee(Employee employee){
        employers.add(employee);
        employee.setDepartament(this);
    }

    public void removeEmployee(Employee employee){
        employers.add(employee);
    }

    public String getDepartamentName() {
        return DName;
    }

    public void setDepartamentName(final String departamentName) {
        this.DName = departamentName;
    }

    public int getdepartamentEmpolyeeSum() {
        return departamentEmployeeSum;
    }


    @Override
    public String toString() {
        return "Departament{" +
                "departamentName='" + DName + '\'' +
                ", departamentEmpolyeeSum=" + departamentEmployeeSum +
                '}';
    }
}



