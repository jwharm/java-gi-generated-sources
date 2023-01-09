package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MIKEYDecryptInfo extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYDecryptInfo";
    
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
     * Allocate a new {@link MIKEYDecryptInfo}
     * @return A new, uninitialized @{link MIKEYDecryptInfo}
     */
    public static MIKEYDecryptInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MIKEYDecryptInfo newInstance = new MIKEYDecryptInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MIKEYDecryptInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MIKEYDecryptInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MIKEYDecryptInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MIKEYDecryptInfo(input);
}
