package edu.misis.nastyusha.abstractfabric.domain.entities;

public interface Input {
    void render();

    void value(String value);

    String value();
}