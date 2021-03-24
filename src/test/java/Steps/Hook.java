package Steps;

import Base.BaseUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtils {

    private BaseUtils base;

    public Hook(BaseUtils baseutils) {
        this.base = baseutils;
    }

    @Before
    public void InitializeTest(Scenario scenario) {

        System.out.println("Opening the browser: Chrome");
        System.setProperty("webdriver.chrome.driver", "D:\\TestAutomation\\chromedriver_win32\\chromedriver.exe");
        base.Driver = new ChromeDriver();
    }

    @After
    public void TeardownTest() {

        System.out.println("Close the Test");
        base.Driver.quit();
    }
}
