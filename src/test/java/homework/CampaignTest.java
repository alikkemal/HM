package homework;

import homework.steps.HomePageSteps;
import net.thucydides.core.annotations.*;
import homework.steps.CampaignPageSteps;
import homework.steps.MemberShipSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

@RunWith(SerenityRunner.class)
public class CampaignTest {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    MemberShipSteps memberShipSteps;

    @Steps
    CampaignPageSteps campaignPageSteps;

    @Before
    public void beforeTest(){

        homePageSteps.open_home_page();
    }

    @Test
    @Title("New member will be create every run test and will be write campaign information over created member")
    public void signUp() throws IOException {

        homePageSteps.click_to_sign_up_button();
        memberShipSteps.fill_in_sign_up_form();
        homePageSteps.assert_user_can_signed_up("Test User");
        campaignPageSteps.open_campaign_page();
        campaignPageSteps.write_campaign_names_from_categories_to_excel();
    }
}
