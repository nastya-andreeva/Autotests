package edu.misis.nastyusha.fabric.presentation;

import edu.misis.nastyusha.fabric.domain.FabricMethodService;

class Application {
    public static void main(String[] args) {
        FabricMethodService service = new FabricMethodService();
        service.exec();
    }
}