package otherFolder;
import chapter1.*;
import chapter4.AccessModifier;

public class SunFlower {
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        System.out.println(toy1);
        AccessModifier acm1 = new AccessModifier();
        acm1.greetMe();
        // acm1.greetMe2();
        // acm1.greetMe3();
        // acm1.greetMe4();
    }
}
class MoonFlower extends AccessModifier{
    public static void main(String[] args) {
        MoonFlower mf = new MoonFlower();
        mf.greetMe();
        mf.greetMe3();
        // mf.greetMe4();
    }
}

