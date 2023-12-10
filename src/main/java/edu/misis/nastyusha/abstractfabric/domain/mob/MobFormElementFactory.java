package edu.misis.nastyusha.abstractfabric.domain.mob;

import edu.misis.nastyusha.abstractfabric.domain.FormElementFactory;
import edu.misis.nastyusha.abstractfabric.domain.entities.Button;
import edu.misis.nastyusha.abstractfabric.domain.entities.Checkbox;
import edu.misis.nastyusha.abstractfabric.domain.entities.Input;

public class MobFormElementFactory implements FormElementFactory {
    @Override
    public Button createButton() {
        return new MobButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MobCheckbox();
    }

    @Override
    public Input createInput() {
        return new MobInput();
    }
}
