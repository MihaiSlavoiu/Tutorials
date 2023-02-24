package org.example.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

    @Parameters({ "URL" }) //si asa apelezi parametrul din xml, acesta se va apela doar la metoda asta, daca vrei sa se apele la toate, trebuie sa il scrii deasupra fiecarei metode
    @Test(timeOut = 4000) //in cazul in care ai un server care porneste mai greu ii pui conditia asta sa nu dea eroare timp de x secunde doar metoda asta nu tot
    public void WebloginHomeLoan(String uname)
    {
        //selenium
        System.out.println("webloginhomePersonalLoan");
        System.out.println(uname);

    }


    @Test(groups={"Smoke"})
    public void MobileLoginHomeLoan()
    {
        //Appium
        System.out.println("MobileloginHome");
    }

    @Test
    public void LoginAPIHomeLoan()
    {
        //Rest API automation
        System.out.println("APIloginHome");
    }
}
