package runners;


import configuration.DriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import java.net.MalformedURLException;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumberHtmlReport"},   dryRun = true,
        features = "src/test/resources/features",
        glue = "steps",
        tags = {"~@ignore","@soma, @divisao"}
)

public class AndroidTest {
    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DriverFactory.createDriverByParameter("Android");
    }

    @AfterClass
    public static void tearDown(){
        DriverFactory.quitDriver();
    }
}
