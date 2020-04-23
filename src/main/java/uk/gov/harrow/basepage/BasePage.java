package uk.gov.harrow.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver;

// To implement log4j properties

    public BasePage() {

        PropertyConfigurator.configure(System.getProperty("user.dir") + "C:\\Users\\44775\\IdeaProjects\\harrow.gov.uk-PFM\\src\\test\\java\\uk\\gov\\harrow\\resourses\\properties\\log4j.properties");
        PageFactory.initElements(driver, this);
    }

//        PropertyConfigurator.configure(System.setProperty("user.dir"));
//        PageFactory.initElements(driver,this);
//    }
}