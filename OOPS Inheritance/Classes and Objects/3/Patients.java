class Patient {
    private String name;
    double height, weight;

    Patient(double h, double w) {
        height = h;
        weight = w;
    }

    double BMI() {
        double bmi = (weight / (height * height) ) * 703;
        return bmi;
    }
}

class Patients {
    public static void main(String[] args) {
        Patient p = new Patient(66.8, 112.436);
        System.out.println("BMI of Patient is: " + p.BMI());
    }
}