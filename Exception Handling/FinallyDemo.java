public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception.");
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}