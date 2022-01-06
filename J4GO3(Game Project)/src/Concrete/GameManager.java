package Concrete;

import Abstract.GameService;
import Entitites.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + 
				" Oyunu sisteme eklediniz.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ 
				 " : Oyunu Sistemde Güncellendi ");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + 
					" : Oyunu Sistemden Silindi  ");
		
	}

}
