import java.text.ParseException;
import java.util.ArrayList;
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
       setEmpId();
       System.out.print("Employment Id: " + getEmpId());
       System.out.print("\nFirst Name: ");
       firstName = input.nextLine();
       stringValidate(firstName);
       System.out.print("\nMiddle Name: ");
       middleName = input.nextLine();
       stringValidate(middleName);
       System.out.print("\nLast Name: ");
       lastName = input.nextLine();
       stringValidate(lastName);
       System.out.print("\nGender: ");
       sex = input.nextLine();
       stringValidate(sex);
       System.out.print("\nNationality: ");
       nationality = input.nextLine();
       stringValidate(nationality);
       System.out.print("\nCity: ");
       city = input.nextLine();
       stringValidate(city);
       System.out.print("\nSub-City: ");
       subcity = input.nextLine();
       stringValidate(subcity);
       System.out.print("\nWoreda: ");
       woreda = input.nextLine();
       stringValidate(woreda);
       System.out.print("\nPlace of Birth: ");
       place_of_birth = input.nextLine();
       stringValidate(place_of_birth);
       System.out.print("\nDate of Birth (DD/MM/YYYY): ");
       String DoB = input.nextLine();
       date_of_birth = new SimpleDateFormat("dd/MM/yyyy").parse(DoB);
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
       emailValidate();
       System.out.print("\nSalary: ");
       salary = input.nextDouble();
       System.out.println("\n\n===========================\n");
   }

   private static int amount = 100;
    // setters for individual information update
    private void setEmpId() {
       this.empId = "ETS" + amount;
       amount++;
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
        public String stringValidate(String param){
            param.trim();
            String next = "";
            for(int i=0; i<param.length(); i++){
                if((param.charAt(i) <= 'a' && param.charAt(i)>='z') || (param.charAt(i)<='A' && param.charAt(i) >='Z')){
                    System.out.println("Please enter a valid string pattern");
                    next = input.nextLine();
                    stringValidate(next);
                }
            }
            return next;
        }

        public void phoneValidate() {

                if (phone.length() < 10 || phone.length() > 13 || phone.length() == 11) {
                    System.out.println("The phone number you entered is invalid\n");
                    System.out.println("Please enter a valid phone number");
                    phone = input.next();
                    phoneValidate();
                }
                for (int i = 0; i < phone.length(); i++) {
                    if ((phone.charAt(i) < '0' || phone.charAt(i) > '9')&&phone.charAt(0)!='+') {
                        System.out.println("The phone number you entered contains characters other than numbers");
                        System.out.println("Please enter a valid phone number");
                        phone = input.next();
                        phoneValidate();
                        break;
                    }
                }

                if ((phone.charAt(0) == '0' && phone.charAt(1) != '9')||(phone.charAt(0) != '0' && phone.charAt(1) == '9')) {
                    System.out.println("The phone number you entered is invalid\n");
                    System.out.println("Please enter a valid phone number");
                    phone = input.next();
                    phoneValidate();
                }
                else if(phone.charAt(0)=='+'&&phone.charAt(1)!='2'&&phone.charAt(2)!='5'&&phone.charAt(3)!='1'){
                    System.out.println("The phone number you entered is invalid\n");
                    System.out.println("Please enter a valid phone number");
                    phone = input.next();
                    phoneValidate();
                }
                else if(phone.charAt(0)=='2'&&phone.charAt(1)!='5'&&phone.charAt(2)!='1'){
                    System.out.println("The phone number you entered is invalid\n");
                    System.out.println("Please enter a valid phone number");
                    phone = input.next();
                    phoneValidate();
                }
            }

        public void emailValidate() {

            int flag1 = 0,flag2 = 0; //to check whether there is "@" and "." in the email address
            for(int i=3;i<email.length();i++){
                if(email.charAt(i)=='@'&&email.charAt(email.length()-1)!='@'){
                    flag1=1;
                }
                else if(email.charAt(i)=='.'&&email.charAt(email.length()-1)!='.'){
                    flag2 = 1;
                }
            }
            if(flag1==0||flag2==0){
                System.out.println("Invalid Email Address\n");
                System.out.println("please enter a valid email address");
                email = input.next();
                input.nextLine();
                emailValidate();
            }
        }

        // calcAge();

        //calcTax();

        //calcNet();

        //calcEmpTime();

        //public void display()


    public static void main(String[] args) {
        ArrayList<Employee> users = new ArrayList<Employee>();
        Employee emp=new Employee();
        Employee emp2=new Employee();
        try {
            users.add(emp);
            emp.insert();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            users.add(emp2);
            emp2.insert();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
