package homework.steps;

import homework.pages.HomePage;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class HomePageSteps {

    HomePage homePage;

    @Step
    public HomePageSteps open_home_page(){

        homePage.open();
        return this;
    }

    @Step
    public HomePageSteps click_to_sign_up_button(){

        homePage.clickSignUpBtn();
        return this;
    }

    @Step
    public HomePageSteps assert_user_can_signed_up(String userName) {

        assertThat(homePage.userLink.getText(), equalTo(userName));
        return this;
    }
}
