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
}
