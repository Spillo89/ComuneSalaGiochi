package commonsRMI;

import java.rmi.*;

public interface Server extends Remote { 
	public String sayHello(Callback clientIntance) throws RemoteException;
} 
