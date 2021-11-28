package controller;

import model.OrderDetails;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerOrderDetailsTest {
    private ControllerOrderDetails controllerOrderDetails;
    @BeforeEach
            public void precoditie(){
        controllerOrderDetails=new ControllerOrderDetails("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orderDetails.txt");
    }



    @Test
    public void load() {
        controllerOrderDetails=new ControllerOrderDetails("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orderDetails.txt");

        OrderDetails orderDetail1=new OrderDetails("9,1,1,10000,2");
        OrderDetails orderDetails2=new OrderDetails("10,2,2,1300,3");
        controllerOrderDetails.adauga(orderDetail1);
        controllerOrderDetails.adauga(orderDetails2);
        controllerOrderDetails.afiseza();

    }
    @Test
    public void poz() {
        controllerOrderDetails=new ControllerOrderDetails("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orderDetails.txt");

        OrderDetails orderDetail1=new OrderDetails("9,1,1,10000,2");
        OrderDetails orderDetails2=new OrderDetails("10,2,2,1300,3");
        controllerOrderDetails.adauga(orderDetail1);
        controllerOrderDetails.adauga(orderDetails2);
        //controllerOrderDetails.saveFisier();
        System.out.println(controllerOrderDetails.poz(10));

    }

    @Test
    public void sterge() {
        controllerOrderDetails=new ControllerOrderDetails("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orderDetails.txt");

     controllerOrderDetails.stergeOrderDetail(10);
     controllerOrderDetails.saveFisier();

    }

    @Test
    public void updatePrice() {
        controllerOrderDetails=new ControllerOrderDetails("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orderDetails.txt");

        controllerOrderDetails.updatePrice(1,4444);
        controllerOrderDetails.saveFisier();

    }

    @Test
    public void isOrderDetail() {
        controllerOrderDetails=new ControllerOrderDetails("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orderDetails.txt");


        System.out.println(controllerOrderDetails.isOrderDetail(3));

    }

    @Test
    public void returnOrderDetail() {
        controllerOrderDetails=new ControllerOrderDetails("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\orderDetails.txt");


        System.out.println(controllerOrderDetails.returnOrderDetail(1).descriere());

    }
}