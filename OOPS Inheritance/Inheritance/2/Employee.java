class Employee extends Person {
    double annualSalary;
    int yearOfStart;
    String insuranceNumber;

    Employee() {
        name = "NoName";
        annualSalary = 1000000;
        yearOfStart = 2017;
        insuranceNumber = "0142512";
    }

    Employee(String name, double salary, int year, String insurance) {
        this.name = name;
        annualSalary = salary;
        yearOfStart = year;
        insuranceNumber = insurance;
    }

    String getName() {
        return name;
    }
    double getAnnualSalary() {
        return annualSalary;
    }

    int getYearOfStart() {
        return yearOfStart;
    }

    String getInsurancenumber() {
        return insuranceNumber;
    }
}   