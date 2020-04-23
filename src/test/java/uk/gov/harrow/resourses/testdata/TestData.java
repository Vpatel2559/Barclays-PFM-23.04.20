package uk.gov.harrow.resourses.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    // annotations data provider
    @DataProvider(name = "LoginCredentials")
    public Object[][] getLoginData(){
        return new Object[][]{
                {"abc@gmail.com","test123"},

        };
    }
    @DataProvider(name = "RegistrationCredential")
    public Object[][] getRegistrationData(){
        return new Object[][]{

        };
    }
}
