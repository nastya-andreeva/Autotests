package edu.misis.nastyusha.abstractfabric.presentation;

import edu.misis.nastyusha.abstractfabric.domain.AbstractFabricService;

class Application {
    public static void main(String[] args) {
        AbstractFabricService service = new AbstractFabricService();
        service.exec();
    }
}