import java.util.Date;

/*
 * Super-class that is the base for Admins, Employees, and Instructors
 * Contains the intersecting data the roles can contain.
 */

abstract class Person {
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

    // Entire constructor for superclass
    Person(String firstName, String middleName, String lastName, String sex, String nationality, String city, String subcity, String woreda, String place_of_birth, Date date_of_birth) {
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

    Person() { // void constructor for inheritance
    }

    // setter functions
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    void setNationality(String nationality) {
        this.nationality = nationality;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setSubcity(String subcity) {
        this.subcity = subcity;
    }

    void setWoreda(String woreda) {
        this.woreda = woreda;
    }

    void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    // getter functions
    String getFirstName() {
        return firstName;
    }

    String getMiddleName() {
        return middleName;
    }

    String getLastName() {
        return lastName;
    }

    String getSex() {
        return sex;
    }

    String getNationality() {
        return nationality;
    }

    String getCity() {
        return city;
    }

    String getSubcity() {
        return subcity;
    }

    String getWoreda() {
        return woreda;
    }

    String getPlace_of_birth() {
        return place_of_birth;
    }

    Date getDate_of_birth() {
        return date_of_birth;
    }
}
