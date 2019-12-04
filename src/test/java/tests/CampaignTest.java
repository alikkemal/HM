package tests;

import pageobjects.steps.HomePageSteps;
import net.thucydides.core.annotations.*;
import pageobjects.steps.CampaignPageSteps;
import pageobjects.steps.MemberShipSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;


@RunWith(SerenityRunner.class)
public class CampaignTest {

    @Managed(clearCookies=BeforeEachTest)
    WebDriver driver;

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    MemberShipSteps memberShipSteps;

    @Steps
    CampaignPageSteps campaignPageSteps;

    @Before
    public void beforeTest(){

        homePageSteps
                .open_home_page();
    }

    @Test
    @Title("New member will be create every run test and Will be write campaign information over created member")
    public void campaignTest() throws IOException {

        homePageSteps
                .click_to_sign_up_button();
        memberShipSteps
                .fill_in_sign_up_form();
        homePageSteps
                .assert_user_can_signed_up("Test User");
        campaignPageSteps
                .open_campaign_page();
        campaignPageSteps
                .write_campaign_names_from_categories_to_excel();
    }
}
