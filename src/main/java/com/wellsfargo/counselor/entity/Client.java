package com.wellsfargo.counselor;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    private int ClientID;
    private int ClientInfo;
    private String ClientName;

    public Client(){}

    public int getClientID(){
        return ClientID;
    }

    public void setClientID(int ClientID){
        this.ClientID = ClientID;
    }


    public int getClientInfo(int ClientInfo) {
        return ClientInfo;
    }
    public void setClientInfo(int ClientInfo){
        this.ClientInfo = ClientInfo;
    }

    public String getClientName(String ClientName){
        return ClientName;
    }

    public void setClientName(String ClientName){
        this.ClientName = ClientName;
    }

}
