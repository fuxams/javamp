class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void displayDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
    }
}

class Student extends Person {
    private int studentId;
    private String course;
    private String teacherName;

    public Student(String firstName, String lastName, int studentId, String course, String teacherName) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.course = course;
        this.teacherName = teacherName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Teacher: " + teacherName);
    }
}

class Teacher extends Person {
    private String subjectName;
    private double salary;

    public Teacher(String firstName, String lastName, String subjectName, double salary) {
        super(firstName, lastName);
        this.subjectName = subjectName;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subjectName);
        System.out.println("Salary: " + salary);
    }
}

public class Personx {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Wick", 1234, "Computer Science", "Mr. Smith");
        Student student2 = new Student("Jane", "Raj", 5678, "Mathematics", "Mrs. Johnson");
        Student student3 = new Student("Anil", "Varma", 7777, "Acting", "Emilia Clarke");
        Teacher teacher1 = new Teacher("Mr.", "DeCaprio", "Computer Science", 50000);
        Teacher teacher2 = new Teacher("Mrs.", "Emily Stone", "Mathematics", 55000);
        Teacher teacher3 = new Teacher("Mrs.", "Emilia Clarke", "Acting", 100000);
        

        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
        teacher1.displayDetails();
        System.out.println();
        teacher2.displayDetails();
        System.out.println();
        teacher3.displayDetails();
        System.out.println();
        student3.displayDetails();
        // This are the details
        System.out.println();


    }
}



