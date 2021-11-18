package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevizorTest {
    @Test
    public  void descriere(){
        Televizor televizor=new Televizor("1,Philips,3000,2,127inch,android");
        System.out.println(televizor.descriere());
    }
    @Test
    public  void toSave(){
        Televizor televizor=new Televizor("1,Philips,3000,2,127inch,android");
        System.out.println(televizor.toSave());
    }

}

   // public Televizor(int id,String name,int price,int stock,String dimensiune,String sistemDeOperare){
