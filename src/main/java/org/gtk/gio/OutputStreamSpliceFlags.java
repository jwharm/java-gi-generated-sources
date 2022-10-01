package org.gtk.gio;

/**
 * GOutputStreamSpliceFlags determine how streams should be spliced.
 */
public class OutputStreamSpliceFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * Do not close either stream.
     */
    public static final OutputStreamSpliceFlags NONE = new OutputStreamSpliceFlags(0);
    
    /**
     * Close the source stream after
     *     the splice.
     */
    public static final OutputStreamSpliceFlags CLOSE_SOURCE = new OutputStreamSpliceFlags(1);
    
    /**
     * Close the target stream after
     *     the splice.
     */
    public static final OutputStreamSpliceFlags CLOSE_TARGET = new OutputStreamSpliceFlags(2);
    
    public OutputStreamSpliceFlags(int value) {
        super(value);
    }
    
}
