package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

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
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com/pdf_to_jpg");
        driver.findElement(By.cssSelector("#pickfiles")).click();
        Thread.sleep(3000);
        //call the exe file
        Runtime.getRuntime().exec("F:\\Descarcari\\fileupload.exe");
    }
}
