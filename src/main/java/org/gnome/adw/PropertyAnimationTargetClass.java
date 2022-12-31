package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PropertyAnimationTargetClass extends Struct {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwPropertyAnimationTargetClass";
    
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
     * Allocate a new {@link PropertyAnimationTargetClass}
     * @return A new, uninitialized @{link PropertyAnimationTargetClass}
     */
    public static PropertyAnimationTargetClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PropertyAnimationTargetClass newInstance = new PropertyAnimationTargetClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PropertyAnimationTargetClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PropertyAnimationTargetClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PropertyAnimationTargetClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PropertyAnimationTargetClass(input, ownership);
}
