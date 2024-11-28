package Inheritance;

public class Employee extends Person{
    //public String company;
    private double salary;
    public static final  double minSalary = 790;
    private final Company company;
    private String position;

    public Employee(String name, Company company, double salary){
        super(name);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company.getName();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < minSalary){
            throw new IllegalArgumentException("Salary cannot be less than " + minSalary);
        }
        this.salary = salary;
    }

    @Override
    public void sayHi(){
        System.out.println("Hello I am " + super.name + " and I work at " + this.company.getName() + ".");
    }
}

