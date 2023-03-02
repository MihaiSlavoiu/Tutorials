package TestComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
//flaky tests
    int count = 0;
    int maxTry = 1;
    @Override
    public boolean retry(ITestResult iTestResult) {
//logica daca vrei ca testul care a picat as se reia

        //daca vrei ca un rest sa se reia scrii in paranteza (retryAnalizer=ClassName)
    if (count<maxTry){
        count++;
        return true;
    }
        return false;
    }
}
