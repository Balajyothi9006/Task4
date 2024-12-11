//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Student {

    int rollno;
    String name;
    int age;
    String course;

    public Student(int rollno, String name, int age, String course)

            throws AgeNotWithRangeException, NameNotValidException {

        if (age < 15 || age > 21) {
            throw new AgeNotWithRangeException("Age of the student must be between 15 to 21");
        }
        if (!name.matches("[a-zA-z\\s]+")) {
            throw new NameNotValidException("Name shouldn't contain numbers or special characters");

        }


        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {

        System.out.println("Rollno:"+rollno);
        System.out.println("Name of the student:"+name);
        System.out.println("Age:"+age);
        System.out.println("Course:"+course);
    }


    public static void main(String[] args) {


        try {
            Student s1 = new Student(1, "Jyothi", 18, "CSE");
            s1.display();
            Student s2 = new Student(2, "Aadhya@11", 18, "ECE");
        } catch (AgeNotWithRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
        try {
            Student s3 = new Student(3, "Dharani", 10, "EEE");

        } catch (AgeNotWithRangeException | NameNotValidException e1) {
            System.out.println(e1.getMessage());
        }
    }
}




