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

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

@Narrative(text={"",
        "",
        ""})
@RunWith(SerenityRunner.class)
public class CampaignTest {

    //@Managed(driver = "chrome")
    @Managed(clearCookies = BeforeEachTest)
    WebDriver driver;

    @Steps
    HomePageSteps homePageFunctions;

    @Steps
    MemberShipSteps memberShipActions;

    @Steps
    CampaignPageSteps campaignPageActions;

    @Before
    public void beforeTest(){

        homePageFunctions.open_Home_Page();
    }

    @Test
    @Title("Sign Up")
    public void signUp(){

        homePageFunctions.sign_Up_Button();
        memberShipActions.fill_In_Sign_Up_Form();
        homePageFunctions.validate_Sign_Up("Test User");
        campaignPageActions.open_Campaign_Page();
        campaignPageActions.list_Last_Campaign_From_Categories();
    }
}
