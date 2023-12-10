import edu.misis.nastyusha.abstractfabric.domain.AbstractFabricService;
import edu.misis.nastyusha.abstractfabric.domain.entities.Button;
import edu.misis.nastyusha.abstractfabric.domain.entities.Input;
import edu.misis.nastyusha.abstractfabric.domain.FormElementFactory;
import edu.misis.nastyusha.abstractfabric.domain.mob.MobFormElementFactory;
import edu.misis.nastyusha.abstractfabric.domain.web.WebFormElementFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractFabricServiceTest {

    @Test
    public void testRenderFormForWebFactory() {
        AbstractFabricService abstractFabricService = new AbstractFabricService();

        FormElementFactory webFactory = new WebFormElementFactory();
        abstractFabricService.renderForm(webFactory);

        assertTrue(webFactory instanceof WebFormElementFactory);
        assertNotNull(webFactory.createInput());
        assertNotNull(webFactory.createButton());
        assertTrue(webFactory.createInput() instanceof Input);
        assertTrue(webFactory.createButton() instanceof Button);
    }

    @Test
    public void testRenderFormForMobFactory() {
        AbstractFabricService abstractFabricService = new AbstractFabricService();

        FormElementFactory mobFactory = new MobFormElementFactory();
        abstractFabricService.renderForm(mobFactory);

        assertTrue(mobFactory instanceof MobFormElementFactory);
        assertNotNull(mobFactory.createInput());
        assertNotNull(mobFactory.createButton());
        assertTrue(mobFactory.createInput() instanceof Input);
        assertTrue(mobFactory.createButton() instanceof Button);
    }
}
