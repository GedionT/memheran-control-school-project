import java.util.Date;

public class Instructor extends Employee implements course {

    private String experience;
    private int section_num;
    private double overtime;
    private int building;
    private int officeNum;
    private Date availableTime;


    public Instructor(String firstName, String middleName, String lastName, String sex, String nationality, String city, String subcity, String woreda, String place_of_birth, Date date_of_birth) {
        super(firstName, middleName, lastName, sex, nationality, city, subcity, woreda, place_of_birth, date_of_birth);
    }
}
