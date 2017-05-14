import java.util.Random;
abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    void play() {
        System.out.println("Piano is playing  tan tan tan tan");
    }
}

class Flute extends Instrument {
    void play() {
        System.out.println("Flute is playing  toot toot toot toot");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Guitar is playing  tin  tin  tin");
    }
}

class main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(3) + 1;
            switch (n) {
            case 1:
                instruments[i] = new Piano();
                break;
            case 2:
                instruments[i] = new Flute();
                break;
            case 3:
                instruments[i] = new Guitar();
                break;
            }
        }

        // checking polymorphic behaviour
        for (int i = 0; i < 10; i++) {
            if(instruments[i] instanceof Piano)
                System.out.print("Instrument " + i + " is of type Piano, ");
            if(instruments[i] instanceof Flute)
                System.out.print("Instrument " + i + " is of type Flute, ");
            if(instruments[i] instanceof Guitar)
                System.out.print("Instrument "+ i + " is of type Guitar, ");
            instruments[i].play();
        }
    }
}