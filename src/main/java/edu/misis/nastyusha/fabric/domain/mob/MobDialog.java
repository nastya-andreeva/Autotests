package edu.misis.nastyusha.fabric.domain.mob;

import edu.misis.nastyusha.fabric.domain.entities.AbstractDialog;
import edu.misis.nastyusha.fabric.domain.entities.Button;

public class MobDialog extends AbstractDialog {
    @Override
    public Button getButton() {
        return new MobButton();
    }
}
