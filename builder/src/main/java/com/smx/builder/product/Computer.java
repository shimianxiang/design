package com.smx.builder.product;

import com.smx.builder.ComputerBuilder;
import com.smx.builder.fittings.*;

/**
 * Computer
 */
public final class Computer implements Product {
    private final String brand;
    private final Cpu cpu;
    private final Gpu gpu;
    private final Disk disk;
    private final Ram ram;
    private final Mainboard mainboard;

    public Computer(ComputerBuilder builder) {
        this.brand = builder.getBrand();
        this.cpu = builder.getCpu();
        this.gpu = builder.getGpu();
        this.disk = builder.getDisk();
        this.ram = builder.getRam();
        this.mainboard = builder.getMainboard();
    }

    public String getName() {
        return brand;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public Disk getDisk() {
        return disk;
    }

    public Ram getRam() {
        return ram;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public String introduce() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                ", disk=" + disk +
                ", ram=" + ram +
                ", mainboard=" + mainboard +
                '}';
    }
}

