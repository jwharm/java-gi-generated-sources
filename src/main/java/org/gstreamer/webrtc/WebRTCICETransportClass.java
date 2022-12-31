package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCICETransportClass extends Struct {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCICETransportClass";
    
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
     * Allocate a new {@link WebRTCICETransportClass}
     * @return A new, uninitialized @{link WebRTCICETransportClass}
     */
    public static WebRTCICETransportClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        WebRTCICETransportClass newInstance = new WebRTCICETransportClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a WebRTCICETransportClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected WebRTCICETransportClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, WebRTCICETransportClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCICETransportClass(input, ownership);
}
