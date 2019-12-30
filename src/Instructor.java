import course.course;

import java.util.Date;

public class Instructor extends Employee implements course {

    private String experience;
    private int section_num;
    private double overtime;
    private int building;
    private int officeNum;
    private Date availableTime;


   // build an entire information constructor from inherited class
    public Instructor(String empId, String firstName, String middleName, String lastName, String sex, String nationality, String city, String subcity, String woreda, int kebele, String place_of_birth, Date date_of_birth, Date start_date, String maritalStatus, String educationLevel, double salary, String phone, String email, String experience, int section_num, double overtime, int building, int officeNum, Date availableTime) {
        super(empId, firstName, middleName, lastName, sex, nationality, city, subcity, woreda, kebele, place_of_birth, date_of_birth, start_date, maritalStatus, educationLevel, salary, phone, email);
        this.experience = experience;
        this.section_num = section_num;
        this.overtime = overtime;
        this.building = building;
        this.officeNum = officeNum;
        this.availableTime = availableTime;
    }
}
