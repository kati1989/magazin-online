package controller;

import model.Administrator;
import model.Client;
import model.Costumers;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCostumers {
    ArrayList<Costumers> costumers;
    private String cale;

    public ControllerCostumers(String cale) {
        costumers = new ArrayList<>();
        this.cale = cale;
        load();

    }

    public void load() {
        File file = new File(cale);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                switch (line.split(",")[3]) {
                    case "administrator":
                        costumers.add(new Administrator(line));
                        break;
                    case "client":
                        costumers.add(new Client(line));
                        break;
                    default:
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afiseaza() {
        for (int i = 0; i < costumers.size(); i++) {
            System.out.println(costumers.get(i).descriere());
        }
    }

    public void adauga(Costumers c) {
        costumers.add(c);
    }

    public int poz(int id) {
        for (int i = 0; i < costumers.size(); i++) {
            if (costumers.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public String toSave() {
        String text = "";
        for (int i = 0; i < costumers.size(); i++) {
            text += costumers.get(i).toSave() + "\n";
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

    public  void stergeCostumers(int id){
        for(int i=0;i<costumers.size();i++){
            if(costumers.get(i).getId()==id){
                costumers.remove(costumers.get(i));
            }
        }
    }

    public void updateBillingAdress(int id,String billingAdress){
        for(int i=0;i<costumers.size();i++){
            if(costumers.get(i).getId()==id)
                costumers.get(i).setBillingAdress(billingAdress);
        }
    }
    public boolean isCostumer(int id){
        for (Costumers c:costumers){
            if(c.getId()==id){
                return true;
            }
        }
        return false;
    }

    public Costumers returnCostumer(int id){
        for (int i=0;i<costumers.size();i++){
            if(costumers.get(i).getId()==id){
                return costumers.get(i);
            }
        }
        return null;
    }
}
