package chapter4;

public class ReturnType {
    void startEngine(){
        System.out.println("Engine is running");
        // return;
    }
    int getAge(){
        return (byte) 23;
        
    }
    Avocado getAvocado(){
        return null;
    }
    boolean oddOrEven(int a){
        // boolean result = ((a%2)==0) ? true : false;
        // return result;
        return ((a%2)==0) ? true : false;
    }
    int addTwoNumbers(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        ReturnType rt = new ReturnType();
        System.out.println("Good Morning you are now "+ rt.getAge()+" years old");
        int y = 123230,z = 1;
        System.out.println("is the value "+y+" even number?: "+rt.oddOrEven(y));
        System.out.println("a = "+y+"\nb = "+z+"\na + b = "+rt.addTwoNumbers(y, z));
    }
}

class Avocado{

}