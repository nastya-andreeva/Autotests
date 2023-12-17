package edu.misis.nastyusha.singleton.data;

abstract public class Connection {
    private static ItemDb INSTANCE;

    public static ItemDb getInstance() {
        if (INSTANCE != null)
            return INSTANCE;
        INSTANCE = new ItemDb();
        return INSTANCE;
    }
}