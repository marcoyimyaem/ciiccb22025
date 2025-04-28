package chapter2;
public class IfStatementLesson {
    public static void main(String[] args) {
        int hourOfDay=22;
        if(hourOfDay<11)
            System.out.println("Good Morning");
        System.out.println("Kumain kana ba?");

        //if else
        if(hourOfDay<11)
            System.out.println("Good Morning");
        else
            System.out.println("Good Afternoon");
        System.out.println("Good Afternoon");

        //if, else if, else
        if(hourOfDay>=18)
            System.out.println("Good Eve");
        else if(hourOfDay>=12)
            System.out.println("Good Afternoon");
        else
            System.out.println("Good Morning");
         // (boolean expression) ? T : F;
         System.out.println((hourOfDay>=18)?"Good Eve":(hourOfDay>=12)?"Good Afternoon":"Good Morning");
         int dayOfWeek =9;
         switch(dayOfWeek){
             
             case 1: System.out.println("Monday");
                     break;
             case 2: System.out.println("Tuesday");
                     break;
             case 3: System.out.println("Wednesday");
                     break;
             default:
                     System.out.println("Invalid Day of Week");
             case 4: System.out.println("Thusday");
                     break;
             case 5: System.out.println("Friday");
                     break;
             case 6: 
             case 7: System.out.println("Weekends");
                     break;
             
         }
    }
}
