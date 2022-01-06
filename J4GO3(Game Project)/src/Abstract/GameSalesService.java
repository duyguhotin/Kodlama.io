package Abstract;

import Entitites.Campaign;
import Entitites.Game;
import Entitites.Player;

public interface GameSalesService {

	

	void sell(Game game, Player player, Campaign campaign);
	
}
