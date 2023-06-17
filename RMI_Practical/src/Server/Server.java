package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends ImpmyFirst {
    public Server(){}

    public static void main(String[] args) {
        try{
            ImpmyFirst obj1 = new ImpmyFirst();

            MyFirst stub = (MyFirst) UnicastRemoteObject.exportObject(obj1,0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("myFirst",stub);
            System.err.println("Server.Server Ready");

        }catch (Exception e){
            System.err.println("Server.Server Exception "+e.toString());
            e.printStackTrace();
        }
    }
}
