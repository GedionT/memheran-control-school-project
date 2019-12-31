import java.util.Date;

public interface course {
    default void status() {
        String term;
        Date year;
        String department;
        String course_name;
        String course_code;
        int credit_hour;
        int lecture_hour;
        int tutorial_hour;
        int lab_hour;
        String category;

    }
}
