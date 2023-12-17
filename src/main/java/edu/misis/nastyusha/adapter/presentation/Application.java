package edu.misis.nastyusha.adapter.presentation;

import edu.misis.nastyusha.adapter.domain.AdapterService;

class Application {
    public static void main(String[] args) {
        AdapterService service = new AdapterService();
        service.exec();
    }
}