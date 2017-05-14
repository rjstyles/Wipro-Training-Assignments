class Person {
    String name;
}

class Student extends Person {
    int rollno;
}

class Teacher extends Person {
    String subject;
    double salary;

    Teacher(String n, String sub, double s) {
        name = n;
        subject = sub;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name + ", Subject: " + subject + ", Salary: " + salary);
    }
}

class CollegeStudent extends Student {
    int year;
    String major;

    CollegeStudent(String n, int roll, int y, String m) {
        name = n;
        rollno = roll;
        year = y;
        major = m;
    }

    void display() {
        System.out.println("Name: " + name + ", RollNo: " + rollno + ", year: " + year + ", Major: " + major);
    }
}

class main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Severus Snape", "Dark Arts", 1000000);
        CollegeStudent s = new CollegeStudent("Harry", 1, 7, "Magic");
        t.display();
        s.display();
    }
}

