import java.util.Scanner;

public class VowelCounter {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();

        str = str.toLowerCase();

        int vowelCount= 0 ;

        for (int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if ( ch == 'a' || ch == 'e' || ch == 'i' ||
                 ch == 'o' || ch == 'u') {

                    vowelCount++;
                 }
  
  
                }

                System.out.println("The number of vowels is:" + vowelCount);
        sc.close();
    }
    
}
