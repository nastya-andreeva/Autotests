import edu.misis.nastyusha.singleton.data.Connection;
import edu.misis.nastyusha.singleton.data.ItemDb;
import edu.misis.nastyusha.singleton.domain.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SingletonServiceTest {

    @Test
    public void testSingletonService() {
        ItemDb connection1 = Connection.getInstance();
        ItemDb connection2 = Connection.getInstance();

        Item item1 = new Item(1);
        Item item2 = new Item(2);
        Item item3 = new Item(3);

        connection1.addItem(item1);
        connection1.addItem(item2);
        connection2.addItem(item3);

        connection2.deleteItem(item1);
        assertEquals(connection1, connection2);
    }
}
