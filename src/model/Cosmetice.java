package model;

public class Cosmetice extends Products {
    private String culoare;
    private int varsta;

    public Cosmetice(){}
    public Cosmetice(int id,String name,int price,int stock,String culoare,int varsta){
        super(id,name,price,stock);
        this.culoare=culoare;
        this.varsta=varsta;
    }
    public  Cosmetice(String proprietati){
        super(Integer.parseInt(proprietati.split(",")[0]),proprietati.split(",")[1],Integer.parseInt(proprietati.split(",")[2]),Integer.parseInt(proprietati.split(",")[3]));
        this.culoare=proprietati.split(",")[4];
        this.varsta=Integer.parseInt(proprietati.split(",")[5]);
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    @Override
    public String descriere(){
        String desc="";
        desc+="\nId: "+super.getId()+"\nName: "+super.getName()+"\nPrice: "+super.getPrice()+"\nStock: "+getStock()+"\nCuloare: "+culoare+"\nVarsta:  "+varsta;
        return  desc;
    }

    @Override

    public String toSave(){
        String text="";
        text+=super.getId()+","+super.getName()+","+super.getPrice()+","+super.getStock()+","+culoare+","+varsta;
        return text;

    }
}
