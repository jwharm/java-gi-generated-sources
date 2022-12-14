package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioBaseSinkPrivate extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioBaseSinkPrivate";
    
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
     * Allocate a new {@link AudioBaseSinkPrivate}
     * @return A new, uninitialized @{link AudioBaseSinkPrivate}
     */
    public static AudioBaseSinkPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AudioBaseSinkPrivate newInstance = new AudioBaseSinkPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AudioBaseSinkPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioBaseSinkPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioBaseSinkPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioBaseSinkPrivate(input);
}
