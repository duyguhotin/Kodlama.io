package Concrete;

import java.rmi.RemoteException;

import Abstract.PersonalIdentityCheckService;
import Abstract.PlayerService;
import Entitites.Player;

public class PlayerManager implements PlayerService{

	PersonalIdentityCheckService personalIdentityCheckService;

	
	
	public PlayerManager(PersonalIdentityCheckService personalIdentityCheckService) {
		super();
		this.personalIdentityCheckService = personalIdentityCheckService;
	}

	@Override
	public void add(Player player) throws NumberFormatException, RemoteException {
		if(personalIdentityCheckService.CheckIfRealPerson(player)) {
			System.out.println(player.getFirstName() + " " +
							   player.getLastName() + " : " + 
							   player.getPlayerName() +
							   " kullanýcý ismi ile kayýt oldu");
		}else {
			System.out.println("Kayýt baþarýsýz. \n Bilgileri eksik ya da hatalý girdiniz.");
		}
		
	}

	@Override
	public void update(Player player) throws NumberFormatException, RemoteException {
		
		System.out.println(player.getPlayerName() + 
							" kullanýcýsý güncellendi");
		
	}

	@Override
	public void delete(Player player) throws NumberFormatException, RemoteException {
		
		System.out.println(player.getId()+
					" Numaralý " +
					player.getFirstName() + 
					" Kullanýcýsý Sistemden Silindi");
		
	}
	

	
}
