package automatizare.mihai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//public class Chrome {
    //public static void main(String[] args){

           /* //Pentru Chrome
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Camelia Slavoiu\\Downloads\\chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.get("https://www.google.com/");
            System.out.println(driver.getTitle());//returneaza titlul siteului, verifici daca titlul e corect*/
            /*
            //Pentru Firefox
            //System.setProperty("webdriver.gecko.driver","C:\\Users\\Camelia Slavoiu\\Downloads\\geckodriver.exe");
            WebDriver driver1= new FirefoxDriver();
            driver1.get("https://www.google.com/");
            System.out.println(driver1.getTitle());//returneaza titlul siteului, verifici daca titlul e corect*/
            /*
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Camelia Slavoiu\\Downloads\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            //System.out.println(driver.getTitle());//returneaza titlul siteului, verifici daca titlul e corect*/
    //System.out.println(driver.getCurrentUrl());//returneaza url ul pe care ai intrat, verifici ca ai ajuns unde trebuie
    //System.out.println(driver.getPageSource());//returneaza pagina sursa/*
            /*
            driver.navigate().back();//te trimite la dinainte, da back;
            driver.navigate().forward();//te trimite la pagina de dupa;
            driver.close();//inchide browserul curent inchide de ex fila nr 3
            driver.quit();//inchide toate browsere deschide de selenium */
            /*
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Camelia Slavoiu\\Downloads\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://login.salesforce.com/");//url din brower
            driver.findElement(By.id("username")).sendKeys("Mihai");//gaseste elementul din id si cu sendKeys trimite ce sa scrie
            driver.findElement(By.name("pw")).sendKeys("parola");//gaseste elementul din name si cu sendKeys trimite ce sa scrie//gaseste elementul cu linktect , in paranteze trebuie sa scrii linkul textului pe care vrei sa il apelezi dupa care dai clcik pe el
            driver.findElement(By.linkText("Forgot Your Password?")).click();ei sa il apelezi dupa care dai clcik pe el
            */
    // System.setProperty("webdriver.chrome.driver","F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
    // WebDriver driver = new ChromeDriver();
    //driver.get("https://login.salesforce.com/");//url din brower
    //driver.findElement(By.id("username")).sendKeys("Miha");
    //driver.findElement(By.name("pw")).sendKeys("1234");
    //driver.findElement(By.className("button r4 wide primary")).click();//o sa dea eraore pentru ca nu poti s apui cu spatii
    //driver.findElement(By.className("inputtext")).sendKeys("aaaa"); //mereu o sa puna pe prima celula pe care o gaseste cu clasa inputtext, daca ai mai multe, merue o sa puna pe prima
    //driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();//gaseste elementul din xpath si da click
    // driver.findElement((By.cssSelector("#username"))).sendKeys("aaaaa");//gaseste elementul din css si da click
    //driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("q");//gasete elementul cu xpath si scrie parola q

    //17.11.2022 - DE VERIFICAT

    //daca un xpath incepe cu html nu e ok
    //driver.findElement(By xpath("//*[@id="forgot_password_link"]").click();
    //chrome nu are css, trebuie sa l iei din footer
    //pentru a verifica !!!xpath!!! te duci in consola din inspect element si pui in fata $x !!!!! exemplu $x("//*[@id="forgot_password_link"]") trebuie sa inlocuiesti " cu ' !!!
    //pentru a verifica !!!css!!! te duci in consola din inspect element si pui in fata $ !!!!! exemplu $("#mydomainLink")  trebuie sa inlocuiesti " cu ' !!! - nu pui x
    //$x("") - pentru xpath
    //$("") - pt css
    //e ok sa verifici inainte in broswe daca e ok xpathul sau css ca sa fii sigur ca merge
    //System.out.println(driver.findElement(By cssSelector("div#error.loginError")).getTxt());//iti arata in consola intellij mesajul respectiv de ex: Please check your username and password. If you still can't log in, contact your Salesforce administrator.

			/* PENTRU XPATH
			<input class="button r4 wide primary" type="submit" id="Login" name="Login" value="Log In">
			input - TagName
			Attributes - type, id, name (cele din stanga)
			Value - submit, Login, Log In (cele din dreapta egalului)
			!!! sintaxa pentru xpath este

			//tagName[@attribute='value']  //input[@id = 'Login'] ---

			pentru a verifica pui in consola din chrome $x("//input[@id ='Login']")
			!! sintaxa se mai poate scrie fara a scrie tagNameul, pui in loc de tagName * exemplu

			//*[@id = 'Login']

			- aici imi cauta orice tagName care are @id = 'Login' daca vrei sa fie mai specific pui si tagName ul, pentru noi input

			CUM FACI DACA AI UN SINGUR ATRIBUT CARE ISI SCHIMBA MEREU VALOAREA sau daca ai un atribut foarte lung de exemplu input name="username123", dai refresh si dupa o sa fie username234
			FOLOSESTI REGULAR EXPRESSION CONCEPT - identifici ce e constant(in ex de mai sus e username) folosesti sintaxa //tagName[contains(@attribute,'value')] EXEMPLU //input[contains(@name,'username')]

			//EXEMPLU MAI JOS */
    // driver.findElement(By.xpath("//*[@id='username']")).sendKeys("aaaa");
    //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("bbb");
    // driver.findElement(By.xpath("//input[@id='Login']")).click();


			/* PENTRU CSS
			<input class="button r4 wide primary" type="submit" id="Login" name="Login" value="Log In">
			input - TagName
			Attributes - type, id, name (cele din stanga)
			Value - submit, Login, Log In (cele din dreapta egalului)
			!! sintaxa pentru css este

			tagName[attribute='value']  input[id = 'Login']

			---pentru a verifica pui in consola din chrome $("input[id ='Login']")
			!!sintaxa se mai poate scrie

			tagName#id (daca ai id) exemplu input#Login(l am luat de pe atributul type)

			- pentru a verifica scrii in consola de la chrome $("input#Login") - se foloseste doar daca ai id
			!!sintaxa se mai poate scrie

			tagName.classname EXEMPLU input.button r4 wide primary , DAR POTI FOLOSI DOAR DACA ARE UN SINGUR CUVANT CA SI VALOARE exemplu input.username
			!! se mai poate scrie si

			#id EXEMPLU PENTRU MAI SUS #Login

			CUM FACI DACA AI UN SINGUR ATRIBUT CARE ISI SCHIMBA MEREU VALOAREA sau daca ai un atribut foarte lung de exemplu input name="username123", dai refresh si dupa o sa fie username234
			FOLOSESTI REGULAR EXPRESSION CONCEPT - identifici ce e constant(in ex de mai sus e username) folosesti sintaxa tagName[Attribute*='value'] EXEMPLU input[name*='username']

			//EXEMPLU MAI JOS */
    // driver.findElement(By.cssSelector("input[name='Login']")).sendKeys("aaaa");
    // driver.findElement(By.cssSelector("input[id='password']")).sendKeys("bbbb");
    // driver.findElement(By.cssSelector("input[id = 'Log In']")).click();
