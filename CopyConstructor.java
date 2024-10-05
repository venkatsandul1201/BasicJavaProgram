public class CopyConstructor {
    int a;

    public CopyConstructor(int a) {
        this.a = a;
    }

    public CopyConstructor(CopyConstructor obj) {
        this.a = obj.a;
    }

    public void display() {
        System.out.println("a: " + a);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(20);
        CopyConstructor obj2 = new CopyConstructor(obj1);
        obj2.display();
    }
}
