package edu.misis.nastyusha.fabric.domain.entities;

public abstract class AbstractDialog implements Dialog {
    public abstract Button getButton();

    @Override
    public void render() {
        Button button = getButton();
        button.render();
    }
}