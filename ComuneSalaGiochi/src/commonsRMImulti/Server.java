package commonsRMImulti;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote {
	public void termina() throws RemoteException;
	//public InfoUtenti getInfoUtenti() throws RemoteException;
}
