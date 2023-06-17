package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyFirst  extends Remote {
    public abstract Integer doCal(Integer x, Integer y) throws RemoteException;
}
