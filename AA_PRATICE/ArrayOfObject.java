package AA_PRATICE;

public class ArrayOfObject {

    // Inner class Student
    class Student {
        String name;
        int age;

        // Constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display student details
        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class to access the inner class
        ArrayOfObject arrayOfObject = new ArrayOfObject();

        // Create an array to store 3 Student objects
        Student[] students = new Student[3];

        // Initialize the array with Student objects
        students[0] = arrayOfObject.new Student("Alice", 20);
        students[1] = arrayOfObject.new Student("Bob", 22);
        students[2] = arrayOfObject.new Student("Charlie", 21);

        // Display details of all students
        for (Student student : students) {
            student.display();
        }
    }
}

