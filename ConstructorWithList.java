import java.util.ArrayList;

public class ConstructorWithList {
      ArrayList<Integer> list;

    public ConstructorWithList() {
        list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i * 10);
        }
    }

    public void display() {
        System.out.println("List: " + list);
    }

    public static void main(String[] args) {
        ConstructorWithList obj = new ConstructorWithList();
        obj.display();
    }
}
