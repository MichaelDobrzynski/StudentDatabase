import java.util.Scanner;

public class Student {
    private String studentID;
    private String firstName;
    private String lastName;
    private int year;
    private int balance;
    private String courses;

    //reminder: static means that value or property is unspecific to object, but rather to entire class
    private static int costOfCourse = 600;

    private static int id = 1000;

    //constructor prompts user to enter first name, last name, and year
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = in.nextLine();

        System.out.println("Student undergraduate years: \n 1. Freshman \n 2. Sophomore \n 3. Junior \n 4. Senior \n Choose one: ");
        //implement code to only allow for numbers 1 - 4 to be entered
        this.year = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + ", " + year + ", " + studentID);

    }

    //generate an ID
    private void setStudentID() {
        //instantiates static var id for each new student created
        id++;
        // Grade level + ID
        this.studentID = year + "" + id;
    }

    //enroll in courses

    //view balance

    //pay tuition

    //view status

}
