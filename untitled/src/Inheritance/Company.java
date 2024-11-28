package Inheritance;

public class Company {
    private String name;
    private String adress;

    public Company(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }
}
