package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The rectangle representing the area allocated for a widget by its parent.
 */
public class Allocation extends org.gtk.gdk.Rectangle {
    
    /**
     * Create a Allocation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Allocation(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Allocation> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Allocation(input);
}
