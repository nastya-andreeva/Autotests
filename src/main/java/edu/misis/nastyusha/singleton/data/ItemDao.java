package edu.misis.nastyusha.singleton.data;

import edu.misis.nastyusha.singleton.domain.Item;

import java.util.List;

interface ItemDao {
    void addItem(Item item);
    void deleteItem(Item item);
    List<Item> getItemList();
}
