package com.smx.builder;

import com.smx.builder.fittings.*;
import com.smx.builder.product.Computer;

public class ComputerBuilder implements BuilderInterface {

    private final String brand;
    private Cpu cpu;
    private Gpu gpu;
    private Disk disk;
    private Ram ram;
    private Mainboard mainboard;

    /**
     * Constructor.
     */
    public ComputerBuilder(String brand) {
        if (brand == null) {
            throw new IllegalArgumentException("brand can not be null");
        }
        this.brand = brand;
    }

    public String getBrand() {
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

    public ComputerBuilder withCpu(Cpu cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder withGpu(Gpu gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder withDisk(Disk disk) {
        this.disk = disk;
        return this;
    }

    public ComputerBuilder withRam(Ram ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder withMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(this);
    }
}
