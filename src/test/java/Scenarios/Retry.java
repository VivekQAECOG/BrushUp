package Scenarios;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    @Override
    public boolean retry(ITestResult iTestResult) {
        int count =0;
        int maxTry =3;
        if(count< maxTry){
            count++;
            return true;
        }
        return false;
    }
}
