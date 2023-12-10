package edu.misis.nastyusha.abstractfabric.domain.mob;

import edu.misis.nastyusha.abstractfabric.domain.entities.Button;

class MobButton implements Button {
    @Override
    public void render() {
        System.out.println("render MobButton");
    }

    @Override
    public void onClick() {
        System.out.println("Event on click MobButton");
    }
}