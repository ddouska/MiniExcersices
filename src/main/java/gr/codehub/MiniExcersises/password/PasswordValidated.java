package gr.codehub.MiniExcersises.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidated {



    public static boolean isValidatedPasswordStringMatches(String password) {
        String regExp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        if (password.matches("^(?=.*[0-9])(\"^(?=.*\\d)(?=.*[@#$%^&+=])(?=\\S+$).{8,})"))  {
            System.out.println("Password OK");

        } else if (password.matches("^(?=.*[@#$%^&+=])(?=\\S+$).{8,}")){
            System.out.println("Strong Password");

        } else if (password.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}")){
            System.out.println("Very Strong Password");

        } else if (!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}") ){
            System.out.println("Invalid Password");
            System.out.println("Passwords must be 8-20 characters in length, contain at least one alpha character and one numeric character");
        }

        return password.matches(regExp);
    }

      //Better for big patterns
//    public static boolean isValidatedPasswordStringMatches(String password) {
//        String regExp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
//        Pattern pattern = Pattern.compile(regExp);
//        if (password == null) {
//            return false;
//        }
//        Matcher m = pattern.matcher(password);
//        System.out.println(m);
//        return m.matches();
//
//    }

    public static void main(String[] args) {

        String str1 = "DimitraEleniDouska1410@";
        System.out.println("The password is: " + isValidatedPasswordStringMatches(str1));

        //less 8 char no char
        //String str1 = "Dimi1";

        //less 8 char no number
        //String str1 = "Dimi@";

        //less 8 char no char and no upper case
        //String str1 = "dimi1";

        //less 8 char no number no lower case
        //String str1 = "DIMI@";

        //number and char and less 8 char
        // String str1 = "123@";

        //number and one upper, no included char and less 8 char
        // String str1 = "123D";

        //number and one lower, no included char and less 8 char
        // String str1 = "123d";

        //only lower case
        // String str1 = "dimi";

        //only upper case
        // String str1 = "DIMI";

        //only included char
        // String str1 = "!@#$%";

        //only digits
        // String str1 = "12345";


    }
}
