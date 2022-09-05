package org.harfbuzz;

/**
 * Flags that control what glyph information are serialized in hb_buffer_serialize_glyphs().
 */
public class BufferSerializeFlagsT {

    /**
     * serialize glyph names, clusters and positions.
     */
    public static final int DEFAULT = 0;
    
    /**
     * do not serialize glyph cluster.
     */
    public static final int NO_CLUSTERS = 1;
    
    /**
     * do not serialize glyph position information.
     */
    public static final int NO_POSITIONS = 2;
    
    /**
     * do no serialize glyph name.
     */
    public static final int NO_GLYPH_NAMES = 4;
    
    /**
     * serialize glyph extents.
     */
    public static final int GLYPH_EXTENTS = 8;
    
    /**
     * serialize glyph flags. Since: 1.5.0
     */
    public static final int GLYPH_FLAGS = 16;
    
    /**
     * do not serialize glyph advances,
     *  glyph offsets will reflect absolute glyph positions. Since: 1.8.0
     */
    public static final int NO_ADVANCES = 32;
    
}
