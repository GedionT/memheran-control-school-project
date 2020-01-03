import java.util.Scanner;

public interface validator {

    Scanner input = new Scanner(System.in);

    /*
     * to validate strings sequences
     * strings can't contain numbers and other special
     * characters. a regEx equivalent would be (A-Z || a-z) only.
     *
     */

     default String stringValidate(String param){
         int counter = 0;
        String next = "";
        for(int i=0; i<param.length(); i++){

            if(Character.isLetter(param.charAt(i))) {
                counter++;
            }
        }

        if(counter == param.length()) return param;
        else
        {
            System.out.println("Please Enter an alphabetic string");
            next = input.nextLine();
            return stringValidate(next);
        }
    }

    /*
     * to validate phone number that is only cell-phone
     * can't contain other letter or character sequence other than '+' symbol
     * length of phone number string can't be less than 10 or greater than 13
     * length of phone number can't be 11 characters long
     * phone sequence must always start with a 0 followed by a 9
     *
     */

    default String phoneValidate(String phone) {

        if (phone.length() < 10 || phone.length() > 13 || phone.length() == 11) {
            System.out.println("The phone number you entered is invalid\n");
            System.out.println("Please enter a valid phone number");
            phone = input.next();
            return phoneValidate(phone);
        }
        for (int i = 0; i < phone.length(); i++) {
            if ((phone.charAt(i) < '0' || phone.charAt(i) > '9')&&phone.charAt(0)!='+') {
                System.out.println("The phone number you entered contains characters other than numbers");
                System.out.println("Please enter a valid phone number");
                phone = input.next();
                return phoneValidate(phone);
//                break;
            }
        }

        if ((phone.charAt(0) == '0' && phone.charAt(1) != '9')||(phone.charAt(0) != '0' && phone.charAt(1) == '9')) {
            System.out.println("The phone number you entered is invalid\n");
            System.out.println("Please enter a valid phone number");
            phone = input.next();
            return phoneValidate(phone);
        }
        else if(phone.charAt(0)=='+'&&phone.charAt(1)!='2'&&phone.charAt(2)!='5'&&phone.charAt(3)!='1'){
            System.out.println("The phone number you entered is invalid\n");
            System.out.println("Please enter a valid phone number");
            phone = input.next();
            return phoneValidate(phone);
        }
        else if(phone.charAt(0)=='2'&&phone.charAt(1)!='5'&&phone.charAt(2)!='1'){
            System.out.println("The phone number you entered is invalid\n");
            System.out.println("Please enter a valid phone number");
            phone = input.next();
            return phoneValidate(phone);
        }
        return phone;
    }

    /*
     * to validate email strings
     * email must contain @ in the character sequence
     * and a . as well but not at the end of the string
     * Then calls recursively on mismatch
     *
     */

    default String emailValidate(String email) {

        int flag1 = 0, flag2 = 0; //to check whether there is "@" and "." in the email address
        for (int i = 3; i < email.length(); i++) {
            if (email.charAt(i) == '@' && email.charAt(email.length() - 1) != '@') {
                flag1 = 1;
            } else if (email.charAt(i) == '.' && email.charAt(email.length() - 1) != '.') {
                flag2 = 1;
            }
        }

        if (flag1 == 0 || flag2 == 0) {
            System.out.println("Invalid Email Address\n");
            System.out.println("please enter a valid email address");
            email = input.next();
            input.nextLine();
            return emailValidate(email);
        }
        return email;
    }

}
