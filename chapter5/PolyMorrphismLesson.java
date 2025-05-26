package chapter5;

public class PolyMorrphismLesson {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        Object lemurAsObject = lemur;
        System.out.println();
        //
        Primate primate = lemur;
        HasTail hasTail = lemur;
        Lemur lemur2 = (Lemur) primate;
        System.out.println(lemur2.age);
        // System.out.println(primate.age);
        // System.out.println(hasTail.age);
        System.out.println(primate.hasHair());
        // System.out.println(hasTail.hasHair());
        System.out.println(hasTail.isTailStripped());
        // System.out.println(primate.isTailStripped());
        System.out.println(lemur.isTailStripped());
        System.out.println(lemur.age);
        System.out.println(lemur.hasHair());
        // System.out.println(lemurAsObject);
        // Fish fish = new Fish();
        // Bird bird = (Bird) fish;

        // Rodent rodent = new Rodent();
        // CapyBara capyBara = (CapyBara) rodent;
        
        CapyBara capyBara = new CapyBara();
        Rodent rodent = capyBara;
        // Virtual method
        Bird bird = new Bird();
        Bird bird2 = new Peacock();
        Bird bird3  = new Maya();
        bird.displayInformation();
        bird2.displayInformation();
        bird3.displayInformation();
        ZooWorker.feed(new Reptile());
        ZooWorker.feed(new Alligator());
        ZooWorker.feed(new Crocodile());
    }
}

class Lemur extends Primate implements HasTail{
    int age = 10;

    @Override
    public boolean isTailStripped() {
        return true;
    }
}
interface HasTail{
    boolean isTailStripped();
}
class Primate{
    boolean hasHair(){
        return true;
    }
}

class Bird{ 
    public String getName(){
        return "unknown";
    }
    public void displayInformation(){
        System.out.println("the bird name is:"+getName());
    }
}
class Peacock extends Bird{
    public String getName(){
        return "Peacock";
    }
}
class Maya extends Bird{
    public String getName(){
        return "Maya";
    }
}
class Fish{}

class Rodent{}

class CapyBara extends Rodent{

}

class Reptile{
    public String getName(){
        return getClass().getSimpleName();
        // return "Reptile";
    }
}
class Alligator extends Reptile{
    
}
class Crocodile extends Reptile{
    
}

class ZooWorker{
    public static void feed(Reptile reptile){
        System.out.println("Feeding reptile: "+reptile.getName());
    }
}