import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String sex;
    private String nationality;
    private String city;
    private String subcity;
    private String woreda;
    private String place_of_birth;
    private Date date_of_birth;

    // Entire constructor
    public Person(String firstName, String middleName, String lastName, String sex, String nationality, String city, String subcity, String woreda,  String place_of_birth, Date date_of_birth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.nationality = nationality;
        this.city = city;
        this.subcity = subcity;
        this.woreda = woreda;
        this.place_of_birth = place_of_birth;
        this.date_of_birth = date_of_birth;
    }

    // setter functions
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

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    // getter functions
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

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }
}
