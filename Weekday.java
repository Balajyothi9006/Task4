import java.util.Scanner;

public class Weekday {



        public static void main(String[] args) {
            // Array of weekdays
            String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            Scanner scanner = new Scanner(System.in);

            try {
                // input for the day position
                System.out.print("Enter the day index (0-6): ");
                int index = scanner.nextInt();


                System.out.println("The day is: " + weekdays[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // array index out-of-bounds exception
                System.out.println("Error: Please enter a number between 0 and 6.");
            }
                scanner.close();
            }


}
