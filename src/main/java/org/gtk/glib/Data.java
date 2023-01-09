package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque data structure that represents a keyed data list.
 * <p>
 * See also: [Keyed data lists][glib-Keyed-Data-Lists].
 */
public class Data extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GData";
    
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
     * Allocate a new {@link Data}
     * @return A new, uninitialized @{link Data}
     */
    public static Data allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Data newInstance = new Data(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Data proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Data(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Data> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Data(input);
}
