package edu.misis.nastyusha.abstractfabric.domain.mob;

import edu.misis.nastyusha.abstractfabric.domain.entities.Input;

class MobInput implements Input {
    private String value;

    @Override
    public void value(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public void render() {
        System.out.printf("render MobInput. With value %s%n", value);
    }
}