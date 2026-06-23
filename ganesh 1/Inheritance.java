class Person {
    void show() {
        System.out.println("Person Class");
    }
}

public class Inheritance extends Person {
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.show();
    }
}