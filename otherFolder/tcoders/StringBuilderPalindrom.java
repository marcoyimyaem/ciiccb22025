package otherFolder.tcoders;

import java.util.Scanner;

public class StringBuilderPalindrom {
    public static void main(String[] args) {
        Scanner wordInput = new Scanner(System.in);
        System.out.print("Enter a Word:");
        StringBuilder wordStringChecker = new StringBuilder(wordInput.nextLine());
        System.out.println((wordStringChecker.toString()
                            .equals(wordStringChecker.reverse().toString()))
                            ? "Palindrom":"Not");

    }
}
