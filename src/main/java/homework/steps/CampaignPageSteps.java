package homework.steps;

import homework.pages.CampaignPage;
import net.thucydides.core.annotations.Step;

import java.io.IOException;


public class CampaignPageSteps {

    CampaignPage campaignPage;

    @Step
    public CampaignPageSteps open_campaign_page() {

        campaignPage.openCampaign();
        return this;
    }

    @Step
    public CampaignPageSteps write_campaign_names_from_categories_to_excel() throws IOException {

        campaignPage.listAndWriteCampaign();
        return this;
    }
}
