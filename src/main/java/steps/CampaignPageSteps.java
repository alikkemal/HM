package steps;

import pages.CampaignPage;
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
    public CampaignPageSteps list_last_campaign_from_categories() throws IOException {

        campaignPage.listAndWriteCampaign();
        return this;
    }
}
