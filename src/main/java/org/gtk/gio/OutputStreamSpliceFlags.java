package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GOutputStreamSpliceFlags determine how streams should be spliced.
 */
public class OutputStreamSpliceFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
