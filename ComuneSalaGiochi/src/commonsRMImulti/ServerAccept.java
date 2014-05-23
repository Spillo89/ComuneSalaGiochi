package commonsRMImulti;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerAccept extends Remote {
	public Server login(String name, Client client) throws RemoteException;
}
