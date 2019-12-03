package UITest;

import net.thucydides.core.annotations.*;
import steps.CampaignPageSteps;
import steps.HomePageSteps;
import steps.MemberShipSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

@Narrative(text={"",
        "",
        ""})
@RunWith(SerenityRunner.class)
public class CampaignTest {

    @Managed(driver = "chrome")
    //@Managed(clearCookies = BeforeEachTest)
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
    @Title("Sign Up")
    public void signUp() throws IOException {

        homePageSteps.click_to_sign_up_button();
        memberShipSteps.fill_in_sign_up_form();
        homePageSteps.assert_user_can_signed_up("Test User");
        campaignPageSteps.open_campaign_page();
        campaignPageSteps.list_last_campaign_from_categories();
    }
}
