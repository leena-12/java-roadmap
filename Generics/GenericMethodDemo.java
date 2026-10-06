public class GenericMethodDemo {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30};
        String[] names = {"Aman", "Priya", "Ravi"};

        printArray(numbers);
        printArray(names);

        System.out.println("First number: " + getFirst(numbers));
        System.out.println("First name: " + getFirst(names));
    }
}