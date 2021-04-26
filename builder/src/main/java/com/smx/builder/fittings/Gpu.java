package com.smx.builder.fittings;

/**
 * HairType enumeration.
 */
public enum Gpu {
    AMD, NVIDIA;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
