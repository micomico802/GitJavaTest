package main;

import main.domain.ClientService;
import main.domain.ItemService;

public class Main {

    public static void main(String[] args) {
        System.out.println("メインクラスです");

        ItemService item = new ItemService();
        ClientService client = new ClientService();

        item.sayHello();
        client.clientStart();

    }

}
