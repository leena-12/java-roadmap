// Program to find largest element in an array
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {11, 22, 3, 45, 18};

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
    }
}