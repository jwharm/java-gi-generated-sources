package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The buffer serialization and de-serialization format used in
 * hb_buffer_serialize_glyphs() and hb_buffer_deserialize_glyphs().
 * @version 0.9.2
 */
public class BufferSerializeFormatT extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "hb_buffer_serialize_format_t";
    
    /**
     * a human-readable, plain text format.
     */
    public static final BufferSerializeFormatT TEXT = new BufferSerializeFormatT(1413830740);
    
    /**
     * a machine-readable JSON format.
     */
    public static final BufferSerializeFormatT JSON = new BufferSerializeFormatT(1246973774);
    
    /**
     * invalid format.
     */
    public static final BufferSerializeFormatT INVALID = new BufferSerializeFormatT(0);
    
    public BufferSerializeFormatT(int value) {
        super(value);
    }
}
