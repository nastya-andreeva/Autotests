package edu.misis.nastyusha.abstractfabric.domain;

import edu.misis.nastyusha.abstractfabric.domain.entities.*;

public interface FormElementFactory {
    Button createButton();

    Checkbox createCheckbox();

    Input createInput();
}