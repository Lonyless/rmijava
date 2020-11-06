/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.*;
import java.rmi.server.*;
import java.net.*;

public class servidor 
        extends UnicastRemoteObject
        implements Hello {
    /**
     * Construtor
     */
    public servidor() throws RemoteException{
        super();
    }
    /**
     * Método remoto
     */
    @Override
    public String sayHello() throws RemoteException {
        return("Oi cliente");
    }
    
    public static void main(String args[]){
        System.setProperty("java.rmi.server.hostname","10.1.2.237");
        try{
            servidor serv = new servidor();
            // Registra nome do servidor
            Naming.rebind("ServidorHello", serv);
            System.out.println("Servidor remoto pronto.");
        }
        catch(RemoteException e){
            System.out.println("Exceção remota: " + e);
        }
        catch(MalformedURLException e){}
    }
}