package edu.misis.nastyusha.singleton.domain;

import edu.misis.nastyusha.singleton.data.Connection;
import edu.misis.nastyusha.singleton.data.ItemDb;

public class SingletonService {
    public void exec() {
        ItemDb connection1 = Connection.getInstance();
        ItemDb connection2 = Connection.getInstance();

        Item item1 = new Item(1);
        Item item2 = new Item(2);
        Item item3 = new Item(3);

        connection1.addItem(item1);
        connection1.addItem(item2);
        connection2.addItem(item3);

        connection2.deleteItem(item1);

        System.out.println(connection1.getItemList());
        System.out.println(connection2.getItemList());
    }
}