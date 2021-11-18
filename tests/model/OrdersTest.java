package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdersTest {

    @Test
    void descriere() {
        Orders orders=new Orders("1,300,Liviu Rebreanu 3");
        System.out.println(orders.descriere());
    }

    @Test
    void toSave() {
        Orders orders=new Orders("1,300,Liviu Rebreanu 3");
        System.out.println(orders.toSave());
    }
}