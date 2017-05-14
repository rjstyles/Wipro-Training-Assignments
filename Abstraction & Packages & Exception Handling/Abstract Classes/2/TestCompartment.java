import java.util.Random;

abstract class Compartment {
    abstract void notice();
}

class FirstClass extends Compartment {
    void notice() {
        System.out.println("This is First Class!!");
    }
}

class Ladies extends Compartment {
    void notice() {
        System.out.println("This is Ladies Compartment!!");
    }
}

class General extends Compartment {
    void notice() {
        System.out.println("This is General Class!!");
    }
}

class Lugguage extends Compartment {
    void notice() {
        System.out.println("This is Lugguage Compartment!!");
    }
}

class TestCompartment {
    public static void main(String[] args) {
        Compartment c[] = new Compartment[10];

        //initillizing
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(4) + 1;
            switch (n) {
            case 1:
                c[i] = new FirstClass();
                break;
            case 2:
                c[i] = new Ladies();
                break;
            case 3:
                c[i] = new General();
                break;
            case 4:
                c[i] = new Lugguage();
                break;
            }
        }

        //checking polymophic behaviour
        for (int i = 0; i < 10; i++) {
            c[i].notice();
        }
    }
}