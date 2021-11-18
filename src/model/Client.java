package model;

public class Client extends Costumers{
    private int nrDeComenzi;

    public Client(){}
    public Client(int id,String email,String password,String fullName,String billigAdress,int nrDeComenzi){
        super(id,email,password,fullName,billigAdress);
        this.nrDeComenzi=nrDeComenzi;

    }

    public Client(String proprietati){
        super(Integer.parseInt(proprietati.split(",")[0]),proprietati.split(",")[1],proprietati.split(",")[2],proprietati.split(",")[3],proprietati.split(",")[4]);
        this.nrDeComenzi=Integer.parseInt(proprietati.split(",")[5]);
    }

    public int getNrDeComenzi() {
        return nrDeComenzi;
    }

    public void setNrDeComenzi(int nrDeComenzi) {
        this.nrDeComenzi = nrDeComenzi;
    }

    @Override
    public String descriere(){
        String desc="";
        desc+="\nId: "+super.getId()+"\nEmail: "+super.getEmail()+"\nPassword: "+super.getPassword()+"\nFull Name: "+super.getFullName()+"\nBilling Adress: "+super.getBillingAdress()+"\nNumar de comenzi: "+nrDeComenzi;
        return  desc;
    }

    @Override
    public  String toSave(){
        String text="";
        text+=super.getId()+","+super.getEmail()+","+super.getPassword()+","+super.getFullName()+","+super.getBillingAdress()+","+nrDeComenzi;
        return text;
    }
}
