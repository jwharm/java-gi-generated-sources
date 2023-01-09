package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The hashing algorithm to be used by {@link Checksum} when performing the
 * digest of some data.
 * <p>
 * Note that the {@link ChecksumType} enumeration may be extended at a later
 * date to include new hashing algorithm types.
 * @version 2.16
 */
public enum ChecksumType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Use the MD5 hashing algorithm
     */
    MD5(0),
    
    /**
     * Use the SHA-1 hashing algorithm
     */
    SHA1(1),
    
    /**
     * Use the SHA-256 hashing algorithm
     */
    SHA256(2),
    
    /**
     * Use the SHA-512 hashing algorithm (Since: 2.36)
     */
    SHA512(3),
    
    /**
     * Use the SHA-384 hashing algorithm (Since: 2.51)
     */
    SHA384(4);
    
    private static final java.lang.String C_TYPE_NAME = "GChecksumType";
    
    private final int value;
    
    /**
     * Create a new ChecksumType for the provided value
     * @param numeric value the enum value
     */
    ChecksumType(int value) {
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
     * Create a new ChecksumType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ChecksumType of(int value) {
        return switch (value) {
            case 0 -> MD5;
            case 1 -> SHA1;
            case 2 -> SHA256;
            case 3 -> SHA512;
            case 4 -> SHA384;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
