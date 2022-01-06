package Abstract;




import java.rmi.RemoteException;

import Entitites.Player;

public interface PersonalIdentityCheckService {

	
	boolean CheckIfRealPerson(Player player) throws NumberFormatException, RemoteException;
	
	
}
