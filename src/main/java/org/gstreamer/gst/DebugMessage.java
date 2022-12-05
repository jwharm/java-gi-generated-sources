package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DebugMessage extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDebugMessage";
    
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
     * Allocate a new {@link DebugMessage}
     * @return A new, uninitialized @{link DebugMessage}
     */
    public static DebugMessage allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DebugMessage newInstance = new DebugMessage(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DebugMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DebugMessage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Gets the string representation of a {@link DebugMessage}. This function is used
     * in debug handlers to extract the message.
     * @return the string representation of a {@link DebugMessage}.
     */
    public @Nullable java.lang.String get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_debug_message_get.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_debug_message_get = Interop.downcallHandle(
            "gst_debug_message_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
