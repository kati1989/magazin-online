package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void descriere() {
        Client client=new Client("1,email,12,Naghi Rebeca,Libertatii 120,10");
        System.out.println(client.descriere());
    }

    @Test
    void toSave() {
        Client client=new Client("1,email,12,Naghi Rebeca,Libertatii 120,10");
        System.out.println(client.toSave());
    }
}