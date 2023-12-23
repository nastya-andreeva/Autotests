package edu.misis.nastyusha.iterator.presentation;

import edu.misis.nastyusha.iterator.domain.Item;
import edu.misis.nastyusha.iterator.domain.ItemType;
import edu.misis.nastyusha.iterator.domain.TreasureChest;
import edu.misis.nastyusha.iterator.domain.TreasureChestItemIterator;

public class Application {
    public static void main(String[] args) {
        TreasureChest treasureChest = new TreasureChest();

        TreasureChestItemIterator treasureChestIterator = (TreasureChestItemIterator) treasureChest.iterator(ItemType.ANY);
        while (treasureChestIterator.hasNext()) {
            Item item = treasureChestIterator.next();
            System.out.println(item.toString());
        }
    }
}