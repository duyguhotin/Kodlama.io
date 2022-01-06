package Concrete;

import Abstract.CampaignService;
import Entitites.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + 
				" : Sisteme Eklendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + 
				" : Sistemde Güncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + 
				" : Sistemden Silindi");
		
	}

}
