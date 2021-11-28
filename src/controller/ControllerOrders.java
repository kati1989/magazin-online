package controller;

import model.Orders;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerOrders {
    ArrayList<Orders> orders;
    private String cale;

    public ControllerOrders(String cale) {
        orders = new ArrayList<>();
        this.cale = cale;
        load();
    }

    public void load() {
        File file = new File(cale);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                orders.add(new Orders(line));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afiseaza(){
        for(int i=0;i<orders.size();i++){
            System.out.println(orders.get(i).descriere());
        }
    }

    public void adauga(Orders o){
        orders.add(o);
    }

    public int poz(int id){
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }

    public String toSave(){
        String text="";
        for(int i=0;i<orders.size();i++){
            text+=orders.get(i).toSave()+"\n";
        }
        return text;
    }

    public  void saveFisier(){
        File file=new File(cale);
        try{
            FileWriter w=new FileWriter(file);
            PrintWriter p=new PrintWriter(w);
            p.print(this.toSave());
            p.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void stergeOrder(int id){
        for(int i=0;i< orders.size();i++){
            if(orders.get(i).getId()==id){
                orders.remove(orders.get(i));
            }
        }
    }

    public void updateAmmount(int id,int ammount){
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).getId()==id){
                orders.get(i).setAmmount(ammount);
            }
        }
    }

    public boolean isOrders(int id){
        for(Orders o:orders){
            if(o.getId()==id){
                return  true;
            }
        }
        return  false;
    }

    public Orders returnOrders(int id){
        for (int i=0;i<orders.size();i++){
            if(orders.get(i).getId()==id){
                return orders.get(i);
            }
        }
        return  null;
    }
}

