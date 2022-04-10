package lab4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class lab4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Firm f1 = new Firm("FDA Group");
        Departament d1 = new Departament("Marketting", 4);
        Departament d2 = new Departament("IT", 4);
        Employee e1 = new Employee("Janybek", "Начальник отдела", 300000);
        Employee e2 = new Employee("Ekaterina","Зам. Начальника", 200000);
        Employee e3 = new Employee("Berdibek","Офисный работник", 150000);
        Employee e4 = new Employee("Algabas", "Стажер", 80000);


        f1.addDepartament(d1);
        f1.addDepartament(d2);

        d1.addEmployee(e1);
        d1.addEmployee(e2);

        d2.addEmployee(e3);
        d2.addEmployee(e4);

        System.out.println("----- After init -----\n");

        System.out.println(d1.getEmployers());
        System.out.println(d1.getSumOfEmployers());


        System.out.println(d2.getEmployers());
        System.out.println(d2.getSumOfEmployers());

        System.out.println("----- Search by full name and his/her money and Departament name -----\n");

        Employee search = Firm.searchByFullName("Janybek");
        System.out.println(search.getEmployeeSum());
        System.out.println(search.getDepartamentName());
        System.out.println(search.getLevel()+"\n");



        d1.removeEmployee(e1);
        d1.addEmployee(e1);

        System.out.println("nazvanie firm: "+f1.getFirmName());

        System.out.println("Otdely firm: "+ d1.getDepartamentName()+","+d2.getDepartamentName());

        System.out.println(e1.toString());

        System.out.println(f1.toString());
    }
}

//public class lab4{
//    public static void main(String[] args) {
//
//        ArrayList<String> s = new ArrayList<String>();
//
//        s.add("Aslan");
//        s.add("Aslan1");
//        s.add("Aslan2");
//        s.add("Aslan3");
//
//        System.out.println(s);
//
//
//    }
//}