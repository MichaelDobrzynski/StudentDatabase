import java.util.Scanner;

public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private int year;
    private int balance;
    private String courses;
    private int costOfCourse = 600;

    //constructor prompts user to enter first name, last name, and year
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = in.nextLine();

        System.out.println("Student undergraduate years: \n 1. Freshman \n 2. Sophomore \n 3. Junior \n 4. Senior \n Choose one: ");
        this.year = in.nextInt();
        System.out.println(firstName + " " + lastName + ": " + year);

    }

    //generate an ID

    //enroll in courses

    //view balance

    //pay tuition

    //view status

}
