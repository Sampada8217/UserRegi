import org.junit.Assert;
import org.junit.Test;

public class UserValidation {
    @Test
    public void FirstName_isProper_True() {
        UserValidator userValidator = new UserValidator();
       boolean result = userValidator.validFirstName("Sampada");
        Assert.assertEquals(true,result);
    }

    @Test
    public void FirstName_isShort_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validFirstName("sa");
        Assert.assertEquals(true,result);
    }

    @Test
    public void FirstName_isSmall_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validFirstName("sampada");
        Assert.assertEquals(true,result);

    }

    @Test
    public void LastName_isProper_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = UserValidator.validLastName("Tirthkar");
        Assert.assertEquals(true,result);
    }

    @Test
    public void LastName_isShort_False() {
        UserValidator userValidator = new UserValidator();
        boolean result= userValidator.validLastName("ti");
        Assert.assertEquals(true,result);
    }

    @Test
    public void LastName_isSmall_False() {
        UserValidator userValidator = new UserValidator();
        boolean result =userValidator.validLastName("tirthkar");
        Assert.assertEquals(true,result);

    }
    
}
