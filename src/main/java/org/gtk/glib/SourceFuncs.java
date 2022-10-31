package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GSourceFuncs} struct contains a table of
 * functions used to handle event sources in a generic manner.
 * <p>
 * For idle sources, the prepare and check functions always return {@code true}
 * to indicate that the source is always ready to be processed. The prepare
 * function also returns a timeout value of 0 to ensure that the poll() call
 * doesn't block (since that would be time wasted which could have been spent
 * running the idle function).
 * <p>
 * For timeout sources, the prepare and check functions both return {@code true}
 * if the timeout interval has expired. The prepare function also returns
 * a timeout value to ensure that the poll() call doesn't block too long
 * and miss the next timeout.
 * <p>
 * For file descriptor sources, the prepare function typically returns {@code false},
 * since it must wait until poll() has been called before it knows whether
 * any events need to be processed. It sets the returned timeout to -1 to
 * indicate that it doesn't mind how long the poll() call blocks. In the
 * check function, it tests the results of the poll() call to see if the
 * required condition has been met, and returns {@code true} if so.
 */
public class SourceFuncs extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSourceFuncs";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("prepare"),
        Interop.valueLayout.ADDRESS.withName("check"),
        Interop.valueLayout.ADDRESS.withName("dispatch"),
        Interop.valueLayout.ADDRESS.withName("finalize"),
        Interop.valueLayout.ADDRESS.withName("closure_callback"),
        Interop.valueLayout.ADDRESS.withName("closure_marshal")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static SourceFuncs allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SourceFuncs newInstance = new SourceFuncs(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public SourceFuncs(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
