package Scenarios;

import org.testng.SkipException;
import org.testng.annotations.*;

public class Test02 {

    @BeforeClass
    public void BeforeClass() {
        System.out.println("BeforeClass : 02");
    }


    @Test(invocationCount = 5, groups = {"CIR"}, enabled = true)
    public void Test1() {
        if (1 == 1) {
            throw new SkipException("Skipped");
        }
        System.out.println("Test-02-1");

    }

    @Test(groups = {"Regression"})
    public void Test2() {
        System.out.println("Test-02-2");
    }

    // retryAnalyzer = Retry.class
    @Test(groups = {"CIR", "Regression"}, timeOut = 1000)
    public void Test3() throws InterruptedException {
        System.out.println("Test-02-3");
        Thread.sleep(2000);
    }


    @AfterClass
    public void AfterClass() {
        System.out.println("AfterClass : 02");
    }


}
