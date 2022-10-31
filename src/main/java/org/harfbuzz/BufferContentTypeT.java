package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of {@link BufferT} contents.
 */
public class BufferContentTypeT extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "hb_buffer_content_type_t";
    
    /**
     * Initial value for new buffer.
     */
    public static final BufferContentTypeT INVALID = new BufferContentTypeT(0);
    
    /**
     * The buffer contains input characters (before shaping).
     */
    public static final BufferContentTypeT UNICODE = new BufferContentTypeT(1);
    
    /**
     * The buffer contains output glyphs (after shaping).
     */
    public static final BufferContentTypeT GLYPHS = new BufferContentTypeT(2);
    
    public BufferContentTypeT(int value) {
        super(value);
    }
}