/*
        //EXEMPLU PENTRU XPATH SI CSS -  DE PE REDIFF.COM
       driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
       driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("aaaaa");
       driver.findElement(By.cssSelector("input#password")).sendKeys("bbbb");
       driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();//chiar daca am scris doar procee - pentru ca am folosit regular expression a stiut unde sa dea click*/

    //PARENT - CHILD - RELATIONSHIP
    // define xpath for parent and traverse to child
    //driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/div/div/input");
/*
        CARE E DIFERENTA DINTRE RELATIVE SI ABSOLUTE XPATH?
        RELATIVE-nu depinde de parents nodes - ACESTA E PREFERABIL PENTRU CA IN CAZUL IN CARE DEV MODIFICA CEVA, NU MAI PAOTE FI ACCESAT, DAR DACA II SPUI EXACT CE SA APELEZE, O SA APELEZE CE TREBUIE
        ABSOLUTE-depinde de parent-child relationship - ajugi la el prin /div/div/...

        HOW TO TRAVERSE TO SIBLINGS ELEMENT USING XPATH:(ADICA CUM SA TE MUTI LA AL DOILEA ELEMNT DACA NU AI CHILD)
        se foloseste sintaxa /following-sibling::li[2]
        ex: //*[@id='tablist1-tab1']/following-sibling::li[2] folder 7 clip 5 min6

        SAUM TRAVERSEZI DE LA CHILD LA PARINTE:
        se foloseste sintaxa /parent:: - exemplu //*[@id='tablist1-tab1']/parent::ul

        !!!!! POTI TRVERSA DE LA CHILD LA PARENT DOAR IN XPATH - NU MERGE IN CSS - ASTA E DIFERENTA MAJORA!!!!!! IN CSS NU POTI TRAVERSA INAPOI!!!!


 */
    //IDENTIFICARE OBIECTELOR CU AJUTORUL TEXTULUI
    //CUM SE CREAZA UN XPATH DOAR CU TEXTUL VIZIBIL
    //se foloseste sintaxa    //*[text()='copiezi textul aici'] - trebuie sa ai grija sa pui spatiile din text inclusiv inainte si dupa, altfel nu merge - nu trebuie sa o folosesti des, nu e foarte de incredere

    /* CSS selectors locator*/
    // driver.findElement(By.cssSelector("[id='username']")).sendKeys("Mihai");
    //driver.findElement(By.cssSelector("input[id='password']")).sendKeys("a");
    //sau
    //driver.findElement(By.cssSelector("#password")).sendKeys("a");

