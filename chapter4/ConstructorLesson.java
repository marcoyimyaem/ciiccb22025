package chapter4;

public class ConstructorLesson{
    private static int code1 = 234435;
    static int getCode1(){
        return code1;
    }
    public static void main(String[] args) {

        Bunny bunny1 = new Bunny("Bugs");
        Bunny bunny2 = new Bunny("Lola");
        Hamster hamster1 = new Hamster(2);
        Hamster hamster2 = new Hamster(2,"White");
        System.out.println();
    }
}

class Bunny{
    String name;
    public Bunny(String name){
        this.name = name;
        System.out.println("this is Bunny Constructor");
    }
}

class Hamster{ 
    private String color;
    private int weight;
    public Hamster(int weight){ // 1st constructor
        // this.weight = weight;
        // color = "brown";
        this(weight, "brown");
    }
    public Hamster(int weight,String color){ //2nd constructor
        this.weight = weight;
        this.color = color;
    }
}

class InitializationOrderSimple {
    private String name = "Torchie";
    { System.out.println(name); }
    private static int COUNT = 0;
    static { System.out.println(COUNT); }
    static { COUNT += 10; System.out.println(COUNT); }
    public InitializationOrderSimple() {
      System.out.println("constructor");
    } 
    public static void main(String[] args) {
        InitializationOrderSimple init = new InitializationOrderSimple();
    }
}