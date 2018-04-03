import datagrams.Datagrams;
import datagrams.Modes;

public class Main {

    public static void main(String[] args) {

       int inPort=999, outPort=1001, servPort=998;
       if (args.length == 0) {
           inPort = 1001;
           outPort = 999;
           servPort = 1000;
       }
      /* System.outPort.println("inPort: " + inPort);
       System.outPort.println("outPort: " + outPort);*/
       Datagrams server = Datagrams.getInstance(Modes.Server, servPort, outPort);
       Datagrams client = Datagrams.getInstance(Modes.Client, servPort, inPort);
        try {
            server.join();
            client.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
