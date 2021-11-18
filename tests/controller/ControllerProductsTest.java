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
}
//    @Test
//    public  void load(){
//        ControllerProducts controllerProducts=new ControllerProducts("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\MagazinOnline\\src\\resurces\\products.txt");
//    controllerProducts.load();
//    controllerProducts.afiseaza();
//    }
//
//}
/*class ControllerBookTest {

    private ControllerBook controllerBook;


    @BeforeEach
    public void preconditie() {

        controllerBook = new ControllerBook("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Proiecte\\Aplicatie_ScoalaOnline\\src\\com\\company\\resources\\books.txt");
    }

    @Test
    public void returnpoz() {
        System.out.println(controllerBook.poz(2));
    }


    @Test
    public void testLoad1() {
        //Preconditie
        Matematica matematica1 = new Matematica("4,1,Matematica de baza,2008,matematica,true,false,manual,V");
        Matematica matematica2 = new Matematica("5,2,Geometrie,2017,matematica,true,false,manual,VII");
        Matematica matematica3 = new Matematica("6,3,Algebra,2018,matematica,true,false,manual,VI");
        Literatura literatura1 = new Literatura("7,4,Literatura romana,2000,literatura,true,false,romana,VI");
        Literatura literatura2 = new Literatura("8,5,Literatura engleza,2010,literatura,true,false,engleza,XII");


        //Actiune
        controllerBook.adauga(matematica1);
        controllerBook.adauga(matematica2);
        controllerBook.adauga(matematica3);
        controllerBook.adauga(literatura1);
        controllerBook.adauga(literatura2);
        controllerBook.toSaveFisier();

        controllerBook.load();

        //Rezultat
        assertEquals(true, controllerBook.poz(4) != -1);
        assertEquals(true, controllerBook.poz(5) != -1);
        assertEquals(true, controllerBook.poz(6) != -1);
        assertEquals(true, controllerBook.poz(7) != -1);
        assertEquals(true, controllerBook.poz(8) != -1);

        //Postconditie

        controllerBook.stergeBook(4);
        controllerBook.stergeBook(5);
        controllerBook.stergeBook(6);
        controllerBook.stergeBook(7);
        controllerBook.stergeBook(8);

        controllerBook.toSaveFisier();
        controllerBook.load();
        assertEquals(false, controllerBook.poz(4) != -1);
        assertEquals(false, controllerBook.poz(5) != -1);
        assertEquals(false, controllerBook.poz(6) != -1);
        assertEquals(false, controllerBook.poz(7) != -1);
        assertEquals(false, controllerBook.poz(8) != -1);




    }

    @Test
    public void adauga() {
        //preconditie
        Matematica matematica1 = new Matematica("4,1,Matematica pentru avansati,2013,matematica,true,false,manual,XII");
        Matematica matematica2 = new Matematica("5,2,Exercitii pt bacalaureat,2018,matematica,true,false,manual,XII");
        Matematica matematica3 = new Matematica("6,3,Exercitii de logica,2019,matematica,true,false,manual,VII");
        Literatura literatura1 = new Literatura("7,4,Literatura greaca,2000,literatura,true,false,grec,XI");
        Literatura literatura2 = new Literatura("8,5,Mitologie,2000,literatura,true,false,romana,VII");

//Actiune
        controllerBook.adauga(matematica1);
        controllerBook.adauga(matematica2);
        controllerBook.adauga(matematica3);
        controllerBook.adauga(literatura1);
        controllerBook.adauga(literatura2);

        controllerBook.toSaveFisier();

//rezultat
        assertEquals(true, controllerBook.isBook("Matematica pentru avansati"));
        assertEquals(true, controllerBook.isBook("Exercitii pt bacalaureat"));
        assertEquals(true, controllerBook.isBook("Exercitii de logica"));
        assertEquals(true, controllerBook.isBook("Literatura greaca"));
        assertEquals(true, controllerBook.isBook("Mitologie"));

//postconditie

        controllerBook.stergeBook(4);
        controllerBook.stergeBook(5);
        controllerBook.stergeBook(6);
        controllerBook.stergeBook(7);
        controllerBook.stergeBook(8);

        controllerBook.toSaveFisier();

        controllerBook.load();

        assertEquals(false, controllerBook.poz(4) != -1);
        assertEquals(false, controllerBook.poz(5) != -1);
        assertEquals(false, controllerBook.poz(6) != -1);
        assertEquals(false, controllerBook.poz(7) != -1);
        assertEquals(false, controllerBook.poz(8) != -1);


    }

    @Test
    public void toSave() {
        //preconditie
        Matematica matematica1 = new Matematica("4,1,Matematica pentru avansati,2013,matematica,true,false,manual,XII");
        Matematica matematica2 = new Matematica("5,2,Exercitii pt bacalaureat,2018,matematica,true,false,manual,XII");
        Matematica matematica3 = new Matematica("6,3,Exercitii de logica,2019,matematica,true,false,manual,VII");
        Literatura literatura1 = new Literatura("7,4,Literatura greaca,2000,literatura,true,false,grec,XI");
        Literatura literatura2 = new Literatura("8,5,Mitologie,2000,literatura,true,false,romana,VII");
//Actiune
        controllerBook.adauga(matematica1);
        controllerBook.adauga(matematica2);
        controllerBook.adauga(matematica3);
        controllerBook.adauga(literatura1);
        controllerBook.adauga(literatura2);

        controllerBook.toSaveFisier();
        //Rezultat

        assertEquals(
                "4,1,Matematica pentru avansati,2013,matematica,true,false,manual,XII\n" +
                "5,2,Exercitii pt bacalaureat,2018,matematica,true,false,manual,XII\n" +
                "6,3,Exercitii de logica,2019,matematica,true,false,manual,VII\n" +
                "7,4,Literatura greaca,2000,literatura,true,false,grec,XI\n" +
                "8,5,Mitologie,2000,literatura,true,false,romana,VII\n", controllerBook.toSave());

///postconditie
        controllerBook.stergeBook(4);
        controllerBook.stergeBook(5);
        controllerBook.stergeBook(6);
        controllerBook.stergeBook(7);
        controllerBook.stergeBook(8);

        controllerBook.toSaveFisier();

        controllerBook.load();

        assertEquals(false, controllerBook.poz(4) != -1);
        assertEquals(false, controllerBook.poz(5) != -1);
        assertEquals(false, controllerBook.poz(6) != -1);
        assertEquals(false, controllerBook.poz(7) != -1);
        assertEquals(false, controllerBook.poz(8) != -1);

    }

    @Test
    public void afisare() {
        //Preconditie

        Matematica matematica1 = new Matematica("4,1,Matematica pentru avansati,2013,matematica,true,false,manual,XII");
        Matematica matematica2 = new Matematica("5,2,Exercitii pt bacalaureat,2018,matematica,true,false,manual,XII");
        Matematica matematica3 = new Matematica("6,3,Exercitii de logica,2019,matematica,true,false,manual,VII");
        Literatura literatura1 = new Literatura("7,4,Literatura greaca,2000,literatura,true,false,grec,XI");
        Literatura literatura2 = new Literatura("8,5,Mitologie,2000,literatura,true,false,romana,VII");

//Actiune
        controllerBook.adauga(matematica1);
        controllerBook.adauga(matematica2);
        controllerBook.adauga(matematica3);
        controllerBook.adauga(literatura1);
        controllerBook.adauga(literatura2);

        controllerBook.toSaveFisier();

        controllerBook.afisare();

        //postconditie

        controllerBook.stergeBook(4);
        controllerBook.stergeBook(5);
        controllerBook.stergeBook(6);
        controllerBook.stergeBook(7);
        controllerBook.stergeBook(8);

        controllerBook.toSaveFisier();

        controllerBook.load();

        assertEquals(false, controllerBook.poz(4) != -1);
        assertEquals(false, controllerBook.poz(5) != -1);
        assertEquals(false, controllerBook.poz(6) != -1);
        assertEquals(false, controllerBook.poz(7) != -1);
        assertEquals(false, controllerBook.poz(8) != -1);

    }

    @Test
    public void poz() {
        //Preconditie
        Matematica matematica1 = new Matematica("4,1,Matematica de baza,2008,matematica,true,false,manual,V");
        Matematica matematica2 = new Matematica("5,2,Geometrie,2017,matematica,true,false,manual,VII");
        Matematica matematica3 = new Matematica("6,3,Algebra,2018,matematica,true,false,manual,VI");
        Literatura literatura1 = new Literatura("7,4,Literatura romana,2000,literatura,true,false,romana,VI");
        Literatura literatura2 = new Literatura("8,5,Literatura engleza,2010,literatura,true,false,engleza,XII");


        //Actiune
        controllerBook.adauga(matematica1);
        controllerBook.adauga(matematica2);
        controllerBook.adauga(matematica3);
        controllerBook.adauga(literatura1);
        controllerBook.adauga(literatura2);

        controllerBook.toSaveFisier();

        controllerBook.load();




        assertEquals(0, controllerBook.poz(4));

        assertEquals(1, controllerBook.poz(5));
        assertEquals(2, controllerBook.poz(6));
        assertEquals(3, controllerBook.poz(7));
        assertEquals(4, controllerBook.poz(8));


        //Postconditie

        controllerBook.stergeBook(4);
        controllerBook.stergeBook(5);
        controllerBook.stergeBook(6);
        controllerBook.stergeBook(7);
        controllerBook.stergeBook(8);
        controllerBook.toSaveFisier();
        controllerBook.load();
        assertEquals(false, controllerBook.poz(4) != -1);
        assertEquals(false, controllerBook.poz(5) != -1);
        assertEquals(false, controllerBook.poz(6) != -1);
        assertEquals(false, controllerBook.poz(7) != -1);
        assertEquals(false, controllerBook.poz(8) != -1);



    }*/