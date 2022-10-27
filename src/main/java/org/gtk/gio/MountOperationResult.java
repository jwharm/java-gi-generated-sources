package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MountOperationResult} is returned as a result when a request for
 * information is send by the mounting operation.
 */
public class MountOperationResult extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The request was fulfilled and the
     *     user specified data is now available
     */
    public static final MountOperationResult HANDLED = new MountOperationResult(0);
    
    /**
     * The user requested the mount operation
     *     to be aborted
     */
    public static final MountOperationResult ABORTED = new MountOperationResult(1);
    
    /**
     * The request was unhandled (i.e. not
     *     implemented)
     */
    public static final MountOperationResult UNHANDLED = new MountOperationResult(2);
    
    public MountOperationResult(int value) {
        super(value);
    }
}
