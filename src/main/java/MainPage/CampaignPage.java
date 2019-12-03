package MainPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


@DefaultUrl("https://www.n11.com/kampanyalar")
public class CampaignPage extends PageObject {

    @FindBy(className = "title")
    public WebElementFacade categoryTitle;

    @FindBys({@FindBy(className = "campPromTab"),})
    public List<WebElementFacade> categorytab;

    @FindBy(xpath = "//*[@title='Kampanyalar']")
    public WebElementFacade campaigns;

    @FindBy(xpath = "//a[@class='imgBoxInsetShadow medium']")
    public List<WebElementFacade> banner;

    public HashMap<String,String> mapList;

    public void openCampaign() {

        campaigns.click();
    }

    public void listAndWriteCampaign() {

        List<String> categories = Arrays.asList("giyimAyakkabi","elektronik","evYasam","anneBebek","kozmetikKisiselBakim","mucevherSaat","spor","kitapOyun","eglence","otomobil");

        for (String eachCategory : categories) {

            List<WebElement> allCampaigns = getDriver().findElements(By.xpath("//*[@data-category='" + eachCategory + "']//a[contains(@class,'imgBoxInsetShadow')]"));
            for (int i=1; i<allCampaigns.size(); i++) {
                int lastCampaigns = allCampaigns.size();
                WebElement beforeLastElement = allCampaigns.get(lastCampaigns-2);
                //for(int i=1; i<beforeLastElement; i++)

                System.out.println("Category :" + eachCategory);
                System.out.println("Title : " + beforeLastElement.getAttribute("title"));
                System.out.println("Src : " + beforeLastElement.findElement(By.xpath("./img")).getAttribute("src"));
            }


        /*List<WebElement> list = categorytab.findElements(By.tagName("li"));
        for (int i=1; i<list.size(); i++) {
            System.out.println(list.get(i).getText());
            list.get(i).click();
            WebElement elem = banner.get(i).findElements(By.tagName("li")).get(banner.get(i).findElements(By.tagName("li")).size()-2);
            String title = elem.findElement(By.tagName("a")).getAttribute("title");
            String bannerImg = elem.findElement(By.tagName("a")).findElement(By.tagName("img")).getAttribute("src");
            mapList.(title,bannerImg);
            }*/

        }
    }
}
