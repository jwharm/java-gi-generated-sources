package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GIOStreamSpliceFlags determine how streams should be spliced.
 * @version 2.28
 */
public class IOStreamSpliceFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GIOStreamSpliceFlags";
    
    /**
     * Do not close either stream.
     */
    public static final IOStreamSpliceFlags NONE = new IOStreamSpliceFlags(0);
    
    /**
     * Close the first stream after
     *     the splice.
     */
    public static final IOStreamSpliceFlags CLOSE_STREAM1 = new IOStreamSpliceFlags(1);
    
    /**
     * Close the second stream after
     *     the splice.
     */
    public static final IOStreamSpliceFlags CLOSE_STREAM2 = new IOStreamSpliceFlags(2);
    
    /**
     * Wait for both splice operations to finish
     *     before calling the callback.
     */
    public static final IOStreamSpliceFlags WAIT_FOR_BOTH = new IOStreamSpliceFlags(4);
    
    public IOStreamSpliceFlags(int value) {
        super(value);
    }
}
