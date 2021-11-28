package View;

import controller.ControllerOrderDetails;
import controller.ControllerOrders;
import controller.ControllerProducts;
import model.OrderDetails;
import model.Products;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewClient {
    private ControllerProducts controllerProducts;
    private ControllerOrders controllerOrders;
    private ControllerOrderDetails controllerOrderDetails;

    public ViewClient() {
        controllerProducts = new ControllerProducts(Path.of("src", "com", "company", "resources", "products.txt").toString());
        controllerOrders = new ControllerOrders(Path.of("src", "com", "company", "resources", "orders.txt").toString());
        controllerOrderDetails = new ControllerOrderDetails(Path.of("src", "com", "company", "resources", "orderDetails.txt").toString());

        play();
    }

    public void meniu() {
        System.out.println("*******************CLIENT**************************");
        System.out.println("Apasa tasta 1 pentru a afisa toate produsele");
        System.out.println("Apasa tasta 2 pentru a dauga un produs in cos ");
        System.out.println("Apasa tasta 3 pentru a sterge un produs din cos");
        System.out.println("Apasa tasta 5 pentru iesire");

    }

    public void play() {
        Scanner citeste = new Scanner(System.in);//System in = ami a  billentyuzetrol jon
        boolean run = true;
        int alegere = 0;
        meniu();
        while (run = true) {
            alegere = Integer.parseInt(citeste.nextLine());
            switch (alegere) {
                case 1:
                    controllerProducts.afiseaza();
                    break;
                case 2:
                    adaugareProdusInCos();
                    break;
                case 3:
                    stergereProdusDinCos();
                    break;
                case 5:
                    run = false;
                default:
            }
        }
    }

    private void stergereProdusDinCos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inscrie id-ul produsului:");
        String idProdus = scanner.nextLine();

        Products produsDeSters = controllerProducts.returnProduct(Integer.parseInt(idProdus));

        if (produsDeSters != null ){
            System.out.println("Inscrie id-ul comenzii:");
            String idOrder = scanner.nextLine();

            controllerOrderDetails.stergereCommandaCuProdus(Integer.parseInt(idOrder ), Integer.parseInt(idProdus));
            controllerOrderDetails.saveFisier();
        }

    }




    public void adaugareProdusInCos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inscrie id-ul produsului:");
        String id = scanner.nextLine();

        Products produsDeAdaugat = controllerProducts.returnProduct(Integer.parseInt(id));

        if (produsDeAdaugat != null){
            System.out.println("Inscrie id-ul comenzii:");
            String orderId = scanner.nextLine();

            if (controllerOrders.isOrders(Integer.parseInt(orderId))){//verificare daca cmanda(orderul)exista
                System.out.println("Inscrie cate bucati:");
                String cantitate = scanner.nextLine();

                OrderDetails orderDetails = new OrderDetails(0, Integer.parseInt(orderId), produsDeAdaugat.getId(),
                        produsDeAdaugat.getPrice(), Integer.parseInt( cantitate));
                controllerOrderDetails.adauga(orderDetails);
                controllerOrderDetails.saveFisier();
            } else {
                System.out.println("Commanda inexistenta!");
            }
        } else {
            System.out.println("Produsul nu exista!");
        }
    }

}
