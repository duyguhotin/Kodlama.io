package Adapters;

import java.rmi.RemoteException;

import Abstract.PersonalIdentityCheckService;
import Entitites.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonalIdentityCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
		return client.TCKimlikNoDogrula(Long.parseLong(player.getNationatilyId()), 
				player.getFirstName(), 
				player.getFirstName(), 
				player.getDateOfBirth());
		} catch(Exception e) { e.printStackTrace();}
		return false;
	}

}
