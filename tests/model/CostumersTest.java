package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostumersTest {

    @Test
    void descriere() {
        Costumers costumers=new Costumers("1,test_12@yahoo.com,123,Tatar Silviu,Dezrobirii 4");
        System.out.println(costumers.descriere());
    }

    @Test
    void toSave() {
        Costumers costumers=new Costumers("1,test_12@yahoo.com,123,Tatar Silviu,Dezrobirii 4");
        System.out.println(costumers.toSave());
    }
}