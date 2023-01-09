package org.gstreamer.badaudio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlanarAudioAdapterClass extends Struct {
    
    static {
        GstBadAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlanarAudioAdapterClass";
    
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
     * Allocate a new {@link PlanarAudioAdapterClass}
     * @return A new, uninitialized @{link PlanarAudioAdapterClass}
     */
    public static PlanarAudioAdapterClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PlanarAudioAdapterClass newInstance = new PlanarAudioAdapterClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlanarAudioAdapterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PlanarAudioAdapterClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlanarAudioAdapterClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PlanarAudioAdapterClass(input);
}
