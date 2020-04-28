public class UserValidator {



    public boolean validFirstName(String fname) {
    String pattern ="[A-Z]{1}[a-z]{3,}";
    if(fname.matches(pattern))
    {
        return true;
    }
    else
    {
        return false;
    }

    }
    public static boolean validLastName(String lname) {
        String pattern="[A-Z]{1}[a-z]{3,}";
        if(lname.matches(pattern))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
