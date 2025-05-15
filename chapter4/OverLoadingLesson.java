package chapter4;

public class OverLoadingLesson{
    public void fly(int numMiles){
        System.out.println("int");
    }
    // public int fly(int numKilometers){
    //     System.out.println("int"); //duplicate method
    // }
    public void fly(short numFeet){
        System.out.println("short");
    }
    public void fly(Object obj){
        System.out.println("Object");
    }
    public boolean fly(){
        return false;
    }
    void fly(int numMiles, short numFeet){
        System.out.println("int, short");
    }
    public void fly(short numFeet,int numMiles ) throws Exception{}
    public static void main(String[] args) {
        OverLoadingLesson oll = new OverLoadingLesson();
        short s = 1;
        oll.fly(1);
        oll.fly(s);
        System.out.println(oll.fly());
        oll.fly(1,(byte)1);
        oll.fly(new AccessMod());
        
    }
}
class Glider2 {
    public static String glide(String s) {
      return "1";
    }
    public static String glide(String... s) {
      return "2";
    }
    public static String glide(Object o) {
      return "3";
    }
    public static String glide(String s, String t) {
      return "4";
    }
    public static String glide5(byte b) {
      return "3";
    }
    public static void main(String[] args) {
      System.out.println(glide("a"));
      System.out.println(glide("a", "b"));
      System.out.println(glide("a", "b", "c"));
      System.out.println(glide("a", "b", "c"));
    } }