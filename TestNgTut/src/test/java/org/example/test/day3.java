package org.example.test;

import org.testng.annotations.*;

public class day3 {
    @BeforeClass // - se executa inaintea executarii oricarei metode din clasa
    public void befoclas()
    {
        System.out.println("before executing any methods in the class");
    }
    @Parameters({ "URL","APIKey/usrname" })
    @Test
    public void WebloginCarLoan(String urlname,String key) //si daca vrei sa faci cu DataProvider trebuei sa pui 2 parametrii(String username, String password){
    { //urlname va stoca valoarea pusa in parametrul din xml
        //selenium
        System.out.println("weblogincar");
        System.out.println(urlname); //o sa printeze la consola valoarea din parametru din xml
        System.out.println(key);

    }
    @BeforeMethod //  se executa inaintea fiecarei metode din clasa respectiva - se foloseste de ex sa stergi cooki urile
    public void beforeevery()
    {
        System.out.println(" I will execute before every test method in day 3 class");
    }

    @AfterMethod //- se executa dupa fiecare metoda din clasa respectiva - se foloseste de ex sa stergi cooki urile
    public void afterevery()
    {
        System.out.println(" I will execute after  every test method in day 3 class");
    }
    @AfterClass //- se executa dupa executarea oricarei metode din clasa
    public void afteclas()
    {
        System.out.println("After executing all methods in the class");
    }

    @Test(groups={"Smoke"})
    public void MobileLogincarLoan()
    {
        //Appium
        System.out.println("Mobilelogincar");
    }
    @BeforeSuite  //o sa fie primul din SUITE care o sa se execute - poti sa ti setezi anumite api uri etc
    public void Bfsuite()
    {
        System.out.println(" I am no 1");
    }
    @Test(enabled=false) //- o sa dea skip la test cand executa
    public void MobilesignimcarLoan()
    {
        //Appium
        System.out.println("Mobile SIGIN");
    }
    @Test(dataProvider="getData") //asa trimite datele din data provider (nu merge sa le scrii pe ambele dar am scris ca exemplu)
    public void MobilesignoutcarLoan(String username,String password)
    {
        //Appium
        System.out.println("Mobile SIGNOUT");
        System.out.println(username);
        System.out.println(password);

    }

    @Test(dependsOnMethods={"WebloginCarLoan","MobilesignoutcarLoan"}) //testele se executa in ordine alfabetica dar daca vrei sa executi cu conditii pui asa in paranteze, si testul o sa inceapa sa execute ce in acolade si dupa testul tau
    public void APIcarLoan()
    {
        //Rest API automation
        System.out.println("APIlogincar");
    }
    @DataProvider
    public Object[][] getData()
    {
        //1st combiantion - username password - good credit history= row
        //2nd - username password  - no crdit history
        // 3rd - fraudelent credit history
        Object[][] data= new Object[3][2]; //[randuri][coloane]
        //1st set
        data[0][0]="firstsetusername"; //rand 0 , coloana 0
        data[0][1]="firstpassword"; //rand 0 , coloana 1
        //couloumns in the row are nothing but values for that particualar combination(row)

        //2nd set
        data[1][0]= "secondsetusername";
        data[1][1]= "secondpassword";

        //3rd set
        data[2][0]="thirdsetusername";
        data[2][1]="thirdpassword";
        return data;








    }

}
