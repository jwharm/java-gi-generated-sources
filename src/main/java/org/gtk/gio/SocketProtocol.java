package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A protocol identifier is specified when creating a {@link Socket}, which is a
 * family/type specific identifier, where 0 means the default protocol for
 * the particular family/type.
 * <p>
 * This enum contains a set of commonly available and used protocols. You
 * can also pass any other identifiers handled by the platform in order to
 * use protocols not listed here.
 * @version 2.22
 */
public enum SocketProtocol implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The protocol type is unknown
     */
    UNKNOWN(-1),
    
    /**
     * The default protocol for the family/type
     */
    DEFAULT(0),
    
    /**
     * TCP over IP
     */
    TCP(6),
    
    /**
     * UDP over IP
     */
    UDP(17),
    
    /**
     * SCTP over IP
     */
    SCTP(132);
    
    private static final java.lang.String C_TYPE_NAME = "GSocketProtocol";
    
    private final int value;
    
    /**
     * Create a new SocketProtocol for the provided value
     * @param numeric value the enum value
     */
    SocketProtocol(int value) {
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
     * Create a new SocketProtocol for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SocketProtocol of(int value) {
        return switch (value) {
            case -1 -> UNKNOWN;
            case 0 -> DEFAULT;
            case 6 -> TCP;
            case 17 -> UDP;
            case 132 -> SCTP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
