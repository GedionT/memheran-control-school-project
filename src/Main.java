import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        ArrayList<Employee> TestOne = new ArrayList<Employee>();
//        System.out.print("How many users do you want to register now?");
//        int n = input.nextInt();

        menu();


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
        System.out.println("\t 6. List All Instructors");

    }
}
