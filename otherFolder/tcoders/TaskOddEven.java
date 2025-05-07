package tcoders;

import java.util.Scanner;

public class TaskOddEven {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        
       
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        scanner.close();
    }
}

class OddEvent{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String msg = (number==0)?" is zero":(number%2==0)?" is an even":" is an odd";
        System.out.println(number+msg+ ((number<0)?" negative":" positive")+" number");
        scanner.close();
    }
}