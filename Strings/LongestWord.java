import java.util.Scanner;

public class LongestWord {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the sentence :");
      String str = sc.nextLine();

      str = str.trim();


          if (str.isEmpty()) {
            System.out.println("No words entered.");
            sc.close();
            return;
          } 

          String[] words= str.split("\\s+");
          String longest = words[0];

          for (int i = 1 ; i < words.length ; i++) {

            if (words[i].length() > longest.length()) {
               longest = words[i];
          }
        }

      System.out.println("The Longest word in this sentence is:" + longest);
      System.out.println("Length of the longest word is :" + longest.length());
      sc.close();


    }

}
    