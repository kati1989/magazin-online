package controller;

import model.Client;
import model.Costumers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerCostumersTest {
    private ControllerCostumers controllerCostumers;

    @BeforeEach
    public void preconditie(){
        controllerCostumers=new ControllerCostumers("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\costumers.txt");
    }

    @Test
    public  void load(){
        controllerCostumers=new ControllerCostumers("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\costumers.txt");

        controllerCostumers.afiseaza();
    }
    @Test
    public  void adauga(){
        controllerCostumers=new ControllerCostumers("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\costumers.txt");
        Costumers c=new Client("10,qlin@yahoo.com,123,client,Luceafarul 2,3");
        controllerCostumers.adauga(c);
        controllerCostumers.saveFisier();

    }

    @Test
    public  void poz(){
        controllerCostumers=new ControllerCostumers("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\costumers.txt");

        System.out.println(controllerCostumers.poz(1));
    }


    @Test
    public  void sterge(){
        controllerCostumers=new ControllerCostumers("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\costumers.txt");
        Costumers c=new Client("20,test@yahoo.com,123,client,Luceafarul 2,3");
        controllerCostumers.adauga(c);
        controllerCostumers.saveFisier();
        controllerCostumers.stergeCostumers(20);
        controllerCostumers.saveFisier();
    }

    @Test
    public  void updateBilligAdress(){
        controllerCostumers=new ControllerCostumers("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\costumers.txt");
        Costumers c=new Client("20,test@yahoo.com,123,client,Luceafarul 2,3");
        controllerCostumers.adauga(c);
        controllerCostumers.saveFisier();
        controllerCostumers.updateBillingAdress(20,"test");
        controllerCostumers.saveFisier();
    }

    @ Test
    public  void isCostumer(){
        controllerCostumers=new ControllerCostumers("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\costumers.txt");
        System.out.println(controllerCostumers.isCostumer(20));
    }

    @ Test
    public  void returnCostumer(){
        controllerCostumers=new ControllerCostumers("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\costumers.txt");
        System.out.println(controllerCostumers.returnCostumer(20).descriere());
    }


}
/*

*/