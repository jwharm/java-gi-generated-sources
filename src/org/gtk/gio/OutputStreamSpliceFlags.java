package org.gtk.gio;

/**
 * GOutputStreamSpliceFlags determine how streams should be spliced.
 */
public class OutputStreamSpliceFlags {

    /**
     * Do not close either stream.
     */
    public static final int NONE = 0;
    
    /**
     * Close the source stream after
     *     the splice.
     */
    public static final int CLOSE_SOURCE = 1;
    
    /**
     * Close the target stream after
     *     the splice.
     */
    public static final int CLOSE_TARGET = 2;
    
}
