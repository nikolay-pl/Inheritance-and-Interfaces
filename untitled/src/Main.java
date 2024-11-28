import Inheritance.Company;
import Inheritance.Employee;
import Inheritance.Person;
import Inheritance.Student;
import Interface.Printable;
import Interface.Printer;
import Interface.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Employee employee = new Employee("Peter", new Company("Sirma Co","Sofia blvd Bulgaria 125"), 3000);
        //employee.setName("George");
        /*Employee employee = new Employee("John", new Company("Sirma", "Sofia 125"), 3000.00);

        Student student = new Student("Marry", "91 Vasil Levski Sou");
        Person person = new Person("Michael");
        //student.setName("Nikola");
        //employee.setCompany("Sirma Company");
        //student.addGrade(6);
        //employee.setSalary(1500);
        //student.sayHi();
        //employee.sayHi();

        List<Person> people = new ArrayList<>();
        people.add(person);
        people.add(student);
        people.add(employee);

        for ( Person p : people){
            p.sayHi();
            System.out.println(people.getClass());
        }
        */

        List<Printable> list = new ArrayList<>();
        list.add(new Printer());
        list.add(new Scanner());

        for(Printable p: list){
            p.print();
            p.draw();
        }
    }
}