import java.util.Scanner;

public class Student {
    private String studentID;
    private String firstName;
    private String lastName;
    private int year;
    private int tuitionBalance = 0;
    private String courses = "";

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
    }

    //generate an ID
    private void setStudentID() {
        //instantiates static var id for each new student created
        id++;
        // Grade level + ID
        this.studentID = year + "" + id;
    }

    //enroll in courses
    public void enroll(){
        do {
            System.out.println("Enter course to enroll (q for quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            //instead of course != q used equals to be able to break out of loop
            if (!course.equals("q")) {
                courses = courses + "\n  " + course;
                tuitionBalance += costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
    }

    //view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance + "\n");
    }

    //pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment + "\n");
        viewBalance();
    }

    //view status
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n"
                 + "Grade Year: " + year + "\n"
                 + "Student ID: " + studentID + "\n"
                 + "Courses Enrolled: " + courses + "\n"
                 + "Balance: $" + tuitionBalance + "\n";
    }
}
