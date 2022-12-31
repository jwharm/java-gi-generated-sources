package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DiscovererAudioInfoClass extends org.gtk.gobject.ObjectClass {
    
    /**
     * Create a DiscovererAudioInfoClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DiscovererAudioInfoClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DiscovererAudioInfoClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DiscovererAudioInfoClass(input, ownership);
}