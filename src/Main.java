import datagrams.Datagrams;
import datagrams.Modes;

public class Main {

    public static void main(String[] args) {

       int in=999, out=1001, serv=998;
       if (args.length == 0) {
           in = 1001;
           out = 999;
           serv = 1000;
       }
      /* System.out.println("in: " + in);
       System.out.println("out: " + out);*/
       Datagrams server = Datagrams.getInstance(Modes.Server, serv, out);
       Datagrams client = Datagrams.getInstance(Modes.Client, serv, in);
        try {
            server.join();
            client.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
