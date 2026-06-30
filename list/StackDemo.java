import java.util.Scanner;

class StackDemo {
    int max = 5;
    int stack[] = new int[max];
    int top = -1;

    void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped");
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackDemo s = new StackDemo();
        int choice, value;

        do {
            System.out.println("1.Push 2.Pop 3.Peek 4.Display 5.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    s.push(value);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}