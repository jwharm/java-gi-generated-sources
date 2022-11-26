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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Allocation(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
