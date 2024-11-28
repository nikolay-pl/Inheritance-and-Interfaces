package Interface;

public class Scanner implements Printable, Scannable{

    @Override
    public void print() {
        System.out.println("Scanner printing");
    }

    @Override
    public void scan() {
        System.out.println("Scanner scan");
    }
}
