package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AnimationClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwAnimationClass";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static AnimationClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AnimationClass newInstance = new AnimationClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AnimationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AnimationClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}