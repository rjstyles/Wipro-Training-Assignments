/**
 *  Sol Assignment 1
 *  By: Rajeev Singh (1405327)
 */

abstract class GeneralBank {
    abstract double getSavingInterestRate();
    abstract double getFixedInterestRate();
}

class ICICIBank extends GeneralBank {
    double getSavingInterestRate() {
        return 4;
    }
    double getFixedInterestRate() {
        return 8.5;
    }
}

class KotMBank extends GeneralBank {
    double getSavingInterestRate() {
        return 6;
    }
    double getFixedInterestRate() {
        return 9;
    }
}

public class main {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank();
        KotMBank kotMBank = new KotMBank();
        GeneralBank gBank1 =  new ICICIBank();
        GeneralBank gBank2 = new KotMBank();

        // observing
        System.out.println("ICICI BANK: " + 
                            "Fixed Rate = " + iciciBank.getFixedInterestRate() + "%, " + 
                            "Saving Rate = " + iciciBank.getSavingInterestRate() + "%");

        System.out.println("KOTAK MAHINDRA BANK: " + 
                            "Fixed Rate = " + kotMBank.getFixedInterestRate() + "%, " + 
                            "Saving Rate = " + kotMBank.getSavingInterestRate() + "%");

        System.out.println("GENERAL BANK1: " + 
                            "Fixed Rate = " + gBank1.getFixedInterestRate() + "%, " + 
                            "Saving Rate = " + gBank1.getSavingInterestRate() + "%");

        System.out.println("GENERAL BANK2: " + 
                            "Fixed Rate = " + gBank2.getFixedInterestRate() + "%, " + 
                            "Saving Rate = " + gBank2.getSavingInterestRate() + "%");
    }
}