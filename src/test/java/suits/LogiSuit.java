package suits;


import loginTests.LoginWithPageObjectTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LoginWithPageObjectTest.class
                //LoginWithPageObjectWrongLogin.class
                //LoginWithPageObjectUpperLogin.class
        }
)

public class LogiSuit {
}
