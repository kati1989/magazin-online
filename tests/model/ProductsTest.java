package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void descriere() {
        Products products=new Products("1,televizor,1000,1");
        System.out.println(products.descriere());
    }


    @Test
    void toSave() {
        Products products=new Products("1,televizor,1000,1");
        System.out.println(products.toSave());
    }
}