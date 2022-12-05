package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestClockPrivate extends Struct {
    
    static {
        GstCheck.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTestClockPrivate";
    
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
     * Allocate a new {@link TestClockPrivate}
     * @return A new, uninitialized @{link TestClockPrivate}
     */
    public static TestClockPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TestClockPrivate newInstance = new TestClockPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TestClockPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TestClockPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
