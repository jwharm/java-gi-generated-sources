package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DiscovererInfoClass extends org.gtk.gobject.ObjectClass {
    
    /**
     * Create a DiscovererInfoClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DiscovererInfoClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
