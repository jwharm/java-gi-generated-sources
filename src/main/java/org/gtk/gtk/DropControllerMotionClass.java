package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DropControllerMotionClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDropControllerMotionClass";
    
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
     * Allocate a new {@link DropControllerMotionClass}
     * @return A new, uninitialized @{link DropControllerMotionClass}
     */
    public static DropControllerMotionClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DropControllerMotionClass newInstance = new DropControllerMotionClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DropControllerMotionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DropControllerMotionClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DropControllerMotionClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DropControllerMotionClass(input);
}
