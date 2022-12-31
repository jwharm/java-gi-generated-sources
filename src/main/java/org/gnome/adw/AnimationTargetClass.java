package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AnimationTargetClass extends Struct {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwAnimationTargetClass";
    
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
     * Allocate a new {@link AnimationTargetClass}
     * @return A new, uninitialized @{link AnimationTargetClass}
     */
    public static AnimationTargetClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AnimationTargetClass newInstance = new AnimationTargetClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AnimationTargetClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AnimationTargetClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AnimationTargetClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AnimationTargetClass(input, ownership);
}
