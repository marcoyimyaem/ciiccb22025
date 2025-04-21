package chapter1;
import java.util.*;
public class Main{
     public static void main(String[] args) {
    //create and instance of a Toy class = Toy object

        /*   this
        *    is a
        * multiline 
        *comment
*/
        Toy toy1 = new Toy();
        toy1.name ="Rage pink";
        toy1.brand = "Lab Vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;
        System.out.println();
        Random r = new Random();
        System.out.println(r.nextInt(100));
        ArrayList al = new ArrayList<>();
        Date date1 = new Date();
} 
}