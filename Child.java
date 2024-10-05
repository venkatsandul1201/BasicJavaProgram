public class Parent {
    public Parent() {
        System.out.println("Parent constructor called");
    }
}

public class Child extends Parent {
    public Child() {
        System.out.println("Child constructor called");
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}
