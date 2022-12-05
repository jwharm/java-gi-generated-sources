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
    MiscDescriptorType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static MiscDescriptorType of(int value) {
        return switch (value) {
            case 131 -> MTS_DESC_DTG_LOGICAL_CHANNEL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
