import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Main {

    ArrayList<Instructor> instructors = new ArrayList<>();
    private ArrayList<Admin> admins = new ArrayList<>();

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        Scanner loader = new Scanner(System.in);
        String x = null;                                          // termination signal
        Main main = new Main();                                   // creates a main object to access methods in this class

        do {
            boolean entry = main.auth(main.admins);                         // authenticate administrator

            if (entry) {
                System.out.println("==============================");
                System.out.println(" Account Created Successfully ");
                System.out.println("==============================");
                main.menu();
            }
            // if entry from auth returns true, goes to menu
            else {
                System.out.println("Authorization failed, Try again? (Yes/No) ");
                x = loader.next();
            }
        }while( x != "no" || (x != "No") );

    }

    // method to send authorization signal
    private boolean auth(ArrayList<Admin> admins ) throws ParseException {
        System.out.println("\n\n\t Authorization");
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
                System.out.println("Enter information");
                System.out.print("First name: ");
                String firstName = input.next();
//                validateString(firstName);
                System.out.print("Middle name: ");
                String middleName = input.next();
//                validateString(middleName);
                System.out.print("Last name: ");
                String lastName = input.next();
//                validateString(lastName);
                System.out.print("Sex: ");
                String sex = input.next();
//                validateString(sex);
                System.out.print("Nationality: ");
                String nationality = input.next();
//                validateString(nationality);
                System.out.print("City: ");
                String city = input.next();
//                validateString(city);
                System.out.print("Sub-city: ");
                String subcity = input.next();
//                validateString(subcity);
                System.out.print("Woreda: ");
                String woreda = input.next();
//                validateString(woreda);
                System.out.print("Place of Birth: ");
                String place_of_birth = input.next();
//                validateString(place_of_birth);
                System.out.print("\nDate of Birth (DD/MM/YYYY): ");
                String DoB = input.next();
                Date date_of_birth = new SimpleDateFormat("dd/MM/yyyy").parse(DoB);
                System.out.print("\nStarted Working on (DD/MM/YYYY: ");
                String stDate = input.next();
                Date start_date = new SimpleDateFormat("dd/MM/yyyy").parse(stDate);
                System.out.print("\nMarital Status (Married, Single, Engaged): ");
                String maritalStatus = input.nextLine();
//                validateString(maritalStatus);
                System.out.print("\nEducation Level: (BSC/Msc/PhD): ");
                String educationLevel = input.nextLine();
//                validateString(educationLevel);
                System.out.print("\nPhone :");
                String phone = input.nextLine();
//                validatePhone(phone);
                System.out.print("\nE-mail: ");
                String email = input.nextLine();
//                validateEmail(email);
                System.out.print("\nSalary: ");
                Double salary = input.nextDouble();
                System.out.print("\nEnter new Username: ");
                String usrname = input.next();
                System.out.print("\nEnter new Password: ");
                String pswd = input.next();
                System.out.println("\n\n===========================\n");

                Admin newEntrant = new Admin(firstName, middleName, lastName, sex, nationality, city, subcity, woreda, place_of_birth, date_of_birth, start_date, maritalStatus, educationLevel, salary
                , phone, email, usrname, pswd);
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
