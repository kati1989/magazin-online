package controller;

import model.Cosmetice;
import model.Electrocasnice;
import model.Products;
import model.Televizor;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerProducts {
    ArrayList<Products> products;
    private String cale;

   public ControllerProducts(String cale) {
        products = new ArrayList<>();
        this.cale = cale;
        load();
    }

    public void load() {
        File file = new File(cale);
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                switch (line.split(",")[1]) {
                    case "televizor":
                        products.add(new Televizor(line));
                        break;
                    case "cosmetice":
                        products.add(new Cosmetice(line));
                        break;
                    case "electrocasnice":
                        products.add(new Electrocasnice(line));
                        break;
                    default:
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void  afiseaza(){
        for(int i=0;i< products.size();i++){
            System.out.println(products.get(i).descriere());
        }
    }

    public void adauga(Products p){
        products.add(p);

    }

    public  int poz(int id){
        for(int i=0;i< products.size();i++){
            if(products.get(i).getId()==id){
                return  i;
            }
        }
        return -1;
    }
    public String toSave(){
       String text="";
       for(int i=0;i<products.size();i++){
           text+=products.get(i).toSave()+"\n";
       }
       return  text;
    }



    public void saveFisier(){
       File file=new File(cale);
       try {
           FileWriter w=new FileWriter(file);
           PrintWriter  p=new PrintWriter(w);
           p.print(this.toSave());
           p.close();

       }catch (Exception e){
           e.printStackTrace();
       }
    }
    public void stergeProduct(int id){
       for(int i=0;i<products.size();i++){
           if(products.get(i).getId()==id){
               products.remove(products.get(i));
           }
       }
    }

    public void updateName(int id,String name){
       for(int i=0;i<products.size();i++){
           if(products.get(i).getId()==id){
               products.get(i).setName(name);
           }
       }
    }

    public boolean isProduct(String name){
       for(Products p:products){
           if(p.getName().equals(name))
               return  true;
       }
        return false;
    }

    public Products returnProduct(int productId){
       for(int i=0;i<products.size();i++){
           if(products.get(i).getId()==productId)
           {
               return products.get(i);
           }

       }
       return null;
    }

    public  Products returnProductNume(String nume){
       for(int i=0;i<products.size();i++){
           if(products.get(i).getName().equals(nume)){
               return  products.get(i);
           }
       }
       return  null;
    }

}
