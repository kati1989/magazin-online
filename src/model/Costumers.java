package model;

import java.util.SortedMap;

public class Costumers {
    public int id;
    public String email;
    public  String password;
    public String fullName;
    public String billingAdress;//szamlazasi cim

    public Costumers(){}
    public Costumers(int id, String email, String password, String fullName, String billingAdress){
        this.id=id;
        this.email=email;
        this.password=password;
        this.fullName=fullName;
        this.billingAdress=billingAdress;
    }
    public Costumers(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.email=proprietati.split(",")[1];
        this.password=proprietati.split(",")[2];
        this.fullName=proprietati.split(",")[3];
        this.billingAdress=proprietati.split(",")[4];

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBillingAdress() {
        return billingAdress;
    }

    public void setBillingAdress(String billingAdress) {
        this.billingAdress = billingAdress;
    }

    public String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nEmail: "+email+"\nPassword: "+password+"\nFull Name: "+fullName+"\nBiling Adress: "+billingAdress;
        return  desc;
    }

    public String toSave(){

        String text="";
        text+=id+","+email+","+password+","+fullName+","+billingAdress;
        return  text;
    }
}
