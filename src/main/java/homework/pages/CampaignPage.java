package homework.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import homework.utils.ReadWriteXls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@DefaultUrl("https://qa.n11.com/kampanyalar")
public class CampaignPage extends PageObject {

    @FindBy(xpath = "//section[not(@data-category='tumu')]")
    public List<WebElementFacade> allCategoriesList;

    @FindBy(xpath = "//*[@title='Kampanyalar']")
    public WebElementFacade campaigns;

    public void openCampaign() {

        campaigns.click();
    }

    public void listAndWriteCampaign() throws IOException {
        List<String> allTitles = new ArrayList<>();
        List<String> allBanners = new ArrayList<>();
        for (WebElement eachCategory : allCategoriesList) {
            List<WebElement> allCampaignBanners = new ArrayList<>(eachCategory.findElements(By.xpath("./ul/li")));
            for (int i = 0; i < allCampaignBanners.size() - 1; i++) {
                allTitles.add(allCampaignBanners.get(i).findElement(By.xpath("./a")).getAttribute("title"));
                allBanners.add(allCampaignBanners.get(i).findElement(By.xpath("./a/img")).getAttribute("src"));
            }
        }
        ReadWriteXls writeXLS = new ReadWriteXls();
        writeXLS.writeFile(allBanners, "Banners");
        writeXLS.writeFile(allTitles, "Tittles");
    }
}

