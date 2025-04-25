package chapter2;

public class OperatorsLesson {
    public static void main(String[] args) {
        

        // shift ops
        System.out.println(2<<2);
        System.out.println(15>>1);
        //0 0 1 0
        //8 4 2 1

        //01 1 1 1 
        System.out.println(+3 + +6);
        int a = 0;
        System.out.println(a++);
        System.out.println(a);//1
        System.out.println(++a);//2
        System.out.println(a);
        short x = 10;
        short y = 30;
        short z =(short) (x*y);
        System.out.println("z="+z);
    }
}