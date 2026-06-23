public class Polymorphism {
    void display() {
        System.out.println("Parent Class");
    }

    public static void main(String[] args) {
        Polymorphism obj = new Child();
        obj.display();
    }
}

class Child extends Polymorphism {
    void display() {
        System.out.println("Child Class");
    }
}