/*
        //STATIC DROPDOWN
        public class delazero {
            public static void main (String[] args){
                System.setProperty("webdriver.chrome.driver","F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        Select s=new Select(driver.findElement(By.id("dropdown-class-example"))); //La Select trebuie sa pui in paranteza locatia unde sa caute(By.cssSelector...sau By,id...)
        //poti alege optiunile astea doar daca ai tagName select
        s.selectByValue("option3");
        s.selectByIndex(2);
        s.selectByVisibleText("Option1");
            }
        }

*/



    // }


//18.11.2022

//STATIC DROPDOWN CU + SI -
/*public class Main
{
	/*  public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.veltravel.ro/");
            Thread.sleep(2000l);
            driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
            driver.findElement(By.cssSelector("[id='dropdownRoomGuests']")).click();
            Thread.sleep(2000L);//incetineste procesul cu 2 secunde
            driver.findElement(By.cssSelector("[onclick='addAdult(1, event)']")).click();
        //daca vrei sa apesi buroul acela de mai multe ori:
        //Se poate scrie in loop:
            /*for(int i=1;i<5;i++){
            driver.findElement(By.cssSelector("[onclick='addAdult(1, event)']")).click();
        }*/
//SAU SE MAI POATE FACE CU WHILE
          /*  int i=1;//aici il initializezi
            while(i<5){//ce pui in loop asta o sa mearga continuu pana devine fals, pui conditie ca i<5, aceasta e o comparatie
                driver.findElement(By.cssSelector("[onclick='addAdult(1, event)']")).click();
                i++;//asta e conditia
            }
            driver.findElement(By.cssSelector("[onclick='submitRoomsData(event);']")).click();
        System.out.println(driver.findElement(By.cssSelector("[data-id='numTourists']")).getText());//sa iti afiseze textul final, cati adulti

    }*/


//DYNAMIC DROPDOWN  asta trebuie s al verific ca nu merge site-ul
//ACESTEA SE BAZEAZA PE ACTIUNILE USERULUI, DE ASTA SE NUMESTE DYNAMIC

/*public class Main
{
    System.setProperty("webdriver.chrome.driver","F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        /*o sa fie o problmea pentru ca textul este si la from si la to - si o sa pice, pentru ca o sa gaseasca doar pe primul de la stanla dreapta ,
         si pentru a-l selecta pe aldoilea trebuie sa i zicem x path ului asta cu: ()[2] - adica pui primul xpath in paranteze si dupa pui [2]*/
//"//*[text()='Ahmedabad']" - xpath
       /*  driver.findElement(By.cssSelector("[data-testid='to-testID-origin']")).click(); // sau cu xpath - driver.findElement("By.xpath("//*[@data-testid='to-testID-origin']")").click();
                 driver.manage().window().maximize();
                 Thread.sleep(2000L);
                 driver.findElement(By.xpath("//*[text()='Sri Guru Ram Dass Jee International Airport']")).click();
                 Thread.sleep(2000L);
                 driver.findElement(By.xpath("//*[text()='Kishangarh Airport'])")).click();//nu merge*/

