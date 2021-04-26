package com.smx.builder.fittings;

public enum Mainboard {
    ROG, NVIDIA, ASUS;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
