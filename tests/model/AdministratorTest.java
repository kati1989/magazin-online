package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministratorTest {

    @Test
    void descriere() {
        Administrator administrator=new Administrator("1,test,123,Raducu Carol,Liviu Rebr,televizor");
        System.out.println(administrator.descriere());
    }

    @Test
    void toSave() {
        Administrator administrator=new Administrator("1,test,123,Raducu Carol,Liviu Rebr,televizor");
        System.out.println(administrator.toSave());
    }
}