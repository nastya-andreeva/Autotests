package edu.misis.nastyusha.strategy.domain;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface Strategy {

    @NotNull
    String process(@NotNull List<String> stings);

}
