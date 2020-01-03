import java.util.Date;

/*
 * First-level-child that extends the person superclass
 * Both Admins and Instructors have intersecting data from this class.
 * It is the core class that every role inherits to get access privilege and storgae
 *
*/

public abstract class Employee extends Person implements validator{

    // Declaring the types of data all employee's have registered upon employment
       private String empId;
       private Date start_date;
       private String maritalStatus;
       private String educationLevel;
       private Double salary;
       private String phone;
       private String email;


       // optional and not for use
       Employee(String firstName, String middleName, String lastName, String sex, String nationality, String city, String subcity, int woreda, String place_of_birth, Date date_of_birth, Date start_date, String maritalStatus, String educationLevel, Double salary, String phone, String email) {
        super(firstName, middleName, lastName, sex, nationality, city, subcity, woreda, place_of_birth, date_of_birth);
        setEmpId();
        this.start_date = start_date;
        this.maritalStatus = maritalStatus;
        this.educationLevel = educationLevel;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }


    Employee() { // optional param empty constructor for future inheritance
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

        // Calculate age using present_date - date_of_birth
        public int calcAge() {

            return 0;
        };

        // Calculate employment time using present_date - emp_date
        public void calcEmpTime() {

        };

        // Calculate Net Salary after taxation
        public double calcNet() {
            if(salary >= 10000)    salary = salary*0.65;
            else if(salary>=7000)  salary = salary*0.75;
            else if(salary>=4000)  salary = salary*0.85;
            else if(salary>=2000)  salary = salary*0.95;

            return salary;
        };

}
