package uk.gov.harrow.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.gov.harrow.loadproperty.LoadProperty;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.LoginPage;
import uk.gov.harrow.testbase.TestBase;

public class TestSuite extends TestBase {


    //object creation
    LoadProperty loadProperty ;
    HomePage homePage ;
    LoginPage loginPage;

    //String loginPageText = loadProperty.getProperty("loginPageText");

    @BeforeMethod
    public void setUp(){
        loadProperty = new LoadProperty();
        homePage = new HomePage();
        loginPage  = new LoginPage();


    }
    //TestCases
    @Test(groups = {"Regression","Sanity"})
    public void verifyClickOnLoginLink() {
        // click on log in
        homePage.clickOnLoginLink();


    }

    @Test (groups = {"Regression","Smoke"})
    public void verifyClickOnServicesBtn() {
        //click on services button
      homePage.clickonservicesBtn();
    }



}
