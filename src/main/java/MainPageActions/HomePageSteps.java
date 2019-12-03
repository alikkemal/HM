package MainPageActions;

import MainPage.HomePage;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class HomePageSteps {

    HomePage homePage;

    @Step
    public HomePageSteps open_Home_Page(){

        homePage.open();
        return this;
    }

    @Step
    public HomePageSteps sign_Up_Button(){

        homePage.clickSignUpBtn();
        return this;
    }

    @Step
    public HomePageSteps validate_Sign_Up(String userName) {

        assertThat(homePage.userLink.getText(), equalTo(userName));
        return this;
    }
}
