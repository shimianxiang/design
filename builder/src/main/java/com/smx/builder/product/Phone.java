package com.smx.builder.product;

import com.smx.builder.PhoneBuilder;
import com.smx.builder.fittings.Cpu;
import com.smx.builder.fittings.Disk;
import com.smx.builder.fittings.Ram;

/**
 * Phone
 */
public final class Phone implements Product {
    private final String brand;
    private final Cpu cpu;
    private final Disk disk;
    private final Ram ram;

    public Phone(PhoneBuilder builder) {
        this.brand = builder.getBrand();
        this.cpu = builder.getCpu();
        this.disk = builder.getDisk();
        this.ram = builder.getRam();
    }

    public String getBrand() {
        return brand;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Disk getDisk() {
        return disk;
    }

    public Ram getRam() {
        return ram;
    }


    public String introduce() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", cpu=" + cpu +
                ", disk=" + disk +
                ", ram=" + ram +
                '}';
    }
}
