import java.util.Scanner;

public class WordCounter {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the paragraph :");
      String str = sc.nextLine();

      str = str.trim();

      int wordCount= 0 ;

          if (str.isEmpty()) {

            wordCount = 0 ;
          } else {
            String[] words = str.split("\\s+");
            wordCount = words.length;
          }

      

      System.out.println("The word count of this paragraph is:" +wordCount);

      sc.close();


    }
    
}
