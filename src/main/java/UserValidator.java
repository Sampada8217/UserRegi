public class UserValidator {



    public boolean validFirstName(String fname) {
    String patternFirstName ="[A-Z]{1}[a-z]{3,}";
    if(fname.matches(patternFirstName))
    {
        return true;
    }
    else
    {
        return false;
    }

    }
    public static boolean validLastName(String lname) {
        String patternLastName="[A-Z]{1}[a-z]{3,}";
        if(lname.matches(patternLastName))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public boolean validEmailId(String email) {
        String patternEmail="[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})";
        if(email.matches(patternEmail))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean validMobileFormat(String mobile) {

        String patternMobileNumber="[1-9]{2} [0-9]{10}";
        if(mobile.matches(patternMobileNumber))
        {
          return true;
        }
        else
        {
            return false;
        }


    }
}
