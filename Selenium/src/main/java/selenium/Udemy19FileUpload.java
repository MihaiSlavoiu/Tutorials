package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class Udemy19FileUpload {
    //how to upload file using AutoIt

    //shift focus t the file upload windows
    //Set text/path into file name edit box
    //click open to upload file

    //te duci in fisierul C:\Program Files (x86)\AutoIt3\SciTE si deschizi execul cu care poti sa iei elementele din fereastra

    //apoi scrii scriptul asta in "C:\Program Files (x86)\AutoIt3\Au3Info_x64.exe"
//        ControlFocus("Open","","Edit1")
//        ControlSetText("Open","","Edit1","F:\Descarcari\Document+1.pdf")
//        ControlClick("Open","","Button1")
    //salvezi scriptul si apoi te duci pe el si dai click dreapta si dai Compile Script(x86)
    //apoi prin selenium invoci exe ul creat
    public static void main(String[] args) throws IOException, InterruptedException {
        String downloadPath=System.getProperty("user.dir");
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

        chromePrefs.put("profile.default_content_settings.popups", 0);

        chromePrefs.put("download.default_directory", downloadPath);

        WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", chromePrefs);

        driver.get("https://www.ilovepdf.com/pdf_to_jpg");
        driver.findElement(By.cssSelector("#pickfiles")).click();
        Thread.sleep(3000);
        //call the exe file
        Runtime.getRuntime().exec("F:\\Descarcari\\fileupload.exe");

        //downloading the file
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTaskTextBtn")));
        driver.findElement(By.cssSelector("#processTaskTextBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pickfiles")));
        driver.findElement(By.cssSelector("#pickfiles")).click();
        Thread.sleep(3000);
        //verify if the file is downloaded
        File f = new File(downloadPath + "\\ilovepdf_pages-to-jpg.zip");
        if(f.exists()){
            System.out.println("File found");
        }else{
            System.out.println("nuuuu");
        }


    }
}
