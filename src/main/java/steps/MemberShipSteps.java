package steps;

import pages.HomePage;
import pages.MemberShip;
import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.RandomStringUtils;


public class MemberShipSteps {

    MemberShip membership;
    HomePage homePage;

    @Step
    public void enterFirstName(String firstName){

        membership.txtFirstname(firstName);
    }

    @Step
    public void enterLastName(String lastName){

        membership.txtLastname(lastName);
    }

    @Step
    public void enterEmailAddress(String email){

        membership.txtEmailAddress(email);
    }

    @Step
    public void identifyPassword(String password){

        membership.txtPassword(password);
    }

    @Step
    public void verifyPassword(String onceAgain){

        membership.txtAgainPassword(onceAgain);
    }

    @Step
    public void enterPhoneNumber(String phoneNumber){

        membership.txtPhoneNumber(phoneNumber);
    }

    @Step
    public void enterCaptcha(){

        membership.Captcha.sendKeys("N11");
    }

    @Step
    public void selectGender(){

        membership.clickGenderBtn();
    }

    @Step
    public void dateOfBirth(String birthDay, String birthMonth, String birthYear){

        membership.enterBirthdayDate(birthDay,birthMonth,birthYear);
    }

    @Step
    public void acceptMemberAgreement(){

        membership.acceptAgreement();
    }

    @Step
    public void clickSmsBtn(){

        membership.clickSmsApproval();
    }

    @Step
    public void clickSubmitBtn(){

        membership.clickSbmBtn();
    }

    public HomePage fill_in_sign_up_form(){

     final String random = RandomStringUtils.randomAlphanumeric(10);

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
