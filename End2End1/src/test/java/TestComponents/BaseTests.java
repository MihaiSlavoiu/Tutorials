package TestComponents;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.example.LandingPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class BaseTests {
    public WebDriver driver;
    public LandingPage landingPage;
    public WebDriver initializerDriver() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\GlobalData.properties");
        properties.load(fileInputStream);
        String browserName = properties.getProperty("browser");

        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {
            //firefox
        } else if (browserName.equals("edge")) {
            WebDriver driver = new EdgeDriver();

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }

    @BeforeMethod(alwaysRun = true)
    public LandingPage launchApplication() throws IOException {
        driver = initializerDriver();
         landingPage = new LandingPage(driver);
        landingPage.goTo();
        return landingPage;
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.close();
    }

    public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException {
        //read json to string
        String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

        //String to HashMap -> JacksonDatabind
        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String,String>>>() {
        });
        return data;
        //{map,map}
    }
    public String getScreenshot(String testCaseName,WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir")+"\\reports\\" + testCaseName + ".png");
        FileUtils.copyFile(source, dest);
        return System.getProperty("user.dir")+"\\reports\\" + testCaseName + ".png";
    }
}
