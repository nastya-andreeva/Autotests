package edu.misis.nastyusha.singleton.data;

import edu.misis.nastyusha.singleton.domain.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDb implements ItemDao {
    private final List<Item> data = new ArrayList<>();

    @Override
    public void addItem(Item item) {
        data.add(item);
    }

    @Override
    public void deleteItem(Item item) {
        data.remove(item);
    }

    @Override
    public List<Item> getItemList() {
        return data;
    }
}
