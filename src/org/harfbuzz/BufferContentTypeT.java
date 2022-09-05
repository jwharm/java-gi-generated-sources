package org.harfbuzz;

/**
 * The type of #hb_buffer_t contents.
 */
public enum BufferContentTypeT {

    /**
     * Initial value for new buffer.
     */
    INVALID,
    
    /**
     * The buffer contains input characters (before shaping).
     */
    UNICODE,
    
    /**
     * The buffer contains output glyphs (after shaping).
     */
    GLYPHS;
    
    public static BufferContentTypeT fromValue(int value) {
        return switch(value) {
            case 0 -> INVALID;
            case 1 -> UNICODE;
            case 2 -> GLYPHS;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case UNICODE -> 1;
            case GLYPHS -> 2;
        };
    }

}
