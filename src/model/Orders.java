package model;
//order=rendeles,ammount==osszeg
public class Orders {
    private int id;
    //penz osszeg
    private int ammount;
    //kiszallitasi cim
    private String  shippingAddress;

    public Orders(int id,int ammount,String shippingAddress){
        this.id=id;
        this.ammount=ammount;
        this.shippingAddress=shippingAddress;
    }
    public Orders(String proprietati){
        this.id=Integer.parseInt(proprietati.split(",")[0]);
        this.ammount=Integer.parseInt(proprietati.split(",")[1]);
        this.shippingAddress=proprietati.split(",")[2];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String descriere(){
        String desc="";
        desc+="\nId: "+id+"\nAmmount: "+ammount+"\nShipping Adress: "+shippingAddress;
        return  desc;
    }

    public String toSave(){
        String text="";
        text+=id+","+ammount+","+shippingAddress;
        return  text;
    }
}
