package model;

public class Televizor  extends Products{
    private String dimensiune;
    private String sistemDeOperare;

    public Televizor(){}
    public Televizor(int id,String name,int price,int stock,String dimensiune,String sistemDeOperare){
        super(id,name,price,stock);
        this.dimensiune=dimensiune;
        this.sistemDeOperare=sistemDeOperare;

    }
    public Televizor(String proprietati){
        super(Integer.parseInt(proprietati.split(",")[0]),proprietati.split(",")[1],Integer.parseInt(proprietati.split(",")[2]),Integer.parseInt(proprietati.split(",")[3]));
        this.dimensiune=proprietati.split(",")[4];
        this.sistemDeOperare=proprietati.split(",")[5];
    }

    public String getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(String dimensiune) {
        this.dimensiune = dimensiune;
    }

    public String getSistemDeOperare() {
        return sistemDeOperare;
    }

    public void setSistemDeOperare(String sistemDeOperare) {
        this.sistemDeOperare = sistemDeOperare;
    }

    @Override
    public String descriere(){
        String desc="";
        desc+="\nId: "+super.getId()+"\nName: "+super.getName()+"\nPrice: "+super.getPrice()+"\nStock: "+getStock()+"\nDimensiune: "+dimensiune+"\nSistem de operare:  "+sistemDeOperare;
        return  desc;
    }

    @Override

    public String toSave(){
        String text="";
        text+=super.getId()+","+super.getName()+","+super.getPrice()+","+super.getStock()+","+dimensiune+","+sistemDeOperare;
        return text;

    }
}
