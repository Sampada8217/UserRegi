import org.junit.Assert;
import org.junit.Test;

public class UserValidation {
    @Test
    public void givenFirstName_whenIsProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validFirstName("Sampada");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_whenIsShort_shouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validFirstName("sa");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenFirstName_whenIsSmall_shouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validFirstName("sampada");
        Assert.assertEquals(false,result);

    }

    @Test
    public void givenLastName_whenIsProper_shouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = UserValidator.validLastName("Tirthkar");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenLastName_whenIsShort_shouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result= userValidator.validLastName("ti");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenLastName_whenIsSmall_shouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result =userValidator.validLastName("tirthkar");
        Assert.assertEquals(false,result);
 
    }

    @Test
    public void givenEmail_whenIsValid_shouldReturnTrue() {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validEmailId("sampada@bridgelabz.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmail_whenIsInvalid_shouldReturnFalse() {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validEmailId("sampada@yahoo");
        Assert.assertEquals(false,result);

    }

    @Test
    public void givenMobileNo_whenIsValidFormat_shouldReturnTrue() {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validMobileFormat("91 9541545454");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenMobileNo_whenIsInvalid_shouldReturnFalse() {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validMobileFormat("91 954154545");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPassWord_Rule_whenIsValid_shouldReturnTrue() {
        UserValidator userValidator=new UserValidator();
        boolean result = userValidator.validPasswordRule("SamPada@1");
        Assert.assertEquals(true,result);

    }

    @Test
    public void givenPassWord_Rule_whenIsInvalid_shouldReturnFalse() {
        UserValidator userValidator=new UserValidator();
        boolean result= userValidator.validPasswordRule("Sampadatir");
        Assert.assertEquals(false,result);
    }

}
