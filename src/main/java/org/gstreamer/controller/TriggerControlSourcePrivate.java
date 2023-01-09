package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TriggerControlSourcePrivate extends Struct {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTriggerControlSourcePrivate";
    
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
     * Allocate a new {@link TriggerControlSourcePrivate}
     * @return A new, uninitialized @{link TriggerControlSourcePrivate}
     */
    public static TriggerControlSourcePrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TriggerControlSourcePrivate newInstance = new TriggerControlSourcePrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TriggerControlSourcePrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TriggerControlSourcePrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TriggerControlSourcePrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TriggerControlSourcePrivate(input);
}
