import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * Main Driver for program entry.
 * All functionality implemented here
 */

public class Main {

    // Instantiate objects for necessary roles
    ArrayList<Instructor> instructors = new ArrayList<>();
    ArrayList<Courses> courses = new ArrayList<>();
    private ArrayList<Admin> admins = new ArrayList<>();


    // root user creation for convenience on first launch - direct access
    private String firstName="Samuel";
    private String middleName= "Raphael";
    private String lastName = "Solomon";
    private String sex = "male";
    private String nationality="Ethiopian";
    private String city="ADD";
    private String subcity="Bole";
    private int woreda=32;
    private String place_of_birth = "ADD";
    private Date date_of_birth=new SimpleDateFormat("dd/MM/yyyy").parse("11/12/1999");
    private Date start_date=new SimpleDateFormat("dd/MM/yyyy").parse("08/03/2019");
    private String maritalStatus="single";
    private String educationLevel="BSc";
    private Double salary= 85122.22;
    private String phone="0911255552";
    private String email="samraph@gmail.com";
    private String usrname="root";
    private String pswd="123";
    //

        private Scanner input = new Scanner(System.in);

        //to add root user
        private Main() throws ParseException {}

    private String spaces(int n){
            String space="";
            for (int i=0; i<n; i++) space+=" ";
            return space;
    }

    // pauses the screen with a message until enter is pressed
    private void pause(){
        input.nextLine();
        System.out.println("Press Enter to Continue");
        String x = input.nextLine();
    }
    public static void main(String[] args) throws ParseException {

        Scanner loader = new Scanner(System.in);
        Main main = new Main();                                   // creates a main object to access methods in this class
        Admin root = new Admin(main.firstName, main.middleName, main.lastName, main.sex, main.nationality,main.city, main.subcity,main.woreda,main.place_of_birth,main.date_of_birth,main.start_date,
                main.maritalStatus, main.educationLevel, main.salary, main.phone,main.email, main.usrname, main.pswd);

        main.admins.add(root);                                    // saves root admin information
        char x = '0';                                             // termination signal

        System.out.println("\n\n\t\t   =================================================");
         System.out.println("\t\t\t      WELCOME :  እንኳን ደህና መጡ ፡ BONJOUR ");
         System.out.println("\t\t       ==============================================  ");
         System.out.println("\t\t       Instructor Information in Course Management    ");
         System.out.println("\t\t     ================================================== \n\n");

        do {
            boolean entry = main.auth(main.admins);               // authenticate administrator

                if (entry) {
                    System.out.println("===============================================");
                    System.out.println(" Authentication Successful! You are logged in");
                    System.out.println("===============================================");
                      main.menu();
                 }
                 else {
                      System.out.println("Authorization failed, Try again? (Y/N) ");
                      x = loader.next().charAt(0);
                 }

        }while( (x != 'n') && (x != 'N') );

        System.out.println(" -- Thank You, Good Bye! -- ");
    }


    // method to send authorization signal or create a new admin account
    private boolean auth(ArrayList<Admin> admins ) throws ParseException {
        System.out.println("\n\n\t Authorization ");
        System.out.println(" ==================== ");
        System.out.println("1. Already Have an Admin Account");
        System.out.println("2. Create a new Admin Account");

        int choice =input.nextInt();

        switch (choice) {
            case 1:
                    System.out.print("Enter username: ");
                    String username = input.next();
                    System.out.print("Enter password: ");
                    String password = input.next();
                final boolean[] found = {false};
                    //check if it's in the file of admin list
                    admins.forEach(admin -> {
                        if(admin.getUsername().equals(username.trim())&&admin.getPassword().equals(password.trim())) {
                            found[0] = true;
                        }
                    });

                     return found[0];

            case 2:
                Admin newEntrant = new Admin();
                this.admins.add(newEntrant);
                System.out.println("==============================");
                System.out.println(" Account Created Successfully ");
                System.out.println("==============================");
                this.auth(this.admins); break;
            default:
                System.out.print("Wrong Selection, try again");
                this.auth(this.admins); break;
            }
       return false;
    }

