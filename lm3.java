import java.util.*;

class Book {
    int id;
    String name;
    String author;
    int qty;
    Book(int id, String name, String author, int qty) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.qty = qty;
    }
}

public class lm3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {

            System.out.println(" LIBRARY MANAGEMENT SYSTEM");
            System.out.println("-------------------------------");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display Total Books");
            System.out.println("7. Exit");

            System.out.print("Enter Option: ");
            int option = sc.nextInt();

            switch (option) {

case 1:

    System.out.print("Enter Book ID: ");
    int id = sc.nextInt();

    boolean exists = false;

    for (Book b : books) {
        if (b.id == id) {
            exists = true;
            break;
        }
    }

    if (exists) {
        System.out.println("Already exists.");
        break;
    }

    sc.nextLine();

    System.out.print("Enter Book Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Author Name: ");
    String author = sc.nextLine();

    System.out.print("Enter Quantity: ");
    int qty = sc.nextInt();

    books.add(new Book(id, name, author, qty));

    System.out.println("Book Added ........");

    break;
                case 2:

                    if (books.size() == 0) {
                        System.out.println("Books illanga.");
                    } 
                    else {
                        System.out.println("\nBook ID\tBook Name\tAuthor\tQuantity");

                        for (Book b : books) {
                            System.out.println(b.id + "\t" + b.name + "\t\t" + b.author + "\t" + b.qty);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Book b : books) {
                        if (b.id == searchId) {
                            System.out.println("Book Found");
                            System.out.println("Book ID : " + b.id);
                            System.out.println("Book Name : " + b.name);
                            System.out.println("Author : " + b.author);
                            System.out.println("Quantity : " + b.qty);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book ah kanom.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID: ");
                    int borrowId = sc.nextInt();

                    found = false;

                    for (Book b : books) {

                        if (b.id == borrowId) {

                            found = true;

                            if (b.qty == 0) {
                                System.out.println("Book illa.");
                            } else {

                                System.out.println("Book Name : " + b.name);
                                System.out.print("Borrow this book? (Y/N): ");
                                char ch = sc.next().charAt(0);

                                if (ch == 'Y' || ch == 'y') {
                                    b.qty--;
                                    System.out.println("Book vangiyachu.");
                                    System.out.println("Remaining Quantity: " + b.qty);
                                } else {
                                    System.out.println("Borrow Cancelled.");
                                }
                            }

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Ah kanom.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Book ID: ");
                    int returnId = sc.nextInt();

                    found = false;

                    for (Book b : books) {

                        if (b.id == returnId) {

                            found = true;

                            System.out.println("Book Name : " + b.name);
                            System.out.print("Return this book? (Y/N): ");
                            char ch = sc.next().charAt(0);

                            if (ch == 'Y' || ch == 'y') {
                                b.qty++;
                                System.out.println("Book Returned Successfully.");
                                System.out.println("Updated Quantity: " + b.qty);
                            } else {
                                System.out.println("Return Cancelled.");
                            }

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found.");
                    }

                    break;

                case 6:

                    int totalQty = 0;

                    for (Book b : books) {
                        totalQty += b.qty;
                    }

                    System.out.println("Books : " + books.size());
                    System.out.println("Total Quantity : " + totalQty);

                    break;

                case 7:

                    System.out.println("Nandri...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid.");
            }
        }
    }
}