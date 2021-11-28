package controller;

import model.OrderDetails;
import model.Orders;
import model.Products;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerOrderDetails {
    ArrayList<OrderDetails>orderDetails;

    private String cale;

    public ControllerOrderDetails(String cale){
        orderDetails=new ArrayList<>();

        this.cale=cale;
        load();
    }

    public void load(){
        File file=new File(cale);
        try{
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                orderDetails.add(new OrderDetails(line));
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public  void afiseza(){
        for (int i=0;i<orderDetails.size();i++){
            System.out.println(orderDetails.get(i).descriere());
        }
    }

    public void adauga(OrderDetails oD){
        orderDetails.add(oD);

    }

    public int poz(int id){
        for(int i=0;i<orderDetails.size();i++){
            if(orderDetails.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }

    public String toSave(){
        String text="";
        for(int i=0;i<orderDetails.size();i++){
            text+=orderDetails.get(i).toSave()+"\n";
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

    public void stergeOrderDetail(int id){
        for (int i=0;i<orderDetails.size();i++){
            if(orderDetails.get(i).getId()==id){
                orderDetails.remove((orderDetails).get(i));
            }
        }
    }
    public void updatePrice(int id,int price){
        for(int i=0;i<orderDetails.size();i++){
            if(orderDetails.get(i).getId()==id){
                orderDetails.get(i).setPrice(price);
            }
        }
    }
    public  boolean isOrderDetail(int id){
        for (int i=0;i< orderDetails.size();i++){
            if(orderDetails.get(i).getId()==id)
                return true;
        }
        return false;
    }

    public OrderDetails returnOrderDetail(int id){
        for(int i=0;i<orderDetails.size();i++){
            if(orderDetails.get(i).getId()==id){
                return orderDetails.get(i);
            }
        }
        return null;
    }

    public void stergereCommandaCuProdus(int orderId, int productId) {
        for(int i=0;i<orderDetails.size();i++){
            if(orderDetails.get(i).getOrderId()==orderId && orderDetails.get(i).getProductId() ==productId ){
                 orderDetails.remove(i);
            }
        }
    }
}