     private void menu() {

        System.out.println("\n\n ==================================================== ");
        System.out.println(" --- INSTRUCTOR INFORMATION IN COURSE MANAGEMENT --- ");
        System.out.println(" ==================================================== ");
        System.out.println("\n\t\t\t Menu \n");
        System.out.println("\t\t ---------------- \n");
        System.out.println("\t 1. Hire a Single Instructor");
        System.out.println("\t 2. Hire Multiple Instructors");
        System.out.println("\t 3. Search Instructor by Id");
        System.out.println("\t 4. Search Instructor by Name");
        System.out.println("\t 5. Sort Instructors by Name");
        System.out.println("\t 6. Fire an Instructor");
        System.out.println("\t 7. List All Instructors");
        System.out.println("\t 8. Add a New Course");
        System.out.println("\t 9. List all Courses");
        System.out.println("\t10. Logout \n\n");
        System.out.println("Enter your Choice: ");
        int choice = input.nextInt();

        switch(choice) {
            case 1:

                try {
                    Instructor newInstructor = new Instructor();
                    int counter=0;
                    System.out.println("Select Course for Instructor");
                    for(Courses course: courses){
                        System.out.println("NO.\tCode" + spaces(20) +"Name"+spaces(20)+" Department"+ spaces(20)+"Credit_hr\t Lecture_hr\t Lab_hr\t Category");
                        System.out.println("============================================================================================================================================================================================");
                        System.out.print((counter++)+"\t");
                        course.display();// display all courses with info
                        pause();
                    }

                    int chce = input.nextInt();
                    if(chce>courses.size()||chce<0){
                        System.out.println("ERROR\nTry Again");
                        pause();
                        break;
                    }
                    newInstructor.setCourse(courses.get(chce));
                    instructors.add(newInstructor);
                } catch (ParseException e) {
                    System.out.println("Error found: "+ e);
                }
                break;
            case 2: ;break;
            case 3: ;break;
            case 4: ;break;
            case 5: ;break;
            case 6: ;break;
            case 7: ;break;
            case 8:
                    Courses newCourse = new Courses();
                    this.courses.add(newCourse);
                    System.out.println("===========================");
                    System.out.println(" Course Added Successfully ");
                    System.out.println("===========================");
                    pause();
                    break;
            case 9:
                    System.out.println("Code" + spaces(20) +"Name"+spaces(20)+" Department"+ spaces(20)+"Credit_hr\t Lecture_hr\t Lab_hr\t Category");
                    System.out.println("============================================================================================================================================================================================");
                    courses.forEach(Courses::display); // display all courses with info
                    pause();
                    break;
            case 10:
                // logout for new user
                    try {
                        auth(admins);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                         break;
            default: System.out.println("Select among the choices");
                break;
        }
         this.menu();
     }

    // Search function, Instructor by name
    private ArrayList<Instructor> searchInstructorByName(ArrayList<Instructor> instructors, String name){
        ArrayList<Instructor> results = new ArrayList<>();

        // accumulate results
        instructors.forEach(instructor -> {
            if(instructor.getFirstName().equals(name.trim())) {
                results.add(instructor);
            }
        });
        return results;
    }

    // Search function, Instructor by id
    private ArrayList<Instructor> searchInstructorById(ArrayList<Instructor> instructors, String id){
       ArrayList<Instructor> results = new ArrayList<>();

       // accumulate results
        instructors.forEach(instructor -> {
            // must be updated to return one unique record to cut resource cost
            if(instructor.getEmpId().equals(id.trim())) {
                results.add(instructor);
            }
        });
        return results;
    }
}

    //Sort by username
//            admins.sort((a1,a2) -> {
//                a1.username.compareTo(a2.username);
//                    });
