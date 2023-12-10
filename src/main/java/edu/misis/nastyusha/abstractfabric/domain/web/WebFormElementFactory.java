package edu.misis.nastyusha.abstractfabric.domain.web;

import edu.misis.nastyusha.abstractfabric.domain.FormElementFactory;
import edu.misis.nastyusha.abstractfabric.domain.entities.Button;
import edu.misis.nastyusha.abstractfabric.domain.entities.Checkbox;
import edu.misis.nastyusha.abstractfabric.domain.entities.Input;

public class WebFormElementFactory implements FormElementFactory {
    @Override
    public Button createButton() {
        return new WebButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WebCheckbox();
    }

    @Override
    public Input createInput() {
        return new WebInput();
    }
}
