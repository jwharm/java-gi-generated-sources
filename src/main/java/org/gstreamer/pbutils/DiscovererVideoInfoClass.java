package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DiscovererVideoInfoClass extends org.gtk.gobject.ObjectClass {
    
    /**
     * Create a DiscovererVideoInfoClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DiscovererVideoInfoClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DiscovererVideoInfoClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DiscovererVideoInfoClass(input, ownership);
}
