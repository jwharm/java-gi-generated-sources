package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CallbackAnimationTargetClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwCallbackAnimationTargetClass";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static CallbackAnimationTargetClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CallbackAnimationTargetClass newInstance = new CallbackAnimationTargetClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public CallbackAnimationTargetClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
