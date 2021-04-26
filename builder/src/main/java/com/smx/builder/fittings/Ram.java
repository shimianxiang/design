package com.smx.builder.fittings;

/**
 * Weapon enumeration.
 */
public enum Ram {
    SMALL("8g"), MEDIUM("16g"), BIG("32g");

    private final String capacity;

    Ram(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return capacity;
    }
}
