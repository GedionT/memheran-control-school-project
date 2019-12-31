import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Employee {

    // Declaring the types of data all employee's have registered upon employment
       private String empId;
       private String firstName;
       private String middleName;
       private String lastName;
       private String sex;
       private String nationality;
       private String city;
       private String subcity;
       private String woreda;
       private int kebele;
       private String place_of_birth;
       private Date date_of_birth;
       private Date start_date;
       private String maritalStatus;
       private String educationLevel;
       private double salary;
       private String phone;
       private String email;


       Scanner input = new Scanner(System.in);

   public void insert() throws ParseException {
       System.out.println("\n\n===========================\n");
       System.out.print("First Name: ");
       firstName = input.nextLine();
       stringValidate(getFirstName());
       System.out.print("\nMiddle Name: ");
       middleName = input.nextLine();
       stringValidate(getMiddleName());
       System.out.print("\nLast Name: ");
       lastName = input.nextLine();
       stringValidate(getLastName());
       System.out.print("\nGender: ");
       sex = input.nextLine();
       stringValidate(getSex());
       System.out.print("\nNationality: ");
       nationality = input.nextLine();
       stringValidate(getNationality());
       System.out.print("\nCity: ");
       city = input.nextLine();
       stringValidate(getCity());
       System.out.print("\nSub-City: ");
       subcity = input.nextLine();
       stringValidate(getCity());
       System.out.print("\nWoreda: ");
       woreda = input.nextLine();
       stringValidate(getWoreda());
       System.out.print("\nPlace of Birth: ");
       place_of_birth = input.nextLine();
       stringValidate(getPlace_of_birth());
       System.out.print("\nDate of Birth (DD-MM-YYYY): ");
       String DoB = input.nextLine();
       date_of_birth = new SimpleDateFormat("dd/MM/yyyy").parse(DoB);
       System.out.print("\nMarital Status (Married, Single, Engaged): ");
       maritalStatus = input.nextLine();
       stringValidate(getMaritalStatus());
       System.out.print("\nEducation Level: (BSC/Msc/PhD): ");
       educationLevel = input.nextLine();
       stringValidate(getEducationLevel());
       System.out.print("\nPhone :");
       phone = input.nextLine();
       phoneValidate(getPhone());
       System.out.print("\nE-mail: ");
       email = input.nextLine();
       emailValidate(getEmail());
       System.out.print("\nSalary: ");
       salary = input.nextDouble();
       System.out.println("\n\n===========================\n");
   }

    // setters for individual information update

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSubcity(String subcity) {
        this.subcity = subcity;
    }

    public void setWoreda(String woreda) {
        this.woreda = woreda;
    }

    public void setKebele(int kebele) {
        this.kebele = kebele;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
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
        phoneValidate();
    }

    public void setEmail(String email) {
        this.email = email;
        emailValidate();
    }

    // getters

    public String getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }

    public String getCity() {
        return city;
    }

    public String getSubcity() {
        return subcity;
    }

    public String getWoreda() {
        return woreda;
    }

    public int getKebele() {
        return kebele;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

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


    // exposed methods
        //stringValidate();

        // phoneValidate();

        // emailValidate();

        // calcAge();

        //calcTax();

        //calcNet();

        //calcEmpTime();

        //public void display()

}
