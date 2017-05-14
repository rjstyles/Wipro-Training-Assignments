class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("Bob", 1000000, 2010, "01248204");
        
        System.out.println("Details of Employee:");
        System.out.println("Name: " + e.getName());
        System.out.println("Year Of Starting: " + e.getYearOfStart());
        System.out.println("Annual Salary: " + e.getAnnualSalary());
        System.out.println("Insurance Number: " + e.getInsurancenumber());
    }
}