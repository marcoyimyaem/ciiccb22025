package chapter2;

import java.util.Scanner;

public class LoopsLesson {
    static boolean op(){
        return true;
    } 
    public static void main(String[] args) {
        byte a = 1;
        while(a<=10)
            System.out.println("a = "+a++);
       

        do
            System.out.println("do while : a = "+a--);
        while (a<10);
        System.out.println("end of program");
        int b = 0;
        boolean bol = true;
        for( ;b<10;b++)
            System.out.println("b = "+b++);

        System.out.println("enter a valid number");
        Scanner q = new Scanner(System.in);
        int limit = q.nextInt();
        for(int x=1;x<limit;x++){
            for(int y=1;y<=x;y++){
                System.out.print(x);
            }
            System.out.println();
        }
        int colorCounter = 0;
        String colorSearch = "black";
        String[] colors ={"black","red","pink","yellow","white","blue","black","red","pink","yellow","white","blue","black"}; 
        for(String color: colors)
            // System.out.println("Color: "+color);
            if(color.equals(colorSearch))
                colorCounter++;
        System.out.println("Found "+colorCounter+ " " + colorSearch);
        }
        
    
}