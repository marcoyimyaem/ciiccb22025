package otherFolder.tcoders;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner wordInput = new Scanner(System.in);
        System.out.print("Enter a Word:");
        String wordStringChecker =wordInput.nextLine();
        String wordStringRev = ""; // l e v e l
        for(int i = wordStringChecker.length()-1;i>=0;i--)
            wordStringRev+=wordStringChecker.charAt(i);
        System.out.println((wordStringChecker.equals(wordStringRev)
                                    ?"Palindrome":"Not"));
        //level =5 = 4
        //l e v e l
        //0 1 2 3 4
    }
}
