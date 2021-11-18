package model;

public class Administrator extends Costumers{
    //pe ce product este aministrator
    public String categorie;

    public Administrator(){}
    public  Administrator(int id,String email,String password,String fullName,String billigAdress,String categorie){
        super(id,email,password,fullName,billigAdress);
        this.categorie=categorie;
    }
    public  Administrator(String proprietati){
        super(Integer.parseInt(proprietati.split(",")[0]),proprietati.split(",")[1],proprietati.split(",")[2],proprietati.split(",")[3],proprietati.split(",")[4]);
    this.categorie=proprietati.split(",")[5];
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String descriere(){
        String desc="";
        desc+="\nId: "+super.getId()+"\nEmail: "+super.getEmail()+"\nPassword: "+super.getPassword()+"\nFull Name: "+super.getFullName()+"\nBilling Adress: "+super.getBillingAdress()+"\nCategorie: "+categorie;
        return  desc;
    }
    @Override
    public  String toSave(){
        String text="";
        text+=super.getId()+","+super.getEmail()+","+super.getPassword()+","+super.getFullName()+","+super.getBillingAdress()+","+categorie;
        return text;
    }
}
