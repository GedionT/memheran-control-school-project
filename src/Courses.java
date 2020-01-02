import java.util.Scanner;


/*
 * Am independent class to add new courses in the course management system by the admin
 * later on used by instructor using an interface to make a contract to teach a course
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
            this.course_name = input.nextLine();
            stringValidate(course_name);
            System.out.print("Course Code: ");
            this.course_code = input.nextLine();
            stringValidate(course_code);
            System.out.print("Credit Hour: ");
            this.credit_hour = input.nextInt();
            System.out.print("Lecture hours: ");
            this.lecture_hour  = input.nextInt();
            System.out.print("Tutorial hours: ");
            this.tutorial_hour = input.nextInt();
            System.out.print("Lab hour: ");
            this.lab_hour = input.nextInt();
            System.out.print("Category ( Compulsory, Optional, .. ): ");
            this.category = input.next();
            stringValidate(category);
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
}