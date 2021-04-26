package com.smx.builder;

import com.smx.builder.fittings.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 建造者模式（Builder）
 * <p>
 * 建造者是创建一个复杂对象的一部分接口。
 * 有时候，如果建造者对他所创建的东西拥有较好的知识储备，这个接口就可能成为一个有默认方法的抽象类（又称为适配器）。
 * 如果对象有复杂的继承树，那么对于建造者来说，有一个复杂继承树也是符合逻辑的。
 * 注意：建造者通常有一个「流式接口」。
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        var pc1 = new ComputerBuilder("asus")
                .withCpu(Cpu.NVIDIA)
                .withDisk(Disk.MEDIUM)
                .withGpu(Gpu.NVIDIA)
                .withMainboard(Mainboard.ROG)
                .withRam(Ram.MEDIUM)
                .build();
        LOGGER.info(pc1.introduce());

        var pc2 = new ComputerBuilder("mac")
                .withCpu(Cpu.AMD)
                .withDisk(Disk.BIG)
                .withGpu(Gpu.AMD)
                .withMainboard(Mainboard.NVIDIA)
                .withRam(Ram.BIG)
                .build();
        LOGGER.info(pc2.introduce());

        var phone1 = new PhoneBuilder("huawei")
                .withCpu(Cpu.KIRIN)
                .withDisk(Disk.SMALL)
                .withRam(Ram.SMALL)
                .build();
        LOGGER.info(phone1.introduce());
    }
}
