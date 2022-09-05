package org.harfbuzz;

/**
 * The buffer serialization and de-serialization format used in
 * hb_buffer_serialize_glyphs() and hb_buffer_deserialize_glyphs().
 */
public enum BufferSerializeFormatT {

    /**
     * a human-readable, plain text format.
     */
    TEXT,
    
    /**
     * a machine-readable JSON format.
     */
    JSON,
    
    /**
     * invalid format.
     */
    INVALID;
    
    public static BufferSerializeFormatT fromValue(int value) {
        return switch(value) {
            case 1413830740 -> TEXT;
            case 1246973774 -> JSON;
            case 0 -> INVALID;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case TEXT -> 1413830740;
            case JSON -> 1246973774;
            case INVALID -> 0;
        };
    }

}
