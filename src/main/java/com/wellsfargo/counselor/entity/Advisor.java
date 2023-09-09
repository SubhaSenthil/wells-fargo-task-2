package com.wellsfargo.counselor;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Advisor {
    @Id
    private int Advisor_ID;
    private String Advisor_name;
    private int Advisor_Info;

    public Advisor(){}


    public int getAdvisor_ID(){
        return Advisor_ID;
    }

    public void setAdvisor_ID(int Advisor_ID){
        this.Advisor_ID= Advisor_ID;
    }

    public String getAdvisor_name(){
        return Advisor_name;
    }
    public void setAdvisor_name(String Advisor_name){
        this.Advisor_name = Advisor_name;
    }

    public int getAdvisor_Info(){
        return Advisor_Info;
    }

    public void setAdvisor_Info(int advisor_Info) {
        Advisor_Info = advisor_Info;
    }
}
