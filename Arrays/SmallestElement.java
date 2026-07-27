// Program to find smallest element in an array
public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {11, 22, 3, 45, 18};

        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element = " + smallest);
    }
}