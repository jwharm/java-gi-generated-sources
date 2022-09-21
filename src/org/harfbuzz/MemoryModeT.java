package org.harfbuzz;

/**
 * Data type holding the memory modes available to
 * client programs.
 * <p>
 * Regarding these various memory-modes:
 * <p>
 * <ul>
 * <li>In no case shall the HarfBuzz client modify memory
 *   that is passed to HarfBuzz in a blob.  If there is
 *   any such possibility, {@code HB_MEMORY_MODE_DUPLICATE} should be used
 *   such that HarfBuzz makes a copy immediately,
 * </ul>
 * <p>
 * <ul>
 * <li>Use {@code HB_MEMORY_MODE_READONLY} otherwise, unless you really really
 *   really know what you are doing,
 * </ul>
 * <p>
 * <ul>
 * <li>{@code HB_MEMORY_MODE_WRITABLE} is appropriate if you really made a
 *   copy of data solely for the purpose of passing to
 *   HarfBuzz and doing that just once (no reuse!),
 * </ul>
 * <p>
 * <ul>
 * <li>If the font is mmap()ed, it's okay to use
 *   {@code HB_MEMORY_READONLY_MAY_MAKE_WRITABLE}, however, using that mode
 *   correctly is very tricky.  Use {@code HB_MEMORY_MODE_READONLY} instead.
 */
public enum MemoryModeT {

    /**
     * HarfBuzz immediately makes a copy of the data.
     */
    DUPLICATE,
    
    /**
     * HarfBuzz client will never modify the data,
     *     and HarfBuzz will never modify the data.
     */
    READONLY,
    
    /**
     * HarfBuzz client made a copy of the data solely
     *     for HarfBuzz, so HarfBuzz may modify the data.
     */
    WRITABLE,
    
    /**
     * See above
     */
    READONLY_MAY_MAKE_WRITABLE;
    
    public static MemoryModeT fromValue(int value) {
        return switch(value) {
            case 0 -> DUPLICATE;
            case 1 -> READONLY;
            case 2 -> WRITABLE;
            case 3 -> READONLY_MAY_MAKE_WRITABLE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DUPLICATE -> 0;
            case READONLY -> 1;
            case WRITABLE -> 2;
            case READONLY_MAY_MAKE_WRITABLE -> 3;
        };
    }

}
