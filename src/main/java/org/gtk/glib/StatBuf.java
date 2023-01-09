package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A type corresponding to the appropriate struct type for the stat()
 * system call, depending on the platform and/or compiler being used.
 * <p>
 * See g_stat() for more information.
 */
public class StatBuf extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GStatBuf";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link StatBuf}
     * @return A new, uninitialized @{link StatBuf}
     */
    public static StatBuf allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        StatBuf newInstance = new StatBuf(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a StatBuf proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected StatBuf(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, StatBuf> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new StatBuf(input);
}
