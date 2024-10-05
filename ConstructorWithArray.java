public class ConstructorWithArray {
    int[] arr;

    public ConstructorWithArray(int size) {
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i * 2;
        }
    }

    public void display() {
        for (int value : arr) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        ConstructorWithArray obj = new ConstructorWithArray(5);
        obj.display();
    }
}
