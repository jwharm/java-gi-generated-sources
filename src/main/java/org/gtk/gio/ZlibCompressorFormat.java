package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to select the type of data format to use for {@link ZlibDecompressor}
 * and {@link ZlibCompressor}.
 * @version 2.24
 */
public enum ZlibCompressorFormat implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * deflate compression with zlib header
     */
    ZLIB(0),
    
    /**
     * gzip file format
     */
    GZIP(1),
    
    /**
     * deflate compression with no header
     */
    RAW(2);
    
    private static final java.lang.String C_TYPE_NAME = "GZlibCompressorFormat";
    
    private final int value;
    
    /**
     * Create a new ZlibCompressorFormat for the provided value
     * @param numeric value the enum value
     */
    ZlibCompressorFormat(int value) {
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
     * Create a new ZlibCompressorFormat for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ZlibCompressorFormat of(int value) {
        return switch (value) {
            case 0 -> ZLIB;
            case 1 -> GZIP;
            case 2 -> RAW;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
