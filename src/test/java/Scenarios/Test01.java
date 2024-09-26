package Scenarios;

import org.testng.annotations.*;


public class Test01 extends Base {

    @BeforeTest
    public void BeforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("BeforeClass : 01");
    }

    @Parameters("Tester")
    @Test(priority = 0, groups = {"CIR"})
    public void Test1(String Tester) {
        System.out.println("Test-01-1 : " + Tester);
    }

    @Test(dataProvider = "role",priority = 1,groups = {"Regression"})
    public void Test2(String role) {
        System.out.println("Test-01-2: " + role);
    }

    @Test( priority = -1,dependsOnMethods = {"Test1"},groups = {"CIR"})
    public void Test3() {
        System.out.println("Test-01-3");
    }


    @AfterClass
    public void AfterClass() {
        System.out.println("AfterClass : 01");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("After Test");
    }

    @DataProvider(name = "role")
    public Object[]getData(){
        return new Object[]{"QA","DEV"};
    }


}
