package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that control what glyph information are serialized in hb_buffer_serialize_glyphs().
 * @version 0.9.20
 */
public class BufferSerializeFlagsT extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "hb_buffer_serialize_flags_t";
    
    /**
     * serialize glyph names, clusters and positions.
     */
    public static final BufferSerializeFlagsT DEFAULT = new BufferSerializeFlagsT(0);
    
    /**
     * do not serialize glyph cluster.
     */
    public static final BufferSerializeFlagsT NO_CLUSTERS = new BufferSerializeFlagsT(1);
    
    /**
     * do not serialize glyph position information.
     */
    public static final BufferSerializeFlagsT NO_POSITIONS = new BufferSerializeFlagsT(2);
    
    /**
     * do no serialize glyph name.
     */
    public static final BufferSerializeFlagsT NO_GLYPH_NAMES = new BufferSerializeFlagsT(4);
    
    /**
     * serialize glyph extents.
     */
    public static final BufferSerializeFlagsT GLYPH_EXTENTS = new BufferSerializeFlagsT(8);
    
    /**
     * serialize glyph flags. Since: 1.5.0
     */
    public static final BufferSerializeFlagsT GLYPH_FLAGS = new BufferSerializeFlagsT(16);
    
    /**
     * do not serialize glyph advances,
     *  glyph offsets will reflect absolute glyph positions. Since: 1.8.0
     */
    public static final BufferSerializeFlagsT NO_ADVANCES = new BufferSerializeFlagsT(32);
    
    /**
     * All currently defined flags. Since: 4.4.0
     */
    public static final BufferSerializeFlagsT DEFINED = new BufferSerializeFlagsT(63);
    
    /**
     * Create a new BufferSerializeFlagsT with the provided value
     */
    public BufferSerializeFlagsT(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BufferSerializeFlagsT or(BufferSerializeFlagsT... masks) {
        int value = this.getValue();
        for (BufferSerializeFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new BufferSerializeFlagsT(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BufferSerializeFlagsT combined(BufferSerializeFlagsT mask, BufferSerializeFlagsT... masks) {
        int value = mask.getValue();
        for (BufferSerializeFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new BufferSerializeFlagsT(value);
    }
}
