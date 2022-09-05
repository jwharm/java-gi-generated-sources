package org.gtk.gio;

/**
 * GIOStreamSpliceFlags determine how streams should be spliced.
 */
public class IOStreamSpliceFlags {

    /**
     * Do not close either stream.
     */
    public static final int NONE = 0;
    
    /**
     * Close the first stream after
     *     the splice.
     */
    public static final int CLOSE_STREAM1 = 1;
    
    /**
     * Close the second stream after
     *     the splice.
     */
    public static final int CLOSE_STREAM2 = 2;
    
    /**
     * Wait for both splice operations to finish
     *     before calling the callback.
     */
    public static final int WAIT_FOR_BOTH = 4;
    
}
