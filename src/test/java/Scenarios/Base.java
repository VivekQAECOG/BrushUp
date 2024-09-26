package Scenarios;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {

    @BeforeSuite(alwaysRun = true)
    public void BeforeSuite() {
        System.out.println("BeforeSuite");
    }

    @AfterSuite(alwaysRun = true)
    public void AfterSuite() {
        System.out.println("AfterSuite");
    }

}
