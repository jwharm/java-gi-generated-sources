package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class InterpolationControlSourcePrivate extends Struct {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstInterpolationControlSourcePrivate";
    
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
     * Allocate a new {@link InterpolationControlSourcePrivate}
     * @return A new, uninitialized @{link InterpolationControlSourcePrivate}
     */
    public static InterpolationControlSourcePrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        InterpolationControlSourcePrivate newInstance = new InterpolationControlSourcePrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a InterpolationControlSourcePrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected InterpolationControlSourcePrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, InterpolationControlSourcePrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new InterpolationControlSourcePrivate(input);
}
