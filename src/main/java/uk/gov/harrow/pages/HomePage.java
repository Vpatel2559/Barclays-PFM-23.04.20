package uk.gov.harrow.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.harrow.utility.Utility;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class HomePage extends Utility {

    //private static final Logger Log = LogManager.getLogger(HomePage.class.getName());
    private  static  final Logger log = LogManager.getLogger(HomePage.class.getName());

    // List of elements and locators

@FindBy(css = "body.one-column.index-modular:nth-child(2) header.site-header:nth-child(2) div.container nav.nav.nav--primary-navigation div.navigation-buttons ul.list.list--inline li.list__item.list__item--account:nth-child(1) a.button.button--reset.button--icon > span.icon-fallback")
    WebElement _loginLink;

@FindBy(xpath = "//span[@class='button__text'][contains(text(),'Services')]")
    WebElement _servicesBtn;

    public void clickOnLoginLink() {
        Reporter.log("clicking on login link" + _loginLink.toString() + "<br>");
        // <br> is to brake line
        clickOnElement(_loginLink);
        log.info("clicking on login link" + _loginLink.toString());

    }

    public void clickonservicesBtn(){
        Reporter.log("click on servicesBtn" + _servicesBtn.toString() + "<br>");
        // <br> is to brake line
        clickOnElement(_servicesBtn);
        // using web element method from utility for log 4j
        log.info("click on servicesBtn" + _servicesBtn.toString());

    }


}
