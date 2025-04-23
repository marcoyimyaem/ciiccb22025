package chapter1;

import java.util.Date;

public class ReferenceLesson{
    int person;
    boolean isPerson;
    Toy toy1;
    String name;

    public static void main(String[] args) {
        Date today = new Date();
        String greeting = "Hello TESDA QC";
        System.out.println();
        int counter, readerCount = 1;
        counter = 0;
       
        ReferenceLesson rf = new ReferenceLesson();
        System.out.println(rf.isPerson);
    }
}