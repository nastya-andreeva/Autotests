package edu.misis.nastyusha.proxy.presentation;

import edu.misis.nastyusha.proxy.domain.ProxyService;

class Application {
    public static void main(String[] args) {
        ProxyService service = new ProxyService();
        service.exec();
    }
}