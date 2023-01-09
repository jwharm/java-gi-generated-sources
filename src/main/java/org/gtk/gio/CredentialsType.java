package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enumeration describing different kinds of native credential types.
 * @version 2.26
 */
public enum CredentialsType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Indicates an invalid native credential type.
     */
    INVALID(0),
    
    /**
     * The native credentials type is a {@code struct ucred}.
     */
    LINUX_UCRED(1),
    
    /**
     * The native credentials type is a {@code struct cmsgcred}.
     */
    FREEBSD_CMSGCRED(2),
    
    /**
     * The native credentials type is a {@code struct sockpeercred}. Added in 2.30.
     */
    OPENBSD_SOCKPEERCRED(3),
    
    /**
     * The native credentials type is a {@code ucred_t}. Added in 2.40.
     */
    SOLARIS_UCRED(4),
    
    /**
     * The native credentials type is a {@code struct unpcbid}. Added in 2.42.
     */
    NETBSD_UNPCBID(5),
    
    /**
     * The native credentials type is a {@code struct xucred}. Added in 2.66.
     */
    APPLE_XUCRED(6),
    
    /**
     * The native credentials type is a PID {@code DWORD}. Added in 2.72.
     */
    WIN32_PID(7);
    
    private static final java.lang.String C_TYPE_NAME = "GCredentialsType";
    
    private final int value;
    
    /**
     * Create a new CredentialsType for the provided value
     * @param numeric value the enum value
     */
    CredentialsType(int value) {
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
     * Create a new CredentialsType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static CredentialsType of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> LINUX_UCRED;
            case 2 -> FREEBSD_CMSGCRED;
            case 3 -> OPENBSD_SOCKPEERCRED;
            case 4 -> SOLARIS_UCRED;
            case 5 -> NETBSD_UNPCBID;
            case 6 -> APPLE_XUCRED;
            case 7 -> WIN32_PID;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
