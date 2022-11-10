package riobridge.com.citi.toolkit.generic.util;

import java.util.Map;

public class GenericTranslation<A, B> {
    private final Map<A, B> transMap;
    private String name;

    public GenericTranslation(String name, Map<A, B> transMap) {
        this.name = name;
        this.transMap = transMap;
    }
}

