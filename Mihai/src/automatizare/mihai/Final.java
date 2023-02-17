package automatizare.mihai;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Final {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        //INTRA PE SITE SI IA NUMELE
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());//returneaza titlul siteului, verifici daca titlul e corect
        System.out.println(driver.getCurrentUrl());//returneaza url ul pe care ai intrat, verifici ca ai ajuns unde trebuie
        System.out.println(driver.getPageSource());//returneaza pagina sursa
        driver.navigate().back();//te trimite la dinainte, da back;
        driver.navigate().forward();//te trimite la pagina de dupa;
        driver.close();//inchide browserul curent inchide de ex fila nr 3
        driver.quit();//inchide toate browsere deschide de selenium
        */
        /*
        //COMPLETARE LOGIN SI PAROLA SI CLICK PE FORGOT PASSWORD
        driver.get("https://login.salesforce.com/");//url din brower
        driver.findElement(By.id("username")).sendKeys("Mihai");//gaseste elementul din id si cu sendKeys trimite ce sa scrie
        driver.findElement(By.name("pw")).sendKeys("parola");//gaseste elementul din name si cu sendKeys trimite ce sa scrie//gaseste elementul cu linktect , in paranteze trebuie sa scrii linkul textului pe care vrei sa il apelezi dupa care dai clcik pe el
        driver.findElement(By.linkText("Forgot Your Password?")).click();//ei sa il apelezi dupa care dai clcik pe el
        */
        /*
        //XPATH
        input - TagName
        Attributes - type, id, name (cele din stanga)
        Value - submit, Login, Log In (cele din dreapta egalului)
        !!! sintaxa pentru xpath este!!!
        //tagName[@attribute='value']  exemplu //input[@id = 'Login']
        verificare consola webdrive $x("")
        exemplu $x("//*[@id='forgot_password_link']")
        !! sintaxa se mai poate scrie fara a scrie tagNameul, pui in loc de tagName * exemplu
        //*[@id = 'Login'] aici imi cauta orice tagName care are @id = 'Login' daca vrei sa fie mai specific pui si tagName ul
        CUM FACI DACA AI UN SINGUR ATRIBUT CARE ISI SCHIMBA MEREU VALOAREA sau daca ai un atribut foarte lung de exemplu
        input name="username123", dai refresh si dupa o sa fie username234
        FOLOSESTI REGULAR EXPRESSION CONCEPT - identifici ce e constant(in ex de mai sus e username)
        folosesti sintaxa //tagName[contains(@attribute,'value')] EXEMPLU $x("//button[contains(text(),'PROCEED TO CHECKOUT')]")
        EXEMPLU MAI JOS
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("aaaa");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("bbb");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
         */


        /*
        //CSS
        input - TagName
		Attributes - type, id, name (cele din stanga)
		Value - submit, Login, Log In (cele din dreapta egalului)
		!! sintaxa pentru css este
		tagName[attribute='value']  exemplu input[id = 'Login']
        verificare consola webdrive $("") exemplu pentru a verifica pui in consola din chrome $("input[id ='Login']")
        exemplu $("#mydomainLink")
        !!sintaxa se mai poate scrie
		tagName#id (daca ai id) exemplu input#Login sau in consola $("input#Login") - se foloseste doar daca ai id
		!!sintaxa se mai poate scrie
		tagName.classname EXEMPLU input.button r4 wide primary , DAR POTI FOLOSI DOAR DACA ARE UN SINGUR CUVANT CA SI VALOARE exemplu input.username
		!! se mai poate scrie si
		#id EXEMPLU PENTRU MAI SUS #Login
		CUM FACI DACA AI UN SINGUR ATRIBUT CARE ISI SCHIMBA MEREU VALOAREA sau daca ai un atribut foarte lung de exemplu
		input name="username123", dai refresh si dupa o sa fie username234
		FOLOSESTI REGULAR EXPRESSION CONCEPT - identifici ce e constant(in ex de mai sus e username)
		folosesti sintaxa tagName[Attribute*='value'] EXEMPLU input[name*='username']
		EXEMPLU MAI JOS
        driver.findElement(By.cssSelector("input[name='Login']")).sendKeys("aaaa");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("bbbb");
        driver.findElement(By.cssSelector("input[id = 'Log In']")).click();
         */

        /*
         //EXEMPLU PENTRU CSS SI XPATH
        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("aaaaa");
        driver.findElement(By.cssSelector("input#password")).sendKeys("bbbb");
        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();//chiar daca am scris doar procee - pentru ca am folosit regular expression a stiut unde sa dea click
         */

        /*
        //PARENT - CHILD - RELATIONSHIP
        define xpath for parent and traverse to child
        driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/div/div/input");

        CARE E DIFERENTA DINTRE RELATIVE SI ABSOLUTE XPATH?
        RELATIVE-nu depinde de parents nodes - ACESTA E PREFERABIL PENTRU CA IN CAZUL IN CARE DEV MODIFICA CEVA, NU MAI POATE FI ACCESAT, DAR DACA II SPUI EXACT CE SA APELEZE, O SA APELEZE CE TREBUIE
        ABSOLUTE-depinde de parent-child relationship - ajugi la el prin /div/div/...

        HOW TO TRAVERSE TO SIBLINGS ELEMENT USING XPATH:(ADICA CUM SA TE MUTI LA AL DOILEA ELEMNT DACA NU AI CHILD)
        se foloseste sintaxa /following-sibling::li[2]
        ex: //*[@id='tablist1-tab1']/following-sibling::li[2] folder 7 clip 5 min6

        SAUM TRAVERSEZI DE LA CHILD LA PARINTE:
        se foloseste sintaxa /parent:: - exemplu //*[@id='tablist1-tab1']/parent::ul

        !!!!! POTI TRVERSA DE LA CHILD LA PARENT DOAR IN XPATH - NU MERGE IN CSS - ASTA E DIFERENTA MAJORA!!!!!! IN CSS NU POTI TRAVERSA INAPOI!!!!

         */

        /*
        //IDENTIFICARE OBIECTELOR CU AJUTORUL TEXTULUI
        CUM SE CREAZA UN XPATH DOAR CU TEXTUL VIZIBIL
        se foloseste sintaxa    //*[text()='copiezi textul aici'] - trebuie sa ai grija sa pui spatiile din text inclusiv inainte si dupa, altfel nu merge - nu trebuie sa o folosesti des, nu e foarte de incredere
        */

        /*
        //CSS selectors locator
        driver.findElement(By.cssSelector("[id='username']")).sendKeys("Mihai");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("a");
        sau
        driver.findElement(By.cssSelector("#password")).sendKeys("a");
         */

        /*
        //STATIC DROPDOWN
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        Select s=new Select(driver.findElement(By.id("dropdown-class-example"))); //La Select trebuie sa pui in paranteza locatia unde sa caute(By.cssSelector...sau By,id...)
        //poti alege optiunile astea doar daca ai tagName select
        s.selectByValue("option3");
        s.selectByIndex(2);
        s.selectByVisibleText("Option1");
         */

        /*
        //STATIC DROPDOWN CU + SI -
driver.get("https://www.veltravel.ro/");
        Thread.sleep(2000L);
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        driver.findElement(By.cssSelector("[id='dropdownRoomGuests']")).click();
        Thread.sleep(2000L);//incetineste procesul cu 2 secunde
        driver.findElement(By.cssSelector("[onclick='addAdult(1, event)']")).click();
        //daca vrei sa apesi buroul acela de mai multe ori:
        //Se poate scrie in loop:
        for(int i=1;i<5;i++) {
            driver.findElement(By.cssSelector("[onclick='addAdult(1, event)']")).click();
        }
        //sau se mai poate scrie in while
        int i=1;//aici il initializezi
        while (i<5){//ce pui in loop asta o sa mearga continuu pana devine fals, pui conditie ca i<5, aceasta e o comparatie
            driver.findElement(By.cssSelector("[onclick='addAdult(1, event)']")).click();
            i++;//asta e conditia
        }
        driver.findElement(By.cssSelector("[onclick='submitRoomsData(event);']")).click();//salveaza
        System.out.println(driver.findElement(By.cssSelector("[data-id='numTourists']")).getText());//sa iti afiseze textul final, cati adulti
         */

        /*
        //DYNAMIC DROPDOWN  asta trebuie s al verific ca nu merge site-ul
        //ACESTEA SE BAZEAZA PE ACTIUNILE USERULUI, DE ASTA SE NUMESTE DYNAMIC
        driver.get("https://www.spicejet.com/");
        /*o sa fie o problmea pentru ca textul este si la from si la to - si o sa pice, pentru ca o sa gaseasca doar pe primul de la stanla dreapta ,
         si pentru a-l selecta pe aldoilea trebuie sa i zicem x path ului asta cu: ()[2] - adica pui primul xpath in paranteze si dupa pui [2]
        //"//*[text()='Ahmedabad']" - xpath
        driver.findElement(By.cssSelector("[data-testid='to-testID-origin']")).click(); // sau cu xpath - driver.findElement("By.xpath("//*[@data-testid='to-testID-origin']")").click();
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[text()='Sri Guru Ram Dass Jee International Airport']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[text()='Kishangarh Airport'])")).click();//nu merge


        //CUM SA FACI ACELASI LUCRU CA SUS DAR FOLOSIND METODA PARENT-CHILD RELATIONSHIP
        driver.findElement(By.xpath("//*[text()='Ahmedabad']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class'css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3'] //*[text()='Ahmedabad']")).click(); //aici pui prima data parintele dupa care spatiu dupa care copilul daca ai parinti diferiti, daca nu, cum e cazul meu, merge metoda de mai sus NU MERGE
         */

        /*
        //AUTOSUGGESTIVE DROPDOWN
        //atunci cand optiunile nu sunt vizibile si trebuie sa introduci tu ceva pentru a vedea valorile
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
        //varianta 2
        driver.get("https://www.vola.ro/");
        Thread.sleep(2000);
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        driver.findElement(By.id("cityHelperfrom")).clear();
        driver.findElement(By.id("cityHelperfrom")).sendKeys("par");
        Thread.sleep(2000);
        driver.findElement(By.id("cityHelperfrom")).sendKeys(Keys.ENTER);
        //sau sa se vada mai frumos
        //varianta 2
        driver.get("https://www.vola.ro/");
        Thread.sleep(2000);
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        WebElement source = driver.findElement(By.id("cityHelperfrom"));
        source.clear();
        source.sendKeys("par");
        Thread.sleep(2000);
        source.sendKeys(Keys.ENTER);
        WebElement departure= driver.findElement(By.cssSelector("[id='cityHelperto']"));
        departure.click();
        departure.sendKeys("dub");
        Thread.sleep(2000);
        //departure.sendKeys(Keys.ARROW_DOWN);//ca sa o selectezi pe urmatoare de dupa prima
        for(int i=0;i<4;i++){
            driver.findElement(By.cssSelector("[id='cityHelperto']")).sendKeys(Keys.ARROW_DOWN);
        }
        departure.sendKeys(Keys.ENTER);

        //VARANTA 3
        //varianta 2
        driver.get("https://ksrtc.in/oprs-web/");
        driver.findElement(By.id("fromPlaceName")).sendKeys("ben");
        driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
                System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
        //JAVA SCRIPT DOM CAN EXTRACT HIDDEN ELEMENTS
        //SELENIUM CANNOT IDENTIFY HIDDEN ELEMENTS
        //INVESTIGATE THE ELEMENT FOR ANY HIDDEN TEXT
        //JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String plecare = "return document.getElementById('fromPlaceName').value;";//in js se foloseste retun in loc de syste.out.println
        String text= (String) js.executeScript(plecare);
        System.out.println(text);
        int i=0;
        while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")){
            i++;
            driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
            text= (String) js.executeScript(plecare);
            if(i>10){
                break;
            }

        }
        if(i>10){
            System.out.println("nu se gaseste");
        }
        else {
            System.out.println(text);
        }

         */

        /*
        //CHECKBOX AND GETTING THE SIZE OF THEM
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.cssSelector("[name*='SeniorCitizenDiscount']")).click(); //selecteaza senior citizen
        System.out.println(driver.findElement(By.cssSelector("[name*='SeniorCitizenDiscount']")).isSelected());//verifica daca e selectat
        System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size()); //verifica toate elementele care au type=checkbox din pagina prin Elements, nu Element - si prin size iti spune cate sunt
         */

        /*
        //VERIFICAREA PRIN ASSERTIONS - DACA UN TEST E ADEVARAT TRECE LA URMATORUL, DACA E FALS SE OPRESTE

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
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
         */

        /*
        //CALENDAR
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.cssSelector("[text='Bengaluru (BLR)']")).click();
        driver.findElement(By.cssSelector("[text='Chennai (MAA)']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.cssSelector("[class=' ui-datepicker-week-end ui-datepicker-days-cell-over  ui-datepicker-today']")).click();//da click pe clasa prezenta - NU MERGE
         */

        /*
        //CUM VERIFICI DACA CEVA E ENABLE SAU DISABLE
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
         // System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());//nu e recomandat sa l folosesti pentru ca de multe ori e ceva schimbat la stil, nu e chiar dezactivat
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        // System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());//nu e recomandat sa l folosesti pentru ca de multe ori e ceva schimbat la stil, nu e chiar dezactivat
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }
         */

        /*UN MIC FRAMEWORK CAP COADA
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
            driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
            driver.findElement(By.cssSelector("[text='Bengaluru (BLR)']")).click();
            driver.findElement(By.cssSelector("[text='Chennai (MAA)']")).click();
            Thread.sleep(2000L);
            driver.findElement((By.cssSelector("[class=' ui-datepicker-week-end ui-datepicker-days-cell-over  ui-datepicker-today']"))).click();
            Thread.sleep(2000L);
            driver.findElement(By.cssSelector("[id='divpaxinfo']")).click();
            Thread.sleep(2000L);

            for(int i=1; i<5; i++) {
                driver.findElement(By.cssSelector("[id='hrefIncAdt']")).click();
                            }
            driver.findElement(By.id("btnclosepaxoption")).click();
            Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
                    s.selectByValue("AED");
            driver.findElement(By.cssSelector("[name='ctl00$mainContent$btn_FindFlights']")).click();
         */
        /* //ACCEPT AND DISMISS ALERTA
            driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
            String text= "Mihai";
            driver.findElement(By.cssSelector("[placeholder='Enter Your Name']")).sendKeys(text);
            Thread.sleep(2000L);
            driver.findElement(By.cssSelector("[onclick='displayAlert()']")).click();
            Thread.sleep(2000L);
            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();
            driver.findElement(By.cssSelector("[placeholder='Enter Your Name']")).sendKeys(text);
            driver.findElement(By.cssSelector("[onclick='displayConfirm()']")).click();
            Thread.sleep(2000L);
            driver.switchTo().alert().dismiss();
            Thread.sleep(2000L);
            driver.close();/*

         */
        //PENTRU A ASEZA FRUMOS IN PAGINA CODUL SE FOLOSESTE CTRL+ALT+L
        //CLASA SE SCRIE CU PRIMA LITERA MARE SPOI TOATE MICI
        //VARIABILELE SI METODELE SE SCRIU camelCase

        //ADDING ITEMS TO CART FOR AN ECOMMERCE APP
        /*driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        //PENTRU A ADAUGA UN SINGUR PRODUS IN COS:
            List<WebElement> numarProduse = driver.findElements(By.cssSelector("[class='product-name']"));
        for (int i = 0; i < numarProduse.size(); i++) {
            String numeProdus = numarProduse.get(i).getText();
            if (numeProdus.contains("Cucumber")) {
                driver.findElements(By.cssSelector("[class='product-action']")).get(i).click();
                break;
            }
        }*/

        //PENTRU A ADAUGA MAI MULTE PRODUSE IN COS:
       /* String[] produseCos = {"Brocolli", "Cucumber", "Beetroot"};
        List<WebElement> numarProduse = driver.findElements(By.cssSelector("[class=product-name]"));
        for (int i = 0; i < numarProduse.size(); i++) {
            String[] numeProdus = numarProduse.get(i).getText().split("-");
            String unProdus = numeProdus[0].trim();
            List produseLista = Arrays.asList(produseCos);
            int j = 0;
            if (produseLista.contains(unProdus)) {
                j++;
                driver.findElements(By.cssSelector("[class='product-action']")).get(i).click();
                if (j == produseCos.length) {
                    break;
                }
            }
        }*/
        //SYNCHRONIZATION IN SELENIUM
        //IMPLICIT WAIT - SE APLICA GLOBAL, DACA II DAI DE EX SA ASTEPTE 3 SECUNDE ASTEAPTA DE FIECARE DATA
        //EXPLICIT WAIT - SE APLICA DOAR LA ANUMITE PARTI, II SPUI TU UNDE SA ASTEPTE
        //THREAD.SLEEP - DE OBICEI NU SE FOLOSESTE PT CA E HARDCODATA, E POSIBIL CA PAGINA SA SE INCARCE IN 3 SECUNDE DAR TU DACA II DAI 5 SECUNDE, 5 SECUNDE VA ASTEPTA
        //FLUENT WAIT
    }
    //public static void main(String[] args) throws InterruptedException {
        /*System.setProperty("webdriver.Chrome.driver", "F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //ADDING ITEMS TO CART FOR AN ECOMMERCE APP
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");*/
    //EXPLICIT AND IMPLICIT SYNCRONIZATION
        /*//IMPLICIT WAIT
        //Pros: readable code and optimized
        //Cons: daca sunt probleme in performance si dureaza mai multe de 5 o sa fie fail
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String[] produseCos = {"Brocolli", "Cucumber", "Beetroot"};
        addItem(driver,produseCos);
        driver.findElement(By.cssSelector("[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector("[class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("[class='promoBtn']")).click();
        System.out.println(driver.findElement(By.cssSelector("[class='promoInfo']")).getText());*/

    //EXPLICIT WAIT
    //TREBUIE SA PUI EXPLICIT WAIT ACOLO UNDE CREZI CA E NEVOIE DE MAI MULT TIMP, DE EX INAINTE S ATI DEA TEXTUL DUPA CE PUI CODUL DE PROMO
    //BAZA E ASA. ASA SE FOLOSESTE:
    //WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
    //w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='promoCode']")));
    //PRO: WAIT IS APPLIED ONLY AT TARGETTED ELEMENTS. NO PERFORMANCE ISSUS
    //CONS YOU JAVE TO WRITE MORE LINES OF CODING
        /*String[] produseCos = {"Brocolli", "Cucumber", "Beetroot"};
        addItem(driver,produseCos);
        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.cssSelector("[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='promoCode']")));
        driver.findElement(By.cssSelector("[class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("[class='promoBtn']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='promoInfo']")));

        System.out.println(driver.findElement(By.cssSelector("[class='promoInfo']")).getText());*/


    //}
    /*public static void addItem(WebDriver driver, String[] produseCos){
        List<WebElement> numarProduse = driver.findElements(By.cssSelector("[class=product-name]"));
        for (int i = 0; i < numarProduse.size(); i++) {
            String[] numeProdus = numarProduse.get(i).getText().split("-");
            String unProdus = numeProdus[0].trim();
            List produseLista = Arrays.asList(produseCos);
            int j = 0;
            if (produseLista.contains(unProdus)) {
                j++;
                driver.findElements(By.cssSelector("[class='product-action']")).get(i).click();
                if (j == produseCos.length) {
                    break;
                }
            }
        }

        //FLUID WAIT
        //FACE PARTE TOT DIN EXPLICIT WAIT, ADICA PRINCIPALE SUNT DOAR IMPLICIT SI EXPLICIT
        //EXPLICIT WAIT SUNT DE 3 FELURI:
        //WEBDRIVERWAIT- 10 SECONDS
        //FLUENTWAIT - 10 SECONDS POLLING 2 SEC
        //FUID WAIT SE INTEGRAZA IN EXPLICIT WAIT
        //FLUID WAIT GASESC WEBELEMENTELE IN MOD REGULAT LA INTERVALE DE TIMP REGULATE SAU PANA CAND ELEMENTUL ESTE GASIT
        //UNLIKE WEBDRIVERWAIT WE NEED TO BUILD CUSTOMIZED WAIT METHOD BASED ON CONDITIONS
        //CA EXEMPLU SE FOLOSESTE LA SITE URILE DE ECOMMERCE CAND AJUNGI LA PLATA-NAG DETALIILE PLATII SI DAI SUBMIT SI PRIMESTI MESAJE:
        //YOUR CARF IS ACCEPTED(3 SEC) YOUR ORDER IS BEING PROCESSED APOI CONFIRMARE(7 SEC)
        System.setProperty("webdriver.Chrome.driver", "F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //ADDING ITEMS TO CART FOR AN ECOMMERCE APP
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.cssSelector("[id='start'] button")).click();
        //ASTA E SINTAXA
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
                        return driver.findElement(By.cssSelector("[id='finish'] h4"));
                    }
                    else
                        return null;
            }
        });
        System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
    }*/

    /*
    //ACTIONS IN SLEENIUM
        //MOUSEOVER
        //PERFORMING MOUSE AND KEYNOARD INTERACTIONS WITH SELENIUM
        //CONTEXT CLICK ON ELEMENT - RIGHTCLICK
        //DOUBLE CLICK ON ELEMENT
        //DRAG AND DROPPING THE ELEMENT
        driver.get("https://www.amazon.com/");
        Actions a = new Actions(driver);

        /*
        //MOUSEOVER
    // a.moveToElement(driver.findElement(By.cssSelector("[id='nav-link-accountList']"))).build().perform();
    //SAU SE POATE SCRIE CA VARIABILA PENTRU A SE VEDEA MAI FRUMOS:
    WebElement move = driver.findElement(By.cssSelector("[id='nav-link-accountList']"));
        a.moveToElement(move).build().perform();*/

    //SENDKEY INTO CAPITAL LETTERS
    //a.moveToElement(driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello ").build().perform();

    //CUM SELECTEZI CEEA CE AI SCRIS INTR UN FIELD - PRIN DOUBLECLICK
    //a.moveToElement(driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

    //RIGHTCLICK
    //a.moveToElement(driver.findElement(By.cssSelector("[id='nav-link-accountList']"))).contextClick().build().perform();*/

    /*//MULTIPLE WINDOWS
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.findElement(By.cssSelector("#initialView > footer > ul > li:nth-child(1) > a")).click();
        System.out.println("Before Switching");
        System.out.println(driver.getTitle());
    Set<String> ids = driver.getWindowHandles();
    Iterator<String> it = ids.iterator();
    String parentId = it.next();
    String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println("After switching");
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentId);
        System.out.println("Switching back to parent");
        System.out.println(driver.getTitle());*/
    /*//MULTIPLE WINDOWS
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.findElement(By.cssSelector("#initialView > footer > ul > li:nth-child(1) > a")).click();
        System.out.println("Before Switching");
        System.out.println(driver.getTitle());
        //SINTAXA
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println("After switching");
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentId);
        System.out.println("Switching back to parent");
        System.out.println(driver.getTitle());*/

    /*//FRAMES
        driver.get("https://jqueryui.com/droppable/");
    //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
    //driver.findElement(By.id("draggable")).click();
    Actions dragAndDrop = new Actions(driver);
    // dragAndDrop.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
    //sau se mai paote scrie:
    //WebElement source = driver.findElement(By.id("draggable"));
    // WebElement target = driver.findElement(By.id("droppable"));
    //dragAndDrop.dragAndDrop(source,target).build().perform();

    //IN CAZUL IN CARE SUNT MAI MULTE FRAME URI, SI VREI SA TE DUCI IN FRAMEUL 2 CU AJUTORUL INDEXULUI:
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);
        dragAndDrop.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();

    //PENTRU A IESI DIN FRAME:
        driver.switchTo().defaultContent();*/

    /*//PRINT THE LINKS COUNT
    //1.give me the counts of the links on the page
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
    //2.COUNT OF FOOTER SECTION
    WebElement footer = driver.findElement(By.id("gf-BIG"));
        System.out.println(footer.findElements(By.tagName("a")).size());
    //3. COUNT OF THE FIRST SECTION OF FOOTER
    WebElement firstSectionOfFooter = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(firstSectionOfFooter.findElements(By.tagName("a")).size());
    //4.Click on each link in the column and check if the pages are opening
        for(int i=1; i<firstSectionOfFooter.findElements(By.tagName("a")).size();i++) {

        //sintaxa sa dai click pe orice tab pentru a deschide o noua pagina
        // Keys.chord(Keys.CONTROL,Keys.ENTER);

        String clickOnLInkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
        firstSectionOfFooter.findElements(By.tagName("a")).get(i).sendKeys(clickOnLInkTab);
        Thread.sleep(5000);
    }//openes all the tabs
    //GET THE TITLE OF EACH PAGE
    Set<String> windowschild = driver.getWindowHandles();
    Iterator<String> it = windowschild.iterator();

            while (it.hasNext()){
        driver.switchTo().window(it.next());
        System.out.println(driver.getTitle());
    }
            driver.quit();//inchide tot chromeul
            driver.close();//inchide tab ul */

    /*//HANDLE CALENDAR
        driver.get("https://www.vola.ro/");
        Thread.sleep(2000);
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        driver.findElement(By.id("calendarFrom6")).click();
        //10 aprilie
        //SELECT MONTH
        while(!driver.findElement(By.cssSelector("[class='ith-calendar__month-name text-center']")).getText().contains("aprilie")){
            driver.findElement(By.cssSelector("[class='ith-calendar__next-month']")).click();
        }

        ;
        //SELECT DAY
        //GRAB COMMON ATTRIBUTE, PUT INTO LIST AND ITERATE
        List<WebElement> zile = driver.findElements(By.cssSelector("[ng-bind='::day.day']"));
        for(int i=0;i<driver.findElements(By.className("ith-calendar__button")).size();i++){
            String text = driver.findElements(By.cssSelector("[ng-bind='::day.day']")).get(i).getText();
            if(text.equalsIgnoreCase("10")){
                driver.findElements(By.cssSelector("[ng-bind='::day.day']")).get(i).click();
                break;
            }
        }*/

    /*//HOW TO PERFORM SCROLLING IN SELENIUM
        //SE FACE CU JAVASCRIPT
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        //PENTRU A FACE ASTA IN CONSOLA DIN CHROME, SCRII window.scrollBy(0,800) CA SA VEZI SI DACA TE DUCE BINE SCROLLUL
        //PENTRU A FACE SCROLL INTR UN OBIECT DIN PAGINA TREBUIE SA FOLOSESTI: document.querySelector(".tableFixHead").scroll(0,200) deci cum e in sleenium cu driver.dinf element, in java script se foloseste document.querySelector
        // se mai poate scrie : document.querySelector(".tableFixHead").scrollTop=5000; sau scrollLeft etc
        Thread.sleep(2000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=200");
        //HANDLE TABLES
        List<WebElement> lista = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;
        for(int i=0;i <lista.size(); i++){
            sum= sum + Integer.parseInt(lista.get(i).getText());//convertesti string in int

        }
        System.out.println(sum);
        int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

        Assert.assertEquals(sum, total);*/

    /*//HANDLING HTTPS CERTICATES SSL IN AUTOMATED TESTING
    ChromeOptions option=new ChromeOptions();
        option.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.Chrome.driver", "F:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://expire.badssl.com/");
        System.out.println(driver.getTitle());*/
}