package Client;

import Server.MyFirst;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public Client(){}

    public static void main(String[] args) {
        try {
            Registry registry  = LocateRegistry.getRegistry(null);
            MyFirst stub = (MyFirst) registry.lookup("myFirst");

            Scanner myScan = new Scanner(System.in);
            System.out.println("Enter x: ");
            int x = myScan.nextInt();


            System.out.println("Enter y: ");
            int y = myScan.nextInt();

            int answer = stub.doCal(x,y);
            System.out.println("Answer : "+answer);
            myScan.close();

        }catch (Exception e){
            System.err.println("Client.Client Exception "+e.toString());
            e.printStackTrace();
        }
    }
}
