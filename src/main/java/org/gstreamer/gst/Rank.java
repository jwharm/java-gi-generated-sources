package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Element priority ranks. Defines the order in which the autoplugger (or
 * similar rank-picking mechanisms, such as e.g. gst_element_make_from_uri())
 * will choose this element over an alternative one with the same function.
 * <p>
 * These constants serve as a rough guidance for defining the rank of a
 * {@link PluginFeature}. Any value is valid, including values bigger than
 * {@code GST_RANK_PRIMARY}.
 */
public enum Rank implements io.github.jwharm.javagi.Enumeration {
    /**
     * will be chosen last or not at all
     */
    NONE(0),
    /**
     * unlikely to be chosen
     */
    MARGINAL(64),
    /**
     * likely to be chosen
     */
    SECONDARY(128),
    /**
     * will be chosen first
     */
    PRIMARY(256);
    
    private static final java.lang.String C_TYPE_NAME = "GstRank";
    
    private final int value;
    Rank(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static Rank of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 64 -> MARGINAL;
            case 128 -> SECONDARY;
            case 256 -> PRIMARY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
