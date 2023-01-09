package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MIKEYEncryptInfo extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYEncryptInfo";
    
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
     * Allocate a new {@link MIKEYEncryptInfo}
     * @return A new, uninitialized @{link MIKEYEncryptInfo}
     */
    public static MIKEYEncryptInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MIKEYEncryptInfo newInstance = new MIKEYEncryptInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MIKEYEncryptInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MIKEYEncryptInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MIKEYEncryptInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MIKEYEncryptInfo(input);
}
