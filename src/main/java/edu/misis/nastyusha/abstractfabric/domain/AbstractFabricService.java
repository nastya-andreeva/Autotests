package edu.misis.nastyusha.abstractfabric.domain;

import edu.misis.nastyusha.abstractfabric.domain.entities.Button;
import edu.misis.nastyusha.abstractfabric.domain.entities.Input;
import edu.misis.nastyusha.abstractfabric.domain.mob.MobFormElementFactory;
import edu.misis.nastyusha.abstractfabric.domain.web.WebFormElementFactory;
import org.jetbrains.annotations.NotNull;

import static edu.misis.nastyusha.abstractfabric.domain.Configuration.MOB;
import static edu.misis.nastyusha.abstractfabric.domain.Configuration.WEB;

public class AbstractFabricService {
    private FormElementFactory initFactory() {
        Configuration configuration = Configuration.initWeb();
        FormElementFactory factory;
        switch (configuration.getPlatform()) {
            case (WEB) -> factory = new WebFormElementFactory();
            case (MOB) -> factory = new MobFormElementFactory();
            default -> throw new RuntimeException("Неизвестный тип платформы");
        }
        return factory;
    }

    public void renderForm(@NotNull FormElementFactory factory) {
        Input input = factory.createInput();
        Button button = factory.createButton();
        input.value("Тестовое значение поля ввода данных");
        input.render();
        button.render();
    }

    public void exec() {
        renderForm(
                initFactory()
        );
    }
}
