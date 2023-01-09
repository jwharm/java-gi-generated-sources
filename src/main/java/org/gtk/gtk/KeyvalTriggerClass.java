package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class KeyvalTriggerClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkKeyvalTriggerClass";
    
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
     * Allocate a new {@link KeyvalTriggerClass}
     * @return A new, uninitialized @{link KeyvalTriggerClass}
     */
    public static KeyvalTriggerClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        KeyvalTriggerClass newInstance = new KeyvalTriggerClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a KeyvalTriggerClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected KeyvalTriggerClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, KeyvalTriggerClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new KeyvalTriggerClass(input);
}
