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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PropertyAnimationTargetClass newInstance = new PropertyAnimationTargetClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PropertyAnimationTargetClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PropertyAnimationTargetClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PropertyAnimationTargetClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PropertyAnimationTargetClass(input);
}
