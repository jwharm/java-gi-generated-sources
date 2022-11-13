package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A table of functions used to handle different types of {@link IOChannel}
 * in a generic way.
 */
public class IOFuncs extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOFuncs";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("io_read"),
        Interop.valueLayout.ADDRESS.withName("io_write"),
        Interop.valueLayout.ADDRESS.withName("io_seek"),
        Interop.valueLayout.ADDRESS.withName("io_close"),
        Interop.valueLayout.ADDRESS.withName("io_create_watch"),
        Interop.valueLayout.ADDRESS.withName("io_free"),
        Interop.valueLayout.ADDRESS.withName("io_set_flags"),
        Interop.valueLayout.ADDRESS.withName("io_get_flags")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static IOFuncs allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IOFuncs newInstance = new IOFuncs(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IOFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IOFuncs(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
