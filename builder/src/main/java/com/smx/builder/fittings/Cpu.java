package com.smx.builder.fittings;

public enum Cpu {
    AMD, NVIDIA, QUALCOMM, KIRIN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
