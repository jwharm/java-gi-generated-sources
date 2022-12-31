package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DropTargetAsyncClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDropTargetAsyncClass";
    
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
     * Allocate a new {@link DropTargetAsyncClass}
     * @return A new, uninitialized @{link DropTargetAsyncClass}
     */
    public static DropTargetAsyncClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DropTargetAsyncClass newInstance = new DropTargetAsyncClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DropTargetAsyncClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DropTargetAsyncClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DropTargetAsyncClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DropTargetAsyncClass(input, ownership);
}
