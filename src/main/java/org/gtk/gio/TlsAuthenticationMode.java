package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The client authentication mode for a {@link TlsServerConnection}.
 * @version 2.28
 */
public enum TlsAuthenticationMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * client authentication not required
     */
    NONE(0),
    /**
     * client authentication is requested
     */
    REQUESTED(1),
    /**
     * client authentication is required
     */
    REQUIRED(2);
    
    private static final java.lang.String C_TYPE_NAME = "GTlsAuthenticationMode";
    
    private final int value;
    TlsAuthenticationMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TlsAuthenticationMode of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> REQUESTED;
            case 2 -> REQUIRED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
