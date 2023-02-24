package org.example.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {


    @Test(groups={"Smoke"})
    public void ploan()
    {
        System.out.println("good");
    }

    @BeforeTest // - o sa se execute prima data, inaintea testelor din folderul de teste din xml
    public void prerequiste()
    {
        System.out.println("I will execute first"); // - poti de exemplu sa stergi anumite date sau sa setezi un anumit api etc
    }
}