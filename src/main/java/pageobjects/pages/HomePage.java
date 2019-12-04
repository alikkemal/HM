package pageobjects.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://qa.n11.com/")
public class HomePage extends PageObject {

    @FindBy(className = "btnSignUp")
    public WebElementFacade clickSignUp;

    @FindBy(xpath = "//a[@class='menuLink user']")
    public WebElementFacade userLink;


    public void clickSignUpBtn(){

        clickSignUp.click();
    }
}
