import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Second-level-child that extends the employee subclass as a superclass
 * takes advantage of the information for all employees
 * implements an interface course, since every instructor must have
 * a contract to administer a course
 */

public class Instructor extends Employee implements course {

    private String experience;
    private int section_num;
    private double overtime;
    private int building;
    private int officeNum;
    private Date availableTime;

    public Scanner input = new Scanner(System.in);

    public Instructor(String firstName, String middleName, String lastName, String sex, String nationality, String city,
                      String subcity, String woreda, String place_of_birth, Date date_of_birth, Date start_date, String maritalStatus,
                      String educationLevel, Double salary, String phone, String email, String experience, int section_num, double overtime,
                      int building, int officeNum, Date availableTime) {
        super(firstName, middleName, lastName, sex, nationality, city, subcity, woreda, place_of_birth, date_of_birth, start_date, maritalStatus, educationLevel, salary, phone, email);
        this.experience = experience;
        this.section_num = section_num;
        this.overtime = overtime;
        this.building = building;
        this.officeNum = officeNum;
        this.availableTime = availableTime;
    }

    public Instructor() throws ParseException {
        // to add instructor information with validation
        System.out.println("\n\n============================\n");
        super.setEmpId();
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
        String maritalStatus = input.nextLine();
        setMaritalStatus(maritalStatus);
        stringValidate(getMaritalStatus());
        System.out.print("\nEducation Level: (BSC/Msc/PhD): ");
        String educationLevel = input.nextLine();
        setEducationLevel(educationLevel);
        stringValidate(getEducationLevel());
        System.out.print("\nPhone :");
        String phone = input.nextLine();
        setEducationLevel(phone);
        phoneValidate();
        System.out.print("\nE-mail: ");
        String email = input.nextLine();
        setEmail(email);
        emailValidate();
        System.out.print("\nSalary: ");
        double salary = input.nextDouble();
        setSalary(salary);


        System.out.println("\n\n===========================\n");
    }

    public void setSalary(double salary){

    }

    public String getExperience() {
        return experience;
    }

    public int getSection_num() {
        return section_num;
    }

    public double getOvertime() {
        return overtime;
    }

    public int getBuilding() {
        return building;
    }

    public int getOfficeNum() {
        return officeNum;
    }

    public Date getAvailableTime() {
        return availableTime;
    }

    public void displayTable() {
        // to print table

    }

}
