package otherFolder.tcoders;

import java.time.LocalDate;
import java.util.Scanner;

public class LtoSample {
    public static void main(String[] args) {
        boolean appOpen = true;
        System.out.println("Welcome to LTO motor info system 1991");
        Scanner input1 = new Scanner(System.in);
        
        

        while(appOpen){
            int option = input1.nextInt();
            System.out.println("1: new Motorcycle registration: ");
            System.out.println("2: Annual Motorcycle registration: ");
            System.out.println("5: exit ");
            switch (option) {
                case 1:
                    System.out.println("1: new Motorcycle registration: ");
                    Motor m1 = new Motor(1, 245324, "Mio Sport", "Yamaha", 150, "black", 17, LocalDate.now(), false, "AT");
                    break;
            
                default:
                    appOpen=false;
                    break;
            }
        }
        System.out.println("end of program");
        
    }
    
}

class Motor{
    private int type;
    private int chasisNumber;  
    private String model;
    private String make;
    private int cc;

    private String color;
    private int region;
    private LocalDate lastReg;
    private boolean lateReg;
    private String transmission;


    public int getType() {
        return this.type;
    }

    public int getChasisNumber() {
        return this.chasisNumber;
    }

    public String getModel() {
        return this.model;
    }

    public String getMake() {
        return this.make;
    }



    public int getCc() {
        return this.cc;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRegion() {
        return this.region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public LocalDate getLastReg() {
        return this.lastReg;
    }

    public void setLastReg(LocalDate lastReg) {
        this.lastReg = lastReg;
    }

    public boolean isLateReg() {
        return this.lateReg;
    }


    public void setLateReg(boolean lateReg) {
        this.lateReg = lateReg;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }


    public Motor(int type, int chasisNumber, String model, String make, int cc, String color, int region, LocalDate lastReg, boolean lateReg, String transmission) {
        this.type = type;
        this.chasisNumber = chasisNumber;
        this.model = model;
        this.make = make;
        this.cc = cc;
        this.color = color;
        this.region = region;
        this.lastReg = lastReg;
        this.lateReg = lateReg;
        this.transmission = transmission;
    }

   
}
