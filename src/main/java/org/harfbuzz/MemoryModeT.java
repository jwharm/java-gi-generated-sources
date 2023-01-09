package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type holding the memory modes available to
 * client programs.
 * <p>
 * Regarding these various memory-modes:
 * <ul>
 * <li>In no case shall the HarfBuzz client modify memory
 *   that is passed to HarfBuzz in a blob.  If there is
 *   any such possibility, {@code HB_MEMORY_MODE_DUPLICATE} should be used
 *   such that HarfBuzz makes a copy immediately,
 * </ul>
 * <ul>
 * <li>Use {@code HB_MEMORY_MODE_READONLY} otherwise, unless you really really
 *   really know what you are doing,
 * </ul>
 * <ul>
 * <li>{@code HB_MEMORY_MODE_WRITABLE} is appropriate if you really made a
 *   copy of data solely for the purpose of passing to
 *   HarfBuzz and doing that just once (no reuse!),
 * </ul>
 * <ul>
 * <li>If the font is mmap()ed, it's okay to use
 *   {@code HB_MEMORY_READONLY_MAY_MAKE_WRITABLE}, however, using that mode
 *   correctly is very tricky.  Use {@code HB_MEMORY_MODE_READONLY} instead.
 * </ul>
 */
public enum MemoryModeT implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * HarfBuzz immediately makes a copy of the data.
     */
    DUPLICATE(0),
    
    /**
     * HarfBuzz client will never modify the data,
     *     and HarfBuzz will never modify the data.
     */
    READONLY(1),
    
    /**
     * HarfBuzz client made a copy of the data solely
     *     for HarfBuzz, so HarfBuzz may modify the data.
     */
    WRITABLE(2),
    
    /**
     * See above
     */
    READONLY_MAY_MAKE_WRITABLE(3);
    
    private static final java.lang.String C_TYPE_NAME = "hb_memory_mode_t";
    
    private final int value;
    
    /**
     * Create a new MemoryModeT for the provided value
     * @param numeric value the enum value
     */
    MemoryModeT(int value) {
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
     * Create a new MemoryModeT for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MemoryModeT of(int value) {
        return switch (value) {
            case 0 -> DUPLICATE;
            case 1 -> READONLY;
            case 2 -> WRITABLE;
            case 3 -> READONLY_MAY_MAKE_WRITABLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
