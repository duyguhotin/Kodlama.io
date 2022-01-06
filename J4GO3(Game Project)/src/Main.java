import java.rmi.RemoteException;

import Abstract.PersonalIdentityCheckService;
import Abstract.PlayerService;
import Adapters.MernisServiceAdapter;
import Concrete.PlayerManager;
import Concrete.SalesManager;
import Entitites.Campaign;
import Entitites.Game;
import Entitites.Player;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Player player = new Player(1, "Duygu", "Hotin", "46867724970", 1999, "Dhotin");
		Game game = new Game(1, "GTA 5", 88.98);
		Campaign campaign = new Campaign(2, "Yarýsýna", 50);
		
		PlayerService pService = new PlayerManager(new MernisServiceAdapter());
		pService.add(player);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sell(game, player, campaign);		
	}

}
