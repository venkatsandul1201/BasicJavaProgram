public class ConstructorCallingMethod {
    public ConstructorCallingMethod() {
        display();
    }

    public void display() {
        System.out.println("Display method called from constructor");
    }

    public static void main(String[] args) {
        ConstructorCallingMethod obj = new ConstructorCallingMethod();
    }
}
