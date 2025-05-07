package chapter3;
import java.util.*;
public class ArrayLesson {
    public static void main(String...  args  ) {
        int [] i = new int[3];
        int[] numbers2 = new int[]{1,54,75}; 
        int[] numbers3 = {1,54,75};
        Student[] batch2 = {new Student(),new Student(),new Student(),new Student(),null};
        for(int j = 0; j<numbers3.length;j++)
            System.out.println(numbers3[j]);
        int searchNum = 9;
        // System.out.println("\n"+searchNum+" search result: "+ Arrays.binarySearch(numbers4, searchNum));
        String[] numbersString = {"1","a","54","75","5","76","34","7","3","8","10","34"};
        String stringSearch = "A";
        Arrays.sort(numbersString);
        for(String numberString: numbersString)
            System.out.print(numberString+", ");
        System.out.println("\n"+stringSearch+" search result: "+ Arrays.binarySearch(numbersString, stringSearch));
        int[][] diffsize = {{1,2},{3},{9,8,7}};
        System.out.println(diffsize[2][2]);
    }//  1  2  3 4 5 6
     //  0  1  2 3 4 5
     //-1 -2 -3
    }

class Student{
    String fullname;
    int age;
    String address;
    String course;
    int yearLevel;
}


class Test001{
    public static void main(String[] args) {
        int[] arr = {2,1,0};
        //2 1 0
        //0 1 2
        for(int i:arr)
            System.out.println(arr[i]);
    }
}