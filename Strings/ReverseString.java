//Reverse the string by using loops.

import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string :");
        String str = sc.nextLine();

        String reversed = "";

        for (int i = str.length() -1 ; i >=0 ; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("The original string was:" + str);
        System.out.println("The reversed string is :" + reversed);

        sc.close();
    }

}


