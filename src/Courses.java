import java.util.Scanner;


/*
 * An independent class to add new courses in the course management system by the admin
 * later on used by admin to link an instructor with a course.
 * Note: Several inputs are validated using the validator interface to reduce mistakes
 *
 */

public class Courses implements validator {

        private Scanner input = new Scanner(System.in);

    private String term;
    private String department;
    private String course_name;
    private String course_code;
    private int credit_hour;
    private int lecture_hour;
    private int tutorial_hour;
    private int lab_hour;
    private String category;


        public Courses() {

            System.out.println("\n\n\t ==================\n");
            System.out.println("\t Add a Course \n");
            System.out.println("\t ==================\n");
            System.out.print("Course Name: ");
            setCourse_name(input.nextLine());
            System.out.print("Course Code: ");
            setCourse_code(input.next());
            System.out.print("Department: ");
            setDepartment(input.next());
            System.out.print("Credit Hour: ");
            setCredit_hour(input.nextInt());
            System.out.print("Lecture hours: ");
            setLecture_hour(input.nextInt());
            System.out.print("Tutorial hours: ");
            setTutorial_hour(input.nextInt());
            System.out.print("Lab hour: ");
            setLab_hour(input.nextInt());
            System.out.print("Category ( Compulsory, Optional, .. ): ");
            setCategory(input.nextLine());
            System.out.println("=====================");
        }

        // setters
    public void setInput(Scanner input) {
        this.input = input;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public void setCredit_hour(int credit_hour) {
        this.credit_hour = credit_hour;
    }

    public void setLecture_hour(int lecture_hour) {
        this.lecture_hour = lecture_hour;
    }

    public void setTutorial_hour(int tutorial_hour) {
        this.tutorial_hour = tutorial_hour;
    }

    public void setLab_hour(int lab_hour) {
        this.lab_hour = lab_hour;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    // getters

    public Scanner getInput() {
        return input;
    }

    public String getTerm() {
        return term;
    }

    public String getDepartment() {
        return department;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getCourse_code() {
        return course_code;
    }

    public int getCredit_hour() {
        return credit_hour;
    }

    public int getLecture_hour() {
        return lecture_hour;
    }

    public int getTutorial_hour() {
        return tutorial_hour;
    }

    public int getLab_hour() {
        return lab_hour;
    }

    public String getCategory() {
        return category;
    }

    public void display() {
            System.out.println(getCourse_code() + "\t\t\t " + getCourse_name() + "\t\t "
            + getDepartment() + "\t\t " + getCredit_hour() + "\t\t\t " + getLecture_hour()
                    + "\t\t\t " +  getLab_hour() + "\t\t " + getCategory());
    }
}
