import java.util.*;

public class StudentGrade {
    // HashMap to store student names and grades
    private HashMap<String, Integer> studentGrades;

    // Constructor
    public StudentGrade() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student added: " + name + " with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display students sorted by grade
    public void displayStudents() {
        studentGrades.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // Sort by grade descending
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public static void main(String[] args) {
        StudentGrade manager = new StudentGrade();
        manager.addStudent("Jyothi", 90);
        manager.addStudent("Dharani", 91);
        manager.addStudent("Dharshi", 72);
        System.out.println("Students sorted by grades:");
        manager.displayStudents();
        manager.removeStudent("Dharani");
        System.out.println("Students");
        manager.displayStudents();
    }
}
