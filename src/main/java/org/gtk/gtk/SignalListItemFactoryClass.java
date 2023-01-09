package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SignalListItemFactoryClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSignalListItemFactoryClass";
    
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
     * Allocate a new {@link SignalListItemFactoryClass}
     * @return A new, uninitialized @{link SignalListItemFactoryClass}
     */
    public static SignalListItemFactoryClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SignalListItemFactoryClass newInstance = new SignalListItemFactoryClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SignalListItemFactoryClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SignalListItemFactoryClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SignalListItemFactoryClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SignalListItemFactoryClass(input);
}
