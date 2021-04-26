package com.smx.builder;

import com.smx.builder.fittings.Cpu;
import com.smx.builder.fittings.Disk;
import com.smx.builder.fittings.Ram;
import com.smx.builder.product.Phone;

public class PhoneBuilder implements BuilderInterface {
    private final String brand;
    private Cpu cpu;
    private Disk disk;
    private Ram ram;

    /**
     * Constructor.
     */
    public PhoneBuilder(String brand) {
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


    public Disk getDisk() {
        return disk;
    }

    public Ram getRam() {
        return ram;
    }


    public PhoneBuilder withCpu(Cpu cpu) {
        this.cpu = cpu;
        return this;
    }


    public PhoneBuilder withDisk(Disk disk) {
        this.disk = disk;
        return this;
    }

    public PhoneBuilder withRam(Ram ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public Phone build() {
        return new Phone(this);
    }
}
