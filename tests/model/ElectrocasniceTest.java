package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectrocasniceTest {
    @Test
    public  void descriere(){
        Electrocasnice electrocasnice=new Electrocasnice("1,aspirator,300,4,Kruher,aspirare");
        System.out.println(electrocasnice.descriere());
    }
    @Test
    public  void toSave(){
        Electrocasnice electrocasnice=new Electrocasnice("1,aspirator,300,4,Kruher,aspirare");
        System.out.println(electrocasnice.toSave());
    }
}