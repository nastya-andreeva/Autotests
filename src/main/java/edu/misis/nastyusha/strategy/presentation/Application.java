package edu.misis.nastyusha.strategy.presentation;

import edu.misis.nastyusha.strategy.domain.*;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Strategy comma = new CommaSeparatedStrategy();
        Strategy semicolon = new SemicolonSeparatedStrategy();

        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("cde");
        System.out.println(comma.process(list));
        System.out.println(semicolon.process(list));
    }
}