package steps;

import pages.CampaignPage;
import net.thucydides.core.annotations.Step;


public class CampaignPageSteps {

    CampaignPage campaignPage;

    @Step
    public CampaignPageSteps open_Campaign_Page() {

        campaignPage.openCampaign();
        return this;
    }

    @Step
    public CampaignPageSteps list_Last_Campaign_From_Categories() {

        campaignPage.listAndWriteCampaign();
        return this;
    }
}
