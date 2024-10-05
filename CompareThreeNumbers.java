public class CompareThreeNumbers {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 5;
        if (a == b && b == c) {
            System.out.println("All numbers are equal.");
        } else if (a == b) {
            System.out.println(a + " and " + b + " are equal.");
        } else if (a == c) {
            System.out.println(a + " and " + c + " are equal.");
        } else if (b == c) {
            System.out.println(b + " and " + c + " are equal.");
        } else {
            System.out.println("All numbers are different.");
        }
    }
}
