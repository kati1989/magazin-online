package controller;

import model.Televizor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerProductsTest {
    private ControllerProducts controllerProducts;

    @BeforeEach
    public void  preconditie(){
        controllerProducts=new ControllerProducts("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\products.txt");
    }

    @Test
    public void load(){
        //preconditie
        Televizor televizor1=new Televizor("1,televizor,2000,2,127inch,linux");
        Televizor televizor2=new Televizor("2,televizor,3000,2,127inch,android");

        //Actiune
        controllerProducts.adauga(televizor1);
        controllerProducts.adauga(televizor2);
        controllerProducts.saveFisier();

//        controllerProducts.load();
        //Rezultatet
        assertEquals(true,controllerProducts.poz(1)!=-1);
        assertEquals(true,controllerProducts.poz(2)!=-1);

        //Postconditie
        controllerProducts.stergeProduct(1);
        controllerProducts.stergeProduct(2);
        controllerProducts.saveFisier();
        controllerProducts.load();

        assertEquals(false,controllerProducts.poz(1)!=-1);
        assertEquals(false,controllerProducts.poz(2)!=-1);


    }

    @Test
    public  void  updateName(){
        Televizor televizor=new Televizor("1,televizor,2000,2,127inch,linux");

        //actiune
        controllerProducts.adauga(televizor);
        controllerProducts.saveFisier();

        //Rezultat
        assertEquals(true,controllerProducts.poz(1)!=-1);

        controllerProducts.updateName(1,"philips");
        controllerProducts.saveFisier();
        assertEquals("philips",televizor.getName());

        //postconditie
        controllerProducts.stergeProduct(1);
        controllerProducts.saveFisier();
        load();

        assertEquals(false,controllerProducts.poz(1)!=-1);
    }

    @Test
    public void isProduct(){
        Televizor televizor=new Televizor("1,televizor,2000,2,127inch,linux");

        controllerProducts.adauga(televizor);
        controllerProducts.saveFisier();

        assertEquals(true,controllerProducts.isProduct("televizor"));

        controllerProducts.stergeProduct(1);
        controllerProducts.saveFisier();
        controllerProducts.load();
        assertEquals(false,controllerProducts.poz(1)!=-1);

    }

    @Test
    public  void returnProduct(){
        Televizor televizor=new Televizor("1,televizor,2000,2,127inch,linux");
        controllerProducts.adauga(televizor);
        controllerProducts.saveFisier();

        assertEquals(true,controllerProducts.poz(1)!=-1);

        System.out.println(controllerProducts.returnProduct(1).descriere());
        controllerProducts.stergeProduct(1);
        controllerProducts.saveFisier();
        controllerProducts.load();
        assertEquals(false,controllerProducts.poz(1)!=-1);


    }


    @Test
    public  void returnProductNume(){
        Televizor televizor=new Televizor("1,televizor,2000,2,127inch,linux");
        controllerProducts.adauga(televizor);
        controllerProducts.saveFisier();

        assertEquals(true,controllerProducts.poz(1)!=-1);

        System.out.println(controllerProducts.returnProductNume("televizor").descriere());
        controllerProducts.stergeProduct(1);
        controllerProducts.saveFisier();
        controllerProducts.load();
        assertEquals(false,controllerProducts.poz(1)!=-1);

    }
}

