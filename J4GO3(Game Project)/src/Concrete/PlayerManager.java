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
							   " kullan�c� ismi ile kay�t oldu");
		}else {
			System.out.println("Kay�t ba�ar�s�z. \n Bilgileri eksik ya da hatal� girdiniz.");
		}
		
	}

	@Override
	public void update(Player player) throws NumberFormatException, RemoteException {
		
		System.out.println(player.getPlayerName() + 
							" kullan�c�s� g�ncellendi");
		
	}

	@Override
	public void delete(Player player) throws NumberFormatException, RemoteException {
		
		System.out.println(player.getId()+
					" Numaral� " +
					player.getFirstName() + 
					" Kullan�c�s� Sistemden Silindi");
		
	}
	

	
}
