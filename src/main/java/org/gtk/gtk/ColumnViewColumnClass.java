package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ColumnViewColumnClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkColumnViewColumnClass";
    
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
     * Allocate a new {@link ColumnViewColumnClass}
     * @return A new, uninitialized @{link ColumnViewColumnClass}
     */
    public static ColumnViewColumnClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ColumnViewColumnClass newInstance = new ColumnViewColumnClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ColumnViewColumnClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ColumnViewColumnClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ColumnViewColumnClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ColumnViewColumnClass(input);
}
