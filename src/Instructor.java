import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Second-level-child that extends the employee subclass as a superclass
 * takes advantage of the information for all employees
 * implements an interface course, since every instructor must have
 * a contract to administer a course
 *  Note: Several inputs are validated using the validator interface to reduce mistakes
 *
 */

public class Instructor extends Employee implements validator{

    private String experience;
    private int sections;
    private double overtime;
    private int building;
    private int officeNum;
    private Date availableTime;

    public Scanner input = new Scanner(System.in);

    public Instructor(String firstName, String middleName, String lastName, String sex, String nationality, String city,
                      String subcity, int woreda, String place_of_birth, Date date_of_birth, Date start_date, String maritalStatus,
                      String educationLevel, Double salary, String phone, String email, String experience, int sections, double overtime,
                      int building, int officeNum, Date availableTime) {

        super(firstName, middleName, lastName, sex, nationality, city, subcity, woreda, place_of_birth, date_of_birth,
                start_date, maritalStatus, educationLevel, salary, phone, email);
        this.experience = experience;
        this.sections = sections;
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



        System.out.println("\n\n===========================\n");
    }

    public void setSalary(double salary){
        // Runtime Polymorphism [Overriding implemented here]

    }

    public String getExperience() {
        return experience;
    }

    public int getSections() {
        return sections;
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

    public Date getAvailableTime() { return availableTime;  }

    public void display() {
        // to print table
        System.out.println("\n"+ getFirstName() + "  " + getMiddleName() + "  " + getLastName() + "  " + getSex() + "  " +
                getNationality() + "  " + getCity() + "  " + getSubcity() + "  " + getWoreda() + "  " + getPlace_of_birth()
                + "  " + getDate_of_birth() + "  " + getStart_date() + "  " + getMaritalStatus() + "  " + getEducationLevel()
                + "  " + getSalary() + "  " + getPhone() + "  " + getEmail() + "  " + getExperience() + "  " + getSections()
                + "  " + getBuilding() + "  " + getOfficeNum()  + "  " + getAvailableTime() );
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

}
