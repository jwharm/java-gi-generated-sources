package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TlsInteractionResult} is returned by various functions in {@link TlsInteraction}
 * when finishing an interaction request.
 * @version 2.30
 */
public enum TlsInteractionResult implements io.github.jwharm.javagi.Enumeration {
    /**
     * The interaction was unhandled (i.e. not
     *     implemented).
     */
    UNHANDLED(0),
    /**
     * The interaction completed, and resulting data
     *     is available.
     */
    HANDLED(1),
    /**
     * The interaction has failed, or was cancelled.
     *     and the operation should be aborted.
     */
    FAILED(2);
    
    private static final java.lang.String C_TYPE_NAME = "GTlsInteractionResult";
    
    private final int value;
    TlsInteractionResult(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TlsInteractionResult of(int value) {
        return switch (value) {
            case 0 -> UNHANDLED;
            case 1 -> HANDLED;
            case 2 -> FAILED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
