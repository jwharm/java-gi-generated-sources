package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioAggregatorConvertPadPrivate extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioAggregatorConvertPadPrivate";
    
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
     * Allocate a new {@link AudioAggregatorConvertPadPrivate}
     * @return A new, uninitialized @{link AudioAggregatorConvertPadPrivate}
     */
    public static AudioAggregatorConvertPadPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AudioAggregatorConvertPadPrivate newInstance = new AudioAggregatorConvertPadPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AudioAggregatorConvertPadPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioAggregatorConvertPadPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioAggregatorConvertPadPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioAggregatorConvertPadPrivate(input);
}
