import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Admin extends Employee implements validator {

    private String username;
    private String password;

    // default constructor
       public Admin(String firstName, String middleName, String lastName, String sex, String nationality, String city, String subcity, String woreda, String place_of_birth, Date date_of_birth, Date start_date, String maritalStatus, String educationLevel, Double salary, String phone, String email, String usrname, String pswd) {
        super(firstName, middleName, lastName, sex, nationality, city, subcity, woreda, place_of_birth, date_of_birth, start_date, maritalStatus, educationLevel, salary, phone, email);
        this.username = usrname;
        this.password = pswd;
    }

      public Admin() throws ParseException {

          System.out.println("\n\n============================\n");
          super.setEmpId();
          System.out.print("Employment Id: " + getEmpId());
          System.out.print("\nFirst Name: ");
          System.out.print(stringValidate(input.next()));
          setFirstName(stringValidate(input.next()));
          System.out.print("\nMiddle Name: ");
          setMiddleName(stringValidate(input.next()));
          System.out.print("\nLast Name: ");
          setLastName(input.nextLine());
          stringValidate(getLastName());
          System.out.print("\nGender: ");
          setSex(input.nextLine());
          stringValidate(getSex());
          System.out.print("\nNationality: ");
          setNationality(input.nextLine());
          stringValidate(getNationality());
          System.out.print("\nCity: ");
          setCity(input.nextLine());
          stringValidate(getCity());
          System.out.print("\nSub-City: ");
          setSubcity(input.nextLine());
          stringValidate(getSubcity());
          System.out.print("\nWoreda: ");
          setWoreda(input.nextLine());
          stringValidate(getWoreda());
          System.out.print("\nPlace of Birth: ");
          setPlace_of_birth(input.nextLine());
          stringValidate(getPlace_of_birth());
          System.out.print("\nDate of Birth (DD/MM/YYYY): ");
          String DoB = input.nextLine();
          setDate_of_birth(new SimpleDateFormat("dd/MM/yyyy").parse(DoB));
          System.out.print("\nMarital Status (Married, Single, Engaged): ");
          String maritalStatus = input.nextLine();
          setMaritalStatus(maritalStatus);
          stringValidate(getMaritalStatus());
          System.out.print("\nEducation Level: (BSC/Msc/PhD): ");
          String educationLevel = input.nextLine();
          setEducationLevel(educationLevel);
          stringValidate(getEducationLevel());
          System.out.print("\nPhone :");
          String phone = input.nextLine();
          phoneValidate(phone);
          System.out.print("\nE-mail: ");
          String email = input.nextLine();
          setEmail(email);
          emailValidate(email);
          System.out.print("\nSalary: ");
          double salary = input.nextDouble();
          setSalary(salary);
          System.out.println(" ------------------ \n");
          System.out.println("Enter new username: ");
          username = input.nextLine();
          stringValidate(username);
          System.out.println("Enter new password: ");
          password = input.next();
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
    public String getUsername() {
        return username;
    }

    public String getPassword() {
           return password;
    }


}
