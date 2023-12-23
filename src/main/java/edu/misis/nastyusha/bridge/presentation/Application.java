package edu.misis.nastyusha.bridge.presentation;

import edu.misis.nastyusha.bridge.domain.BridgeService;

class Application {
    public static void main(String[] args) {
        BridgeService service = new BridgeService();
        service.exec();
    }
}