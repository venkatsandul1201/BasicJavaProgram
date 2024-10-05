import java.util.Scanner;

public class ConstructorWithInput {
    public class ConstructorWithInput {
    String name;

    public ConstructorWithInput(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        ConstructorWithInput obj = new ConstructorWithInput(name);
        obj.display();
    }
}
