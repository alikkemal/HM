package pageobjects.steps;

import pageobjects.pages.HomePage;
import pageobjects.pages.MemberShip;
import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.RandomStringUtils;


public class MemberShipSteps {

    MemberShip membership;
    HomePage homePage;

    @Step("Member will be enter firstname")
    public void enterFirstName(String firstName){

        membership.txtFirstname(firstName);
    }

    @Step("Member will be enter lastname")
    public void enterLastName(String lastName){

        membership.txtLastname(lastName);
    }

    @Step("Member will be enter email address")
    public void enterEmailAddress(String email){

        membership.txtEmailAddress(email);
    }

    @Step("Member will be enter password")
    public void identifyPassword(String password){

        membership.txtPassword(password);
    }

    @Step("Member will be enter verify password")
    public void verifyPassword(String onceAgain){

        membership.txtAgainPassword(onceAgain);
    }

    @Step("Member will be enter phone number")
    public void enterPhoneNumber(String phoneNumber){

        membership.txtPhoneNumber(phoneNumber);
    }

    @Step("Member will be select gender")
    public void selectGender(){

        membership.clickGenderBtn();
    }

    @Step("Member will be enter date of birth")
    public void dateOfBirth(String birthDay, String birthMonth, String birthYear){

        membership.enterBirthdayDate(birthDay,birthMonth,birthYear);
    }

    @Step("Member will be accept agreement")
    public void acceptMemberAgreement(){

        membership.acceptAgreement();
    }

    @Step("Member will be click notification permission")
    public void clickSmsBtn(){

        membership.clickSmsApproval();
    }

    @Step("Member will be enter to intended capthca character before register on website")
    public void enterCaptcha(){

        membership.Captcha.sendKeys("N11");
    }

    @Step("Member will be click to submit register information")
    public void clickSubmitBtn(){

        membership.clickSbmBtn();
    }

    public HomePage fill_in_sign_up_form(){

     final String random = RandomStringUtils.randomAlphanumeric(7);

        enterFirstName("Test");
        enterLastName("User");
        enterEmailAddress("automation_user_" + random + "@pismail.com");
        identifyPassword("123qwe");
        verifyPassword("123qwe");
        enterPhoneNumber("5610616161");
        selectGender();
        dateOfBirth("1","1","1988");
        acceptMemberAgreement();
        clickSmsBtn();
        enterCaptcha();
        clickSubmitBtn();

        return homePage;
    }

}
