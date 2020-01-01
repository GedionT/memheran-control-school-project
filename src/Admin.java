import java.util.Date;

public class Admin extends Employee {

    private String username;
    private String password;

    // default constructor
       public Admin(String firstName, String middleName, String lastName, String sex, String nationality, String city, String subcity, String woreda, String place_of_birth, Date date_of_birth, Date start_date, String maritalStatus, String educationLevel, Double salary, String phone, String email, String username, String password) {
        super(firstName, middleName, lastName, sex, nationality, city, subcity, woreda, place_of_birth, date_of_birth, start_date, maritalStatus, educationLevel, salary, phone, email);
        this.username = username;
        this.password = password;
    }

    // setter methods
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // getter methods
    public String getUsername() {
        return username;
    }

    // authenticate an admin
    public boolean authenticate(String username, String Password) {
         boolean flag = false;
            // search from file and authenticate using flag
        return flag;
    }

    // to create a new Admin account
    public static void main(String[] args) {


    }


}
