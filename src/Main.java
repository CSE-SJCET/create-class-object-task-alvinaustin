     // TODO: Create a class called Student with name, rollNumber, and grade

    // TODO: Create a method to display student details
class Student {
    String name;
    int rollNumber;
    char grade;


    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
      public static void main(String[] args) {
        // TODO: Create a Student object and call the method to display details
            Student student = new Student();

        
        student.name = "Alvin";
        student.rollNumber = 14;
        student.grade = 'A';

       
        student.displayDetails();
    }
}
