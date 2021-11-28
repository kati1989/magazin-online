package controller;

import model.Orders;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerOrdersTest {
    private ControllerOrders controllerOrders;

    @BeforeEach
    public  void preconditie(){
        controllerOrders=new ControllerOrders("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orders.txt");
    }

    @Test
    public  void load(){
        controllerOrders=new ControllerOrders("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orders.txt");
controllerOrders.afiseaza();
    }

    @Test
    public  void adauga(){
        controllerOrders=new ControllerOrders("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orders.txt");
        Orders orders1=new Orders("2,43000,Luceafarul nr 3");
        controllerOrders.adauga(orders1);
        controllerOrders.saveFisier();
        controllerOrders.stergeOrder(2);
        controllerOrders.saveFisier();
        controllerOrders.afiseaza();
    }



    @Test
    public  void updateAmmount(){
        controllerOrders=new ControllerOrders("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orders.txt");
        Orders orders1=new Orders("2,43000,Luceafarul nr 3");
        controllerOrders.adauga(orders1);
        controllerOrders.saveFisier();
        controllerOrders.updateAmmount(2,5400);
        controllerOrders.saveFisier();
    }
    @Test

    public  void isOrdes(){
        controllerOrders=new ControllerOrders("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orders.txt");
        System.out.println(controllerOrders.isOrders(1));
    }

    @Test
    public  void returnOrders(){
        controllerOrders=new ControllerOrders("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orders.txt");
        System.out.println(controllerOrders.returnOrders(1).descriere());
    }

}

/*



    @Test
    public void load() {
        controllerOrderDetails=new ControllerOrderDetails("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orderDetails.txt");

        OrderDetails orderDetail1=new OrderDetails("9,1,1,10000,2");
        OrderDetails orderDetails2=new OrderDetails("10,2,2,1300,3");
        controllerOrderDetails.adauga(orderDetail1);
        controllerOrderDetails.adauga(orderDetails2);
        controllerOrderDetails.afiseza();

    }*/