package rmi;

import java.rmi.*;

public class cliente {

    public static void main(String args[]) {
        try {
            servidor serv = (servidor) Naming.lookup("rmi://10.1.2.237:2048/ServidorHello");
            String retorno = serv.sayHello();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
