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

    private int experience;
    private int sections;
    private double overtime;
    private int building;
    private int officeNum;
    private String availableTime;

    private Scanner input = new Scanner(System.in);

    public Instructor(String firstName, String middleName, String lastName, String sex, String nationality, String city,
                      String subcity, int woreda, String place_of_birth, Date date_of_birth, Date start_date, String maritalStatus,
                      String educationLevel, Double salary, String phone, String email, int experience, int sections, double overtime,
                      int building, int officeNum, String availableTime) {

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
        System.out.print("Sub-City");
        setSubcity(stringValidate(input.nextLine()));
        System.out.print("Woreda: ");
        setWoreda(input.nextInt());
        System.out.println();
        System.out.println("Place of Birth: ");
        setPlace_of_birth(stringValidate(input.nextLine()));
        System.out.print("Date of Birth (DD/MM/YYYY): ");
        String DoB=input.nextLine();
        try{
            setDate_of_birth(new SimpleDateFormat("dd/MM/yyyy").parse(DoB));
        } catch (Exception e) {
            System.out.print("Error : " + e);
        }
        System.out.print("Marital Status (Married, Single, Engaged, ..): ");
        setMaritalStatus(stringValidate(input.nextLine()));
        System.out.print("Education Level: (BSC/Msc/PhD): ");
        setEducationLevel(stringValidate(input.nextLine()));
        System.out.print("Phone :");
        setPhone(phoneValidate(input.nextLine()));
        System.out.print("E-mail: ");
        setEmail(emailValidate(input.nextLine()));
        System.out.print("Salary: ");
        double salary = input.nextDouble();
        setSalary(salary);
        input.nextLine();
        System.out.println(" ---------------------- ");
        System.out.print("Previous Experience Time (in years) : ");
        experience = input.nextInt();
        System.out.print("Number of Sections: ");
        sections = input.nextInt();
        System.out.print("Overtime hours per month: ");
        overtime = input.nextDouble();
        System.out.print("Office Building Number: ");
        building = input.nextInt();
        System.out.print("Office Room Number: ");
        officeNum = input.nextInt();
        System.out.print("Available as advisory on: ");
        availableTime = input.nextLine();
        System.out.println("\n\n===========================\n");
    }


    public double calcNet() {
        // Runtime Polymorphism [Overriding implemented here]
        // assuming the instructor gets paid 450 per overtime hour
        double ot = getOvertime() * 450;
        double sal = getSalary();

        // calc salary after taxation
        if(sal >= 10000)    sal = sal*0.65;
        else if(sal>=7000)  sal = sal*0.75;
        else if(sal>=4000)  sal = sal*0.85;
        else if(sal>=2000)  sal = sal*0.95;

        return ot + sal; // net salary
    }

    public int getExperience() {
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

    public String getAvailableTime() { return availableTime;  }

    public void display() {
        // to print table
        System.out.println("\n"+ getFirstName() + "  " + getMiddleName() + "  " + getLastName() + "  " + getSex() + "  " +
                getNationality() + "  " + getCity() + "  " + getSubcity() + "  " + getWoreda() + "  " + getPlace_of_birth()
                + "  " + getDate_of_birth() + "  " + getStart_date() + "  " + getMaritalStatus() + "  " + getEducationLevel()
                + "  " + getSalary() + "  " + calcNet() + "  " + getPhone() + "  " + getEmail() + "  " + getExperience() + "  " + getSections()
                + "  " + getBuilding() + "  " + getOfficeNum()  + "  " + getAvailableTime() );
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

}
