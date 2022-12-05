package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * When to allow rehandshaking. See
 * g_tls_connection_set_rehandshake_mode().
 * @version 2.28
 */
public enum TlsRehandshakeMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * Never allow rehandshaking
     */
    NEVER(0),
    /**
     * Allow safe rehandshaking only
     */
    SAFELY(1),
    /**
     * Allow unsafe rehandshaking
     */
    UNSAFELY(2);
    
    private static final java.lang.String C_TYPE_NAME = "GTlsRehandshakeMode";
    
    private final int value;
    TlsRehandshakeMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TlsRehandshakeMode of(int value) {
        return switch (value) {
            case 0 -> NEVER;
            case 1 -> SAFELY;
            case 2 -> UNSAFELY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
