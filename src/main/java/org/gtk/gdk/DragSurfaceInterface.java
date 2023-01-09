package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GdkDragSurfaceInterface} implementation is private to GDK.
 */
public class DragSurfaceInterface extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDragSurfaceInterface";
    
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
     * Allocate a new {@link DragSurfaceInterface}
     * @return A new, uninitialized @{link DragSurfaceInterface}
     */
    public static DragSurfaceInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DragSurfaceInterface newInstance = new DragSurfaceInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DragSurfaceInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DragSurfaceInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DragSurfaceInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DragSurfaceInterface(input);
}
