package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DiscovererSubtitleInfoClass extends org.gtk.gobject.ObjectClass {
    
    /**
     * Create a DiscovererSubtitleInfoClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DiscovererSubtitleInfoClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DiscovererSubtitleInfoClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DiscovererSubtitleInfoClass(input);
}
