package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CallbackAnimationTargetClass extends Struct {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwCallbackAnimationTargetClass";
    
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
     * Allocate a new {@link CallbackAnimationTargetClass}
     * @return A new, uninitialized @{link CallbackAnimationTargetClass}
     */
    public static CallbackAnimationTargetClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CallbackAnimationTargetClass newInstance = new CallbackAnimationTargetClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CallbackAnimationTargetClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CallbackAnimationTargetClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CallbackAnimationTargetClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CallbackAnimationTargetClass(input);
}
