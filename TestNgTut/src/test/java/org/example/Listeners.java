package org.example;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners
public class Listeners implements ITestListener { //are multe metode inauntru nu trebuie sa le tii minte pe toate

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSuccess(ITestResult result) { //o sa scrie sub fiecare metoda(test) care a reusit(care a avut succes) mesajul asta
        // TODO Auto-generated method stub

        //	System.out.println("I successfully executed org.example.Listeners Pass code");
    }

    @Override
    public void onTestFailure(ITestResult result) { //o sa scrie sub fiecare metoda(test) care a esuat(care a avut fail) mesajul asta // result.getName() o sa ne dea numele testului care a picat
        // TODO Auto-generated method stub
        //screenshot code
        //response if API is failed

        System.out.println("I failed executed org.example.Listeners Pass code" +result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }


    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }


    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub

    }

}
