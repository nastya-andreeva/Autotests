package edu.misis.nastyusha.singleton.presentation;

import edu.misis.nastyusha.singleton.domain.SingletonService;

class Application {
    public static void main(String[] args) {
        SingletonService service = new SingletonService();
        service.exec();
    }
}