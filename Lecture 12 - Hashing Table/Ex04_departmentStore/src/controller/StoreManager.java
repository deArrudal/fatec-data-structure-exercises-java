package controller;

import linkedlist.model.LinkedList;
import model.Product;

public class StoreManager {

    LinkedList<Product>[] storeList;

    String[] floor = {
            "celulares e smartphones/tv e video/consoles e games/audio/telefonia fixa/informatica/acessorios e perifericos/pc gamer",
            "eletrodomesticos/eletroportateis/ar e ventilacao/moveis e decoracao/casa e construcao/cama, mesa e banho",
            "livros/instrumentos musicais/musica/filmes e series",
            "mercado/automotivo/brinquedos/bebes/gift cards/pet shop/papelaria"
    };

    int sizeFloor = floor.length;

    public StoreManager() {
        storeList = new LinkedList[sizeFloor];

        for (int i = 0; i < sizeFloor; i++) {
            storeList[i] = new LinkedList<>();
        }
    }

    private int computeHash(String description) {
        for (int i = 0; i < sizeFloor; i++) {
            if (floor[i].contains(description)) {
                return i;
            }
        }

        return -1; // error
    }

    public String addProduct(String name, String description) {
        int id = computeHash(description);
        if (id == -1) {
            System.err.println("Invalid hashing");
        }

        Product product = new Product(id, name, description);

        try {
            storeList[id].addLast(product);
            return "Product added";
        } catch (Exception errAdd) {
            System.err.println(errAdd);
        }

        return "Product not added";
    }

    public String removeProduct(String name, String description) {
        int id = computeHash(description);
        if (id == -1) {
            return "Invalid hashing";
        }

        int sizeList = storeList[id].size();

        for (int i = 0; i < sizeList; i++) {
            try {
                if (storeList[id].get(i).getName().equals(name)) {
                    storeList[id].remove(i);
                    return "Product removed";
                }
            } catch (Exception errRemove) {
                System.err.println(errRemove);
            }
        }

        return "Product not found";
    }

    public String findProduct(String name, String description) {
        int id = computeHash(description);
        if (id == -1) {
            return "Invalid hashing";
        }

        int sizeList = storeList[id].size();

        for (int i = 0; i < sizeList; i++) {
            try {
                if (storeList[id].get(i).getName().equals(name)) {
                    return storeList[id].get(i).toString();
                }
            } catch (Exception errRemove) {
                System.err.println(errRemove);
            }
        }

        return "Product not found";
    }
}
