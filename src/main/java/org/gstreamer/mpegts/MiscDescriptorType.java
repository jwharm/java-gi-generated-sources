package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of {@link Descriptor}
 * <p>
 * These values correspond to miscellaneous descriptor types that are
 * not yet identified from known specifications.
 */
public enum MiscDescriptorType implements io.github.jwharm.javagi.Enumeration {
    
    MTS_DESC_DTG_LOGICAL_CHANNEL(131);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsMiscDescriptorType";
    
    private final int value;
    
    /**
     * Create a new MiscDescriptorType for the provided value
     * @param numeric value the enum value
     */
    MiscDescriptorType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new MiscDescriptorType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MiscDescriptorType of(int value) {
        return switch (value) {
            case 131 -> MTS_DESC_DTG_LOGICAL_CHANNEL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
