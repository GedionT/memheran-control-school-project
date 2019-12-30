public class Employee {

    // Declaring the types of data all employee's have registered upon employment
       private String empId;
       private String firstName;
       private String middleName;
       private String lastName;
       private String sex;
       private String nationality;
       private String city;
       private String Subcity;
       private String Woreda;
       private int kebele;
       private String place_of_birth;
       private Date date_of_birth;
       private Date start_date;
       private String maritalStatus;
       private String educationLevel;
       private double salary;
       private String phone;
       private String email;


    // Constructor for employee class


    public Employee(String empId, String firstName, String middleName, String lastName, String sex, String nationality, String city, String subcity, String woreda, int kebele, String place_of_birth, Date date_of_birth, Date start_date, String maritalStatus, String educationLevel, double salary, String phone, String email) {
        this.empId = empId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.nationality = nationality;
        this.city = city;
        Subcity = subcity;
        Woreda = woreda;
        this.kebele = kebele;
        this.place_of_birth = place_of_birth;
        this.date_of_birth = date_of_birth;
        this.start_date = start_date;
        this.maritalStatus = maritalStatus;
        this.educationLevel = educationLevel;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    // setters for individual information update


    public void setEmpId(String empId) {
        this.empId = empId;
    }

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
        Subcity = subcity;
    }

    public void setWoreda(String woreda) {
        Woreda = woreda;
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
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // getters for employee's data
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
        return Subcity;
    }

    public String getWoreda() {
        return Woreda;
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
        //calcAge();

        //calcTax();

        //calcEmpTime(); // to calculate duration of employment

}
