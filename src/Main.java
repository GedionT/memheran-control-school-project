import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    // Instantiate objects for necessary roles
    ArrayList<Instructor> instructors = new ArrayList<>();
    ArrayList<Courses> courses = new ArrayList<>();
    private ArrayList<Admin> admins = new ArrayList<>();


    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        Scanner loader = new Scanner(System.in);
        Main main = new Main();                                   // creates a main object to access methods in this class
        char x = '0';                                             // termination signal

         System.out.println("\n\n\t\t\t      WELCOME :  እንኳን ደህና መጡ ፡ Bonjour ");
         System.out.println("\t\t      ==============================================  ");
         System.out.println("\t\t       Instructor Information in Course Management    ");
         System.out.println("\t\t      =============================================== \n\n");

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


    // method to send authorization signal
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
        System.out.println("\t 1. Employ Multiple Instructors");
        System.out.println("\t 2. Employ A Single Instructor");
        System.out.println("\t 3. Search Instructor by Name");
        System.out.println("\t 4. Search Instructor by Id");
        System.out.println("\t 5. Sort Instructors by Name");
        System.out.println("\t 6. List All Instructors \n\n");
        System.out.println("Enter your Choice: ");

        int choice = input.nextInt();

        switch(choice) {
            case 1: ;break;
            case 2: ;break;
            case 3: ;break;
            case 4: ;break;
            case 5: ;break;
            case 6: ;break;
            default: System.out.println("Select among the choices");
                break;
        }
    }

    //Search function
    private ArrayList<Admin> search(ArrayList<Admin> admins, String username){
        ArrayList<Admin> results = new ArrayList<>();

        admins.forEach(admin -> {
            if(admin.getUsername().equals(username.trim())) {
                results.add(admin);
            }
        });
        return results;

    }
}

    //Sort by username
//            admins.sort((a1,a2) -> {
//                a1.username.compareTo(a2.username);
//                    });
