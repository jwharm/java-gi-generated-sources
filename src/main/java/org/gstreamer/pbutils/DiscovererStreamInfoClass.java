package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DiscovererStreamInfoClass extends org.gtk.gobject.ObjectClass {
    
    /**
     * Create a DiscovererStreamInfoClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DiscovererStreamInfoClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DiscovererStreamInfoClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DiscovererStreamInfoClass(input, ownership);
}