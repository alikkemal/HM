package homework.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://qa.n11.com/uye-ol")
public class MemberShip extends PageObject {

    @CacheLookup
    @FindBy(id="firstName")
    public WebElementFacade Firstname;

    @CacheLookup
    @FindBy(id="lastName")
    public WebElementFacade Lastname;

    @CacheLookup
    @FindBy(id="registrationEmail")
    public WebElementFacade Email;

    @CacheLookup
    @FindBy(id="registrationPassword")
    public WebElementFacade Password;

    @CacheLookup
    @FindBy(id="passwordAgain")
    public WebElementFacade OnceAgain;

    @CacheLookup
    @FindBy(id="phoneNumber")
    public WebElementFacade Phonenumber;

    @CacheLookup
    @FindBy(xpath = "//*[@for='genderMale']")
    public WebElementFacade Gender;

    @CacheLookup
    @FindBy(id="birthDay")
    public WebElementFacade Birthday;

    @CacheLookup
    @FindBy(id="birthMonth")
    public WebElementFacade BirthMonth;

    @CacheLookup
    @FindBy(id="birthYear")
    public WebElementFacade BirthYear;

    @CacheLookup
    @FindBy(id = "acceptContract")
    public WebElementFacade AcceptContract;

    @CacheLookup
    @FindBy(xpath = "//*[@for='sendPromotionalMailAndSms']")
    public WebElementFacade SendPromEmail;

    @CacheLookup
    @FindBy(id="submitButton")
    public WebElementFacade SubmitBtn;

    @CacheLookup
    @FindBy(id="captchaText")
    public WebElementFacade Captcha;


    public void txtFirstname(String firstName) {

        Firstname.typeAndEnter(firstName);
    }

    public void txtLastname(String lastName) {

        Lastname.typeAndEnter(lastName);
    }

    public void txtEmailAddress(String email) {

        Email.typeAndEnter(email);
    }

    public void txtPassword(String password) {

        Password.typeAndEnter(password);
    }

    public void txtAgainPassword(String onceAgain) {

        OnceAgain.typeAndEnter(onceAgain);
    }

    public void txtPhoneNumber(String phoneNumber) {

        Phonenumber.typeAndEnter(phoneNumber);
    }

    public void clickGenderBtn() {

        Gender.click();
    }

    public void enterBirthdayDate(String birthDay, String birthMonth, String birthYear) {

        Birthday.selectByValue(birthDay);
        BirthMonth.selectByValue(birthMonth);
        BirthYear.selectByValue(birthYear);
    }

    public void acceptAgreement() {

        AcceptContract.click();
    }

    public void clickSmsApproval() {

        SendPromEmail.click();
    }

    public void clickSbmBtn() {

        SubmitBtn.click();
    }
}
