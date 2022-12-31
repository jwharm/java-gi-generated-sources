package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SpringAnimationClass extends Struct {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwSpringAnimationClass";
    
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
     * Allocate a new {@link SpringAnimationClass}
     * @return A new, uninitialized @{link SpringAnimationClass}
     */
    public static SpringAnimationClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SpringAnimationClass newInstance = new SpringAnimationClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SpringAnimationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SpringAnimationClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SpringAnimationClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SpringAnimationClass(input, ownership);
}
