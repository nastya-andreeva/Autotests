package edu.misis.nastyusha.fabric.domain.mob;

import edu.misis.nastyusha.fabric.domain.entities.Button;

class MobButton implements Button {
    @Override
    public void render() {
        System.out.println("render MobButton");
    }
}
