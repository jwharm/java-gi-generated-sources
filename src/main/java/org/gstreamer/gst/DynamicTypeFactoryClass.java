package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DynamicTypeFactoryClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDynamicTypeFactoryClass";
    
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
     * Allocate a new {@link DynamicTypeFactoryClass}
     * @return A new, uninitialized @{link DynamicTypeFactoryClass}
     */
    public static DynamicTypeFactoryClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DynamicTypeFactoryClass newInstance = new DynamicTypeFactoryClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DynamicTypeFactoryClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DynamicTypeFactoryClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DynamicTypeFactoryClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DynamicTypeFactoryClass(input);
}
