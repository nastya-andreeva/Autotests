package edu.misis.nastyusha.chain_of_responsibility.presentation;

import edu.misis.nastyusha.chain_of_responsibility.domain.*;


public class Application {

    public static void main(String[] args) {
        AbstractChainHandler header = new HeadersChainHandler();
        AbstractChainHandler method = new MethodChainHandler();
        AbstractChainHandler path = new PathChainHandler();
        AbstractChainHandler session = new SessionChainHandler();

        header.next(method);
        method.next(path);
        path.next(session);
    }
}