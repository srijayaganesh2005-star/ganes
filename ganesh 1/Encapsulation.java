public class Encapsulation {
    private int rollNo;
    private String name;

    public void setData(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Encapsulation s = new Encapsulation();
        s.setData(101, "ganesh");
        s.display();
    }
}