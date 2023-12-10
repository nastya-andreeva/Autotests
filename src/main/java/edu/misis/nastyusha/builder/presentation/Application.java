package edu.misis.nastyusha.builder.presentation;

import edu.misis.nastyusha.builder.domain.BuilderService;

public class Application {
    public static void main(String[] args) {
        BuilderService service = new BuilderService();
        service.exec();
    }
}
