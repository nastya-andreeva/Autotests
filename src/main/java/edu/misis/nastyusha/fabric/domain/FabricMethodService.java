package edu.misis.nastyusha.fabric.domain;

import edu.misis.nastyusha.fabric.domain.entities.Dialog;
import edu.misis.nastyusha.fabric.domain.mob.MobDialog;
import edu.misis.nastyusha.fabric.domain.web.WebDialog;

import static edu.misis.nastyusha.fabric.domain.Configuration.MOB;
import static edu.misis.nastyusha.fabric.domain.Configuration.WEB;

public class FabricMethodService {
    private Dialog dialog;
    public void exec() {
        Configuration configuration = Configuration.initMob();
        switch (configuration.getPlatform()) {
            case WEB -> dialog = new WebDialog();
            case MOB -> dialog = new MobDialog();
            default -> throw new RuntimeException("Неизвестный тип платформы");
        }
        dialog.render();
    }

    public Dialog getDialog() {
        return dialog;
    }
}
