package Saas;

class Student {


    private int studentId;
    private String name;
    private int age;
    private String department;
    private double gpa;


    private static final String UNIVERSITY_NAME = "Somali University";
    private static final double PASSING_GPA = 2.0;
    private static final int MIN_AGE = 18;


    public Student(int studentId, String name, int age,
                   String department, double gpa) {

        this.studentId = studentId;
        this.name = name;
        this.department = department;
        setAge(age);
        setGpa(gpa);
    }


    public final void setAge(int age) {
        if (age < MIN_AGE) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        this.age = age;
    }


    public final void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0 and 4.");
        }
        this.gpa = gpa;
    }


    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public double getGpa() { return gpa; }
    public static String getUniversityName() { return UNIVERSITY_NAME; }


    public boolean hasPassed() {
        return gpa >= PASSING_GPA;
    }


    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
        System.out.println("University: " + UNIVERSITY_NAME);
        System.out.println("Passed: " + hasPassed());
        System.out.println("-------------------------");
    }
}

public class Main {

    public static void main(String[] args) {


        Student student1 = new Student(
                101, "Ahmed", 20, "Computer Science", 3.5);

        Student student2 = new Student(
                102, "Ali", 21, "Information Technology", 2.8);

        Student student3 = new Student(
                103, "Hassan", 19, "Computer Science", 1.7);

        Student student4 = new Student(
                104, "Omar", 22, "Software Engineering", 3.9);


        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
    }
}