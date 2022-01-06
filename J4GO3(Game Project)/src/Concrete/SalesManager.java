package Concrete;

import Abstract.GameSalesService;
import Entitites.Campaign;
import Entitites.Game;
import Entitites.Player;

public class SalesManager implements GameSalesService{

	@Override
	public void sell(Game game, Player player, Campaign campaign) {
		
		double lastPrice = game.getPrice() - ((game.getPrice() * campaign.getDiscount())/100);  
		
		System.out.println("Player Name : " + player.getPlayerName());
		System.out.println("Game Name : " + game.getGameName());
		System.out.println("Game Price : " + game.getPrice());
		System.out.println("Campaign Name : " + campaign.getCampaignName());
		System.out.println("Campaign Discount : %" + campaign.getDiscount());
		System.out.println("Last Price : " + lastPrice);
	}

	public void sell(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
	
	
}
