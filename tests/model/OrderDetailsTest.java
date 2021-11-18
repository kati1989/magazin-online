package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderDetailsTest {

    @Test
    void descriere() {
        OrderDetails orderDetails=new OrderDetails("1,1,1,300,3");
        System.out.println(orderDetails.descriere());
    }

    @Test
    void toSave() {
        OrderDetails orderDetails=new OrderDetails("1,1,1,300,3");
        System.out.println(orderDetails.toSave());
    }
}