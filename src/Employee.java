import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * First-level-child that extends the person superclass
 * Both Admins and Instructors have intersecting data from this class.
*/

public abstract class Employee extends Person {

    // Declaring the types of data all employee's have registered upon employment
       private String empId;
       private Date start_date;
       private String maritalStatus;
       private String educationLevel;
       private Double salary;
       private String phone;
       private String email;


       private Scanner input = new Scanner(System.in);

       // optional and not for use
       Employee(String firstName, String middleName, String lastName, String sex, String nationality, String city, String subcity, String woreda, String place_of_birth, Date date_of_birth, Date start_date, String maritalStatus, String educationLevel, Double salary, String phone, String email) {
        super(firstName, middleName, lastName, sex, nationality, city, subcity, woreda, place_of_birth, date_of_birth);
        setEmpId();
        this.start_date = start_date;
        this.maritalStatus = maritalStatus;
        this.educationLevel = educationLevel;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    // optional param empty constructor for future iterations
    Employee() throws ParseException {
       System.out.println("\n\n===========================\n");
       setEmpId();
       System.out.print("Employment Id: " + getEmpId());
       System.out.print("\nFirst Name: ");
       setFirstName(input.nextLine());
       stringValidate(getFirstName());
       System.out.print("\nMiddle Name: ");
       setMiddleName(input.nextLine());
       stringValidate(getMiddleName());
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
       maritalStatus = input.nextLine();
       stringValidate(maritalStatus);
       System.out.print("\nEducation Level: (BSC/Msc/PhD): ");
       educationLevel = input.nextLine();
       stringValidate(educationLevel);
       System.out.print("\nPhone :");
       phone = input.nextLine();
       phoneValidate();
       System.out.print("\nE-mail: ");
       email = input.nextLine();
       System.out.print("\nSalary: ");
       salary = input.nextDouble();
       System.out.println("\n\n===========================\n");
   }

   private static int amount = 100;
    // setters for individual information update
    public void setEmpId() {
       this.empId = "ETS" + amount;
       amount++;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // getters
    public String getEmpId() { return empId; }

    public Date getStart_date() {
        return start_date;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public double getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }


        // calcAge();

        //calcTax();

        //calcNet();

        //calcEmpTime();

        //public void display()
}
