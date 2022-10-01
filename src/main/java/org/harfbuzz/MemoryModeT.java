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
public class MemoryModeT extends io.github.jwharm.javagi.Enumeration {

    /**
     * HarfBuzz immediately makes a copy of the data.
     */
    public static final MemoryModeT DUPLICATE = new MemoryModeT(0);
    
    /**
     * HarfBuzz client will never modify the data,
     *     and HarfBuzz will never modify the data.
     */
    public static final MemoryModeT READONLY = new MemoryModeT(1);
    
    /**
     * HarfBuzz client made a copy of the data solely
     *     for HarfBuzz, so HarfBuzz may modify the data.
     */
    public static final MemoryModeT WRITABLE = new MemoryModeT(2);
    
    /**
     * See above
     */
    public static final MemoryModeT READONLY_MAY_MAKE_WRITABLE = new MemoryModeT(3);
    
    public MemoryModeT(int value) {
        super(value);
    }
    
}
