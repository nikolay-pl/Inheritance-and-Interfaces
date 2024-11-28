package Inheritance;

public class Person {
    public String name;
    private Double salary;

    public Person(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Person(String name){
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHi(){
        System.out.println("Hello " + this.name);
    }
}
