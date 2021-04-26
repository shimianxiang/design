package com.smx.builder.fittings;

/**
 * Profession enumeration
 */
public enum Disk {
    SMALL("256g"), MEDIUM("512g"), BIG("1t");

    private final String capacity;

    Disk(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return capacity;
    }
}
