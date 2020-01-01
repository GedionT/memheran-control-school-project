import javax.print.DocFlavor;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Employee extends Person {

    // Declaring the types of data all employee's have registered upon employment
       private String empId;
       private Date start_date;
       private String maritalStatus;
       private String educationLevel;
       private double salary;
       private String phone;
       private String email;


       private Scanner input = new Scanner(System.in);

       // optional and not for use
    public Employee(String firstName, String middleName, String lastName, String sex, String nationality, String city, String subcity, String woreda, String place_of_birth, Date date_of_birth, Date start_date, String maritalStatus, String educationLevel, Double salary, String phone, String email) {
        super(firstName, middleName, lastName, sex, nationality, city, subcity, woreda, place_of_birth, date_of_birth);
        setEmpId();
        this.start_date = start_date;
        this.maritalStatus = maritalStatus;
        this.educationLevel = educationLevel;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }


    public void insert() throws ParseException {
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
       emailValidate();
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
        phoneValidate();
    }

    public void setEmail(String email) {
        this.email = email;
        emailValidate();
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
}
