package edu.misis.nastyusha.fabric.domain.web;

import edu.misis.nastyusha.fabric.domain.entities.AbstractDialog;
import edu.misis.nastyusha.fabric.domain.entities.Button;

public class WebDialog extends AbstractDialog {
    @Override
    public Button getButton() {
        return new WebButton();
    }
}
