package edu.misis.nastyusha.bridge.domain;

import edu.misis.nastyusha.bridge.domain.devices.Radio;

public class BridgeService {

    public void exec() {
        testDevice(new Radio());
    }

    private void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}
