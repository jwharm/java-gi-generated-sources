package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The result of a {@link IteratorItemFunction}.
 */
public enum IteratorItem implements io.github.jwharm.javagi.Enumeration {
    /**
     * Skip this item
     */
    SKIP(0),
    /**
     * Return item
     */
    PASS(1),
    /**
     * Stop after this item.
     */
    END(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstIteratorItem";
    
    private final int value;
    IteratorItem(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static IteratorItem of(int value) {
        return switch (value) {
            case 0 -> SKIP;
            case 1 -> PASS;
            case 2 -> END;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
