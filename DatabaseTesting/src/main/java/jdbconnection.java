import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;

public class jdbconnection {
    public static void main(String[] args) throws SQLException {
        //connection url -> "jdbc://" + host + ":" + port + "/databasename"
        //"jdbc://" + localhost + ":" + 3306(este default) + "/demo"
        String host = "localhost";
        String port = "3306";
        Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root", "Mysql1234");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from credentials where scenario = 'zerobalancecard'");
        while (rs.next()) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/login");
            driver.findElement(By.cssSelector("#userName")).sendKeys(rs.getString("username"));
            driver.findElement(By.cssSelector("#password")).sendKeys(rs.getString("password"));

        }

    }
}
