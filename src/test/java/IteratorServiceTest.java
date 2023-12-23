import edu.misis.nastyusha.iterator.domain.Item;
import edu.misis.nastyusha.iterator.domain.ItemType;
import edu.misis.nastyusha.iterator.domain.TreasureChest;
import edu.misis.nastyusha.iterator.domain.TreasureChestItemIterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IteratorServiceTest {
    @Test
    void testIterator() {
        TreasureChest treasureChest = new TreasureChest();
        String expectedOutput = "Potion of courage\n" +
                "Ring of shadows\n" +
                "Potion of wisdom\n" +
                "Potion of blood\n" +
                "Sword of silver +1\n" +
                "Potion of rust\n" +
                "Potion of healing\n" +
                "Ring of armor\n" +
                "Steel halberd\n" +
                "Dagger of poison\n";
        String Output = "";
        TreasureChestItemIterator treasureChestIterator = (TreasureChestItemIterator) treasureChest.iterator(ItemType.ANY);
        while (treasureChestIterator.hasNext()) {
            Item item = treasureChestIterator.next();
            Output += item.toString() + "\n";
        }

        assertEquals(expectedOutput, Output);
    }
}
