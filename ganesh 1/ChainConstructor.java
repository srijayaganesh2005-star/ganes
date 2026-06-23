public class ChainConstructor {
    ChainConstructor () {
        this(100);
        System.out.println("Default Constructor");
    }

   ChainConstructor (int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        ChainConstructor  obj = new ChainConstructor();
    }
}