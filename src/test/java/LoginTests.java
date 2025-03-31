import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {

    @BeforeClass
    public void preCondition() {
        //open browser
        //open site
    }

    @Test
    public void loginSuccess() {
        //open form (find element + click)
        //fill email (find element + click + clear + type)
        //fill password (find element + click + clear + type)
        //submit form (find element + click)
    }

    @Test
    public void loginWrongEmail() {
        //open form (find element + click)
        //fill email (find element + click + clear + type)
        //fill password (find element + click + clear + type)
        //submit form (find element + click)
    }

    @Test
    public void loginWrongPassword() {
        //open form (find element + click)
        //fill email (find element + click + clear + type)
        //fill password (find element + click + clear + type)
        //submit form (find element + click)
    }

    @AfterClass
    public void postConditions() {
        //close browser
    }


}