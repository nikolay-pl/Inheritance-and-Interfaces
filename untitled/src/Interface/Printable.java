package Interface;

public interface Printable {
    int Max = 5;
    void print();

    default void draw(){
        System.out.println("Drawing");
    }
}
