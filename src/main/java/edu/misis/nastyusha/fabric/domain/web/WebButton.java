package edu.misis.nastyusha.fabric.domain.web;

import edu.misis.nastyusha.fabric.domain.entities.Button;

class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("render WebButton");
    }
}
