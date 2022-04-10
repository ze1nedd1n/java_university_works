package lab4;

import java.util.ArrayList;

public class Firm {
    private String firmName = "Firm name";
    static private ArrayList<Departament> departament_name = new ArrayList<>();

    public Firm(String firm_name) {this.firmName = firm_name;}

    public String getFirmName() {return firmName; }

    public ArrayList<Departament> getDepartament_name(){return departament_name;}

    public void setFirmName(final String firmName){this.firmName = firmName;}

    public void addDepartament(Departament departament) {departament_name.add(departament);}
    static public Employee searchByFullName(String fullName){
        Employee res = null;
        for (int i = 0; i < departament_name.size(); i++) {
            ArrayList<Employee> employersList = departament_name.get(i).getEmployers();
            for (int j = 0; j < employersList.size(); j++) {
                if (employersList.get(j).getFullName().equals(fullName)) {
                    res = employersList.get(j);
                }
            }
        }
        return res;

    }

    @Override
    public String toString() {
        return "Firm{" +
                "firmName='" + firmName + '\'' +
                '}';
    }

    public void print() {

    }


}





//    private String name;
//
//    Firm(){}
//    Firm(String name){
//        this.name = name;
//    }
//
//    private ArrayList<Departament> departament_name = new ArrayList<>();
//
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public ArrayList<Departament> getDepartament_name() {
//        return departament_name;
//    }
//
//    public void addDepartament(Departament departament){
//        departament_name.add(departament);
//    }
//
//    public employee searchByFullName(String fullName) {
//        employee res = null;
//        for (int i = 0; i < departament_name.size(); i++) {
//            ArrayList<employee> employeeList = departament_name.get(i).getemployee();
//            for (int j = 0; j < employeeList.size(); j++) {
//                if (employeeList.get(j).getFullName().equals(fullName)) {
//                    res = employeeList.get(j);
//                }
//            }
//        }
//        return res;
//    }
//
//    @Override
//    public String toString() {
//        return "Firm{" +
//                "firmName='" + name + '\'' +
//                '}';
//    }
//
//
//
