package com.company;

import View.ViewClient;
import controller.ControllerCostumers;
import controller.ControllerOrderDetails;
import controller.ControllerProducts;
import model.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public static void main(String[] args) {
//Client client=new Client("1,vali@yahoo.com,123,client,Luceafarul 2,3");
////        System.out.println(client.toSave());
////        Administrator administrator=new Administrator("2,titi@gmail.com,234,administrator,Decebal 1,televizoare");
////        System.out.println(administrator.toSave());
//        Costumers costumers=new Administrator("2,titi@gmail.com,234,administrator,Decebal 1,televizoare");
//        System.out.println(costumers.toSave());

        ViewClient viewClient=new ViewClient();
        viewClient.play();
    }

}
