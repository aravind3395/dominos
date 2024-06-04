package Runner_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Cape-ElecTric\\IdeaProjects\\dominos\\src\\test\\java\\cucumber\\feature",
            glue ="Step_file" )
public class run {
public static WebDriver driver;

@BeforeClass
public static void start(){
driver= new ChromeDriver();
}

//@AfterClass
//    public static void end(){
//    driver.quit();
//}
}

