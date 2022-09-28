package org.harfbuzz;

/**
 * The type of {@link buffer_t} contents.
 */
public class BufferContentTypeT extends io.github.jwharm.javagi.Enumeration {

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
