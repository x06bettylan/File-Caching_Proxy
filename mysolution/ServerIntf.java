import java.rmi.Remote;
import java.io.*;
import java.rmi.RemoteException;

public interface ServerIntf extends Remote {
	public String HelloWorld() throws RemoteException; //RemoteException;
	public ServerData open(String path, int o, int proxy_version, int maxlen) throws RemoteException;
	public boolean write(String path, byte buf[]) throws RemoteException;
	public boolean unlink(String path) throws RemoteException;
}