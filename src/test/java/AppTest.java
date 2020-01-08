import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppTest {

//    @BeforeTest
//    public void

    @Test
    public void test() throws MalformedURLException {
        SetUp.Android_LaunchApp();
    }


//    @AfterTest
//    public void TearDown(){
//        SetUp.CloseApp();
//    }



}
