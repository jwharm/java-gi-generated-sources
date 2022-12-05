package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents the packing location of a children in its parent.
 * <p>
 * See {@link WindowControls} for example.
 */
public enum PackType implements io.github.jwharm.javagi.Enumeration {
    /**
     * The child is packed into the start of the widget
     */
    START(0),
    /**
     * The child is packed into the end of the widget
     */
    END(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPackType";
    
    private final int value;
    PackType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PackType of(int value) {
        return switch (value) {
            case 0 -> START;
            case 1 -> END;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