//CUM SA FACI ACELASI LUCRU CA SUS DAR FOLOSIND METODA PARENT-CHILD RELATIONSHIP
     /* driver.findElement(By.xpath("//*[@data-testid='to-testID-origin']")).click();
              driver.findElement(By.xpath("//*[text()='Ahmedabad']")).click();

              Thread.sleep(2000L);
              driver.findElement(By.xpath("//*[@class'css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3'] //*[text()='Ahmedabad']")).click(); //aici pui prima data parintele dupa care spatiu dupa care copilul daca ai parinti diferiti, daca nu, cum e cazul meu, merge metoda de mai sus NU MERGE



              }
}
*/

//AUTOSUGGESTIVE DROPDOWN
//atunci cand optiunile nu sunt vizibile si trebuie sa introduci tu ceva pentru a vedea valorile

/*public class Chrome {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000L);
        List <WebElement> options =driver.findElements(By.cssSelector("[class='ui-menu-item'] a"));
        for(WebElement option:options){
            if (option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }
    }
}
*/

//CHECKBOX AND GETTING THE SIZE OF THEM


/*public class Main
{
    public static void main(String[] args) {

         System.setProperty("webdriver.chrome.driver","F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.cssSelector("[name*='SeniorCitizenDiscount']")).click(); //selecteaza senior citizen
        System.out.println(driver.findElement(By.cssSelector("[name*='SeniorCitizenDiscount']")).isSelected());//verifica daca e selectat
        System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size()); //verifica toate elementele care au type=checkbox din pagina prin Elements, nu Element - si prin size iti spune cate sunt


    }
}*/

//VERIFICAREA PRIN ASSERTIONS - DACA UN TEST E ADEVARAT TRECE LA URMATORUL, DACA E FALS SE OPRESTE

/*System.setProperty("webdriver.chrome.driver","F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.cssSelector("[name*='SeniorCitizenDiscount']")).isSelected());
        //System.out.println(driver.findElement(By.cssSelector("[name*='SeniorCitizenDiscount']")).isSelected());//verifica daca e selectat
        driver.findElement(By.cssSelector("[name*='SeniorCitizenDiscount']")).click(); //selecteaza senior citizen
        //System.out.println(driver.findElement(By.cssSelector("[name*='SeniorCitizenDiscount']")).isSelected());//verifica daca e selectat
        Assert.assertTrue(driver.findElement(By.cssSelector("[name*='SeniorCitizenDiscount']")).isSelected());
        System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size()); //verifica toate elementele care au type=checkbox din pagina prin Elements, nu Element - si prin size iti spune cate sunt
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        for (int i=1;i<5;i++){
        driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); */

//CALENDAR
/*public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//maximeaza fereastra
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.cssSelector("[text='Bengaluru (BLR)']")).click();
        driver.findElement(By.cssSelector("[text='Chennai (MAA)']")).click();
        driver.findElement(By.cssSelector("[class=' ui-datepicker-week-end ui-datepicker-days-cell-over  ui-datepicker-today']")).click();//da click pe clasa prezenta

        }*/

//CUM VERIFICI DACA CEVA E ENABLE SAU DISABLE

/*System.setProperty("webdriver.chrome.driver","F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//maximeaza fereastra
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        //driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        // driver.findElement(By.cssSelector("[text='Bengaluru (BLR)']")).click();
        // driver.findElement(By.cssSelector("[text='Chennai (MAA)']")).click();
        //   driver.findElement(By.cssSelector("[class=' ui-datepicker-week-end ui-datepicker-days-cell-over  ui-datepicker-today']")).click();//da click pe clasa prezenta
        // System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());//nu e recomandat sa l folosesti pentru ca de multe ori e ceva schimbat la stil, nu e chiar dezactivat
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        // System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());//nu e recomandat sa l folosesti pentru ca de multe ori e ceva schimbat la stil, nu e chiar dezactivat
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
        Assert.assertTrue(true);
        }
        else {
        Assert.assertTrue(false);
        }*/






























