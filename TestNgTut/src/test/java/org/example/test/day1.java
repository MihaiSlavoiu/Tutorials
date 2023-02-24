package org.example.test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.TestNGAntTask.Mode.junit;

//TEST NG
//ANNOTATION
//TOATE TESTELE SE FAC IN ORDINEA ALFABETICA

//A test method is a Java method annotated by @Test in your source.

// @Test	Marks a class or a method as part of the test.
// @BeforeSuite: The annotated method will be run before all tests in this suite have run.
// @AfterSuite: The annotated method will be run after all tests in this suite have run.
// @BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
// @AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
// @BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
// @AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
// @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
// @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
// @BeforeMethod: The annotated method will be run before each test method.
// @AfterMethod: The annotated method will be run after each test method.

public class day1 {


    // TODO Auto-generated method stub
    @AfterTest // - o sa se execute ultima data, dupa testele din folderul respectiv, adica din xml ul de test
    public void lastexecution()
    {
        System.out.println("I will execute last");

    }
    @Test
    public void Demo()
    {
        System.out.println("hello");//automation
        Assert.assertTrue(true);
    }
    @AfterSuite //- se executa la sfarsitul suite ului
    public void afSyite()
    {
        System.out.println("I am the no 1 from last ");
    }
    @Test
    public void SecondTest()
    {
        System.out.println("bye");
    }



}
