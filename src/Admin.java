import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Admin roles are given for employees
 * The only role that can access the system and perform actions
 * Can create, read, query Employees, specifically instructors along their associated course
 * Can add new course information as well
 * Note: Several inputs are validated using the validator interface to reduce mistakes
 *
 */

public class Admin extends Employee implements validator {

    private String username;
    private String password;

    // default constructor used for creating the root admin
    Admin(String firstName, String middleName, String lastName, String sex, String nationality, String city, String subcity, int woreda, String place_of_birth, Date date_of_birth, Date start_date, String maritalStatus, String educationLevel, Double salary, String phone, String email, String usrname, String pswd) {
        super(firstName, middleName, lastName, sex, nationality, city, subcity, woreda, place_of_birth, date_of_birth, start_date, maritalStatus, educationLevel, salary, phone, email);
        this.username = usrname;
        this.password = pswd;
    }

      Admin() throws ParseException {

          System.out.println("\n\n============================\n");
          super.setEmpId();
          System.out.print("Employment Id: " + getEmpId());
          System.out.print("\nFirst Name: ");
          setFirstName(stringValidate(input.nextLine()));
          System.out.print("Middle Name: ");
          setMiddleName(stringValidate(input.nextLine()));
          System.out.print("Last Name: ");
          setLastName(stringValidate(input.nextLine()));
          System.out.print("Gender: ");
          setSex(stringValidate(input.nextLine()));
          System.out.print("Nationality: ");
          setNationality(stringValidate(input.nextLine()));
          System.out.print("City: ");
          setCity(stringValidate(input.nextLine()));
          System.out.print("Sub-City: ");
          setSubcity(stringValidate(input.nextLine()));
          System.out.print("Woreda: ");
          setWoreda(input.nextInt());
          input.nextLine();
          System.out.print("Place of Birth: ");
          setPlace_of_birth(stringValidate(input.nextLine()));
          System.out.print("Date of Birth (DD/MM/YYYY): ");
          String DoB = input.nextLine();
          try {
              setDate_of_birth(new SimpleDateFormat("dd/MM/yyyy").parse(DoB));
          } catch (Exception e) {
              System.out.print("Error : "  + e);
          }
          System.out.print("\nMarital Status (Married, Single, Engaged): ");
          setMaritalStatus(stringValidate(input.nextLine()));
          System.out.print("Education Level (BSC/Msc/PhD): ");
          setEducationLevel(stringValidate(input.nextLine()));
          System.out.print("Phone: ");
          setPhone(phoneValidate(input.nextLine()));
          System.out.print("E-mail: ");
          setEmail(emailValidate(input.nextLine()));
          System.out.print("Salary: ");
          double salary = input.nextDouble();
          setSalary(salary);
          input.nextLine();
          System.out.println(" ------------------ \n");
          System.out.println("Enter new username: ");
          username = input.nextLine();
          System.out.println("Enter new password: ");
          password = input.nextLine();
          System.out.println();
      }


    // setter methods
    public void setUsername(String username) {
        this.username = username.trim();
    }

    public void setPassword(String password) {
        this.password = password.trim();
    }

    // getter methods
    String getUsername() {
        return username;
    }

    String getPassword() {
           return password;
    }
}
