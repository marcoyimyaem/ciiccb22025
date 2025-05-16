package chapter4;

public class EncapsulationLesson{
    public static void main(String[] args) {
        Swan mother = new Swan();
        // mother.numberEggs = 31;
        mother.setNumberEggs(31);
        System.out.println(mother.getNumberEggs());
    }
}

class Swan {
    private int numberEggs;                    // private
    public int getNumberEggs() {                    // getter
      return numberEggs;
    }
    public void setNumberEggs(int numberEggs) {     // setter
        if (numberEggs >= 0)                     // guard condition
            this.numberEggs = numberEggs;
        else
            System.out.println("invalid numberEggs");
    } }