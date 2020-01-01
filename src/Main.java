import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Main {
     static Scanner input = new Scanner(System.in);

     // Main Method to perform all operations
    public static void main(String[] args) throws ParseException {
        boolean entry = auth();

        if(entry) {
            menu();

        }
        else{
            System.out.println("Authorization failed, good-bye");
        }

    }

    // method to send authorization signal
    static boolean auth() throws ParseException {
        System.out.println("\n\n Authorization");
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

                    //check if it's in the file of admin list

                    // return true;
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
                Date date_of_birth = null;
                try {
                    date_of_birth = new SimpleDateFormat("dd/MM/yyyy").parse(DoB);
                } catch (ParseException e) {  System.out.print("Message: " + e); }

                System.out.print("\nStarted Working on (DD/MM/YYYY: ");
                String stDate = input.next();
                Date start_date = new SimpleDateFormat("dd/MM/yyyy").parse(stDate);
                System.out.print("\nMarital Status (Married, Single, Engaged): ");
                String maritalStatus = input.next();
//                validateString(maritalStatus);
                System.out.print("\nEducation Level: (BSC/Msc/PhD): ");
                String educationLevel = input.next();
//                validateString(educationLevel);
                System.out.print("\nPhone :");
                String phone = input.next();
//                validatePhone(phone);
                System.out.print("\nE-mail: ");
                String email = input.next();
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

                System.out.println("+++++++++++++++++++++++++++++");
                System.out.println("Account Created Successfully");
                auth(); break;
            default:
                System.out.print("Wrong Selection, try agian");
                auth(); break;
            }

       return false;
    }

    static void menu() {
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
    }
}
