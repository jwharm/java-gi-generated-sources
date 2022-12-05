package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration indicating whether an element implements color balancing
 * operations in software or in dedicated hardware. In general, dedicated
 * hardware implementations (such as those provided by xvimagesink) are
 * preferred.
 */
public enum ColorBalanceType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Color balance is implemented with dedicated
     *         hardware.
     */
    HARDWARE(0),
    /**
     * Color balance is implemented via software
     *         processing.
     */
    SOFTWARE(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstColorBalanceType";
    
    private final int value;
    ColorBalanceType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ColorBalanceType of(int value) {
        return switch (value) {
            case 0 -> HARDWARE;
            case 1 -> SOFTWARE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
