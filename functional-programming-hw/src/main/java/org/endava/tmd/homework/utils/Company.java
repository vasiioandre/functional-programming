package org.endava.tmd.homework.utils;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Company {

    private final String name;

    Company(String name) {
        this.name = Utils.notNull(name);
    }

    public String getName() {
        return name;
    }

}
