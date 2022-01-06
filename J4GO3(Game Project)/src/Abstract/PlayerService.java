package Abstract;

import java.rmi.RemoteException;

import Entitites.Player;

public interface PlayerService {

	void add(Player player) throws NumberFormatException, RemoteException;
	void update(Player player) throws NumberFormatException, RemoteException;
	void delete(Player player) throws NumberFormatException, RemoteException;
}